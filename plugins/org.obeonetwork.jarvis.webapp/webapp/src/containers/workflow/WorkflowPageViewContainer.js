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

  componentDidMount() {
    fetch(`/api/sessions/${this.props.match.params.sessionId}/workflow/pages/${this.props.match.params.pageId}`)
      .then(response => response.json())
      .then(response => this.setState((prevState, props) => {
        return {
          isLoading: false,
          page: response
        };
      }))
      .catch(err => console.warn(err));

    fetch(`/api/sessions/${this.props.match.params.sessionId}/representations/`)
      .then(response => response.json())
      .then(response => {
        this.setState((prevState, props) => {
          return {
            representations: response.representations
          };
        });
      }).catch(err => console.warn(err));
  }

  render() {
    let viewer;
    if (this.state.isLoading) {
      return <p>Loading...</p>;
    }
    if (this.state.representations) {
      viewer = <ViewerCard representations={this.state.representations} onRepresentationClick={this.handleRepresentationClick}/>;
    }
    return (
      <View className='workflow-page-view' title={this.state.page.label}>
        <div className='workflow-page-view__navbar'>
          <button onClick={this.handleGoToWorkflow}>Workflow</button>
          <button onClick={this.handleGoToPreviousPage}>Previous</button>
          <button onClick={this.handleGoToNextPage}>Next</button>
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
    this.props.history.push(`/sessions/${this.props.match.params.sessionId}/workflow`)
  }

  handleGoToPreviousPage() {
    console.log('Go to previous');
  }

  handleGoToNextPage() {
    console.log('Go to next page');
  }

  handleActivityClick(event, activity) {
    console.log(activity);
  }

  handleRepresentationClick(representationId) {
    console.log(representationId);
  }
};

export default withRouter(WorkflowPageViewContainer);