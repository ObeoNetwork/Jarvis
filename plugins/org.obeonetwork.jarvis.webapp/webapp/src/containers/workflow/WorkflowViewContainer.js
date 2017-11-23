import React, { Component } from 'react';
import { withRouter } from 'react-router-dom'

import View from "../../components/app/View";
import WorkflowPageCard from "../../components/workflow/WorkflowPageCard";

import './WorkflowViewContainer.css';

class WorkflowViewContainer extends Component {
  constructor(props) {
    super(props);
    this.handleView = this.handleView.bind(this);
    this.state = {
      isLoading: true
    };
  }

  componentDidMount() {
    fetch(`/api/sessions/${this.props.match.params.sessionId}/workflow`)
      .then(response => response.json())
      .then(response => this.setState((prevState, props) => {
        return {
          isLoading: false,
          sessionId: props.match.params.sessionId,
          workflow: response
        };
      }))
      .catch(err => console.warn(err));
  }

  render() {
    let body;
    if (this.state.isLoading) {
      body = <p>Loading...</p>;
    } else if (this.state.error) {
      body = <p>{this.state.error}</p>
    } else {
      body = (
        <div className='workflow-view__container'>
          {Object.entries(this.state.workflow.pages).map(pageEntry => {
            return <WorkflowPageCard key={pageEntry[0]} sessionId={this.state.sessionId} page={pageEntry[1]} handleView={this.handleView} />;
          })}
        </div>
      );
    }

    
    return (
      <View className='workflow-view' title='Workflow'>
        {body}
      </View>
    );
  }

  handleView(pageId) {
    this.props.history.push(`/sessions/${this.props.match.params.sessionId}/workflow/pages/${pageId}`);
  }
};

export default withRouter(WorkflowViewContainer);