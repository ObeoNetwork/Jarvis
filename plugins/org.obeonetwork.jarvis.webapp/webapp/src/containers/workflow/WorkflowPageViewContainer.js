import React, { Component } from 'react';
import { withRouter } from "react-router-dom";

import View from "../../presentationals/app/View";
import ViewerCard from "../../presentationals/workflow/ViewerCard";
import WorkflowSectionCard from "../../presentationals/workflow/WorkflowSectionCard";

import './WorkflowPageViewContainer.css';

class WorkflowPageViewContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoading: true
    };
    this.handleGoToWorkflow = this.handleGoToWorkflow.bind(this);
    this.handleGoToPreviousPage = this.handleGoToPreviousPage.bind(this);
    this.handleGoToNextPage = this.handleGoToNextPage.bind(this);
    this.handleActivityClick = this.handleActivityClick.bind(this);
    this.handleRepresentationClick = this.handleRepresentationClick.bind(this);
  }

  update(props) {
    Promise.all([
      fetch(`/api/sessions/${props.match.params.sessionId}/workflow/pages/${props.match.params.pageId}`),
      fetch(`/api/sessions/${props.match.params.sessionId}/representations/`)
    ])
    .then(responses => Promise.all(responses.map(res => res.json())))
    .then(responses => {
      const page = responses[0];
      const representations = responses[1].representations;

      this.setState((prevState, props) => {
        console.log(responses);
        return {
          isLoading: false,
          page,
          representations
        }
      });
    })
    .catch(errors => console.warn(errors));
  }

  componentWillReceiveProps(nextProps) {
    const locationChanged = nextProps.location !== this.props.location;
    if (locationChanged) {
      // Update the state of the component using the NEXT version of the props with the nex route!!
      this.update(nextProps);
    }
  }

  componentDidMount() {
    this.update(this.props);
  }

  render() {
    let viewer;
    let previousPageButton;
    let nextPageButton;
    if (this.state.isLoading) {
      return <p>Loading...</p>;
    }
    if (this.state.page) {
      if (this.state.page.previousPageId) {
        previousPageButton = <button onClick={this.handleGoToPreviousPage}>Previous</button>;
      }
      if (this.state.page.nextPageId) {
        nextPageButton = <button onClick={this.handleGoToNextPage}>Next</button>;
      }
    }
    if (this.state.representations) {
      viewer = <ViewerCard representations={this.state.representations} onRepresentationClick={this.handleRepresentationClick}/>;
    }
    return (
      <View className='workflow-page-view' title={this.state.page.label}>
        <div className='workflow-page-view__navbar'>
          <button onClick={this.handleGoToWorkflow}>Workflow</button>
          {previousPageButton}
          {nextPageButton}
        </div>
        <div className='workflow-page-view__container'>
          <div className='workflow-page-view__sections'>
            {Object.entries(this.state.page.sections).map(sectionEntry => {
              return <WorkflowSectionCard key={sectionEntry[0]} section={sectionEntry[1]} onActivityClick={this.handleActivityClick}/>
            })}
          </div>

          <div className='workflow-page-view__viewer'>
            {viewer}
          </div>
        </div>
      </View>
    );
  }

  handleGoToWorkflow() {
    this.props.history.push(`/sessions/${this.props.match.params.sessionId}/workflow`);
  }

  handleGoToPreviousPage() {
    this.props.history.push(`/sessions/${this.props.match.params.sessionId}/workflow/pages/${this.state.page.previousPageId}`);
  }

  handleGoToNextPage() {
    this.props.history.push(`/sessions/${this.props.match.params.sessionId}/workflow/pages/${this.state.page.nextPageId}`);
  }

  handleActivityClick(event, activity) {
    const headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const body = JSON.stringify({
      representationId: activity.identifier
    });
    fetch(`/api/sessions/${this.props.match.params.sessionId}/commands/create_representation`, { method: 'POST', body, headers })
      .then(response => console.log('Representation created'))
      .catch(err => console.warn(err));
  }

  handleRepresentationClick(representationId) {
    const headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const body = JSON.stringify({
      representationId
    });
    fetch(`/api/sessions/${this.props.match.params.sessionId}/commands/open_representation`, { method: 'POST', body, headers })
      .then(response => console.log('Representation opened'))
      .catch(err => console.warn(err));
  }
};

export default withRouter(WorkflowPageViewContainer);