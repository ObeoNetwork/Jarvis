import React, { Component } from 'react';
import { Link } from "react-router-dom";

import View from "../../presentationals/app/View";
import WorkflowPageCard from "../../presentationals/workflow/WorkflowPageCard";

import './WorkflowViewContainer.css';

class WorkflowViewContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoading: true
    };
  }

  componentDidMount() {
    this.setState((prevState, props) => {
      return {
        isLoading: false,
        sessionId: 'test',
        workflow: {
          pages: [
            { pageId: 1, title: 'Overview', description: 'Description of the page' },
            { pageId: 2, title: 'Analyze', description: 'Description of the page' },
            { pageId: 3, title: 'Review', description: 'Description of the page' },
            { pageId: 4, title: 'Documentation', description: 'Description of the page' },
            { pageId: 5, title: 'Planning', description: 'Description of the page' },
            { pageId: 5, title: 'Evaluation', description: 'Description of the page' },
            { pageId: 7, title: 'Publication', description: 'Description of the page' },
            { pageId: 8, title: 'Deployment', description: 'Description of the page' }
          ]
        }
      };
    });
  }

  render() {
    if (this.state.isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <View className='workflow-view' title='Workflow'>
        <div className='workflow-view__container'>
          {Object.entries(this.state.workflow.pages).map(pageEntry => {
            return (
              <Link key={pageEntry[0]} to={`/sessions/${this.props.match.params.sessionId}/workflow/pages/${pageEntry[1].pageId}`}>
                <WorkflowPageCard sessionId={this.state.sessionId} page={pageEntry[1]} />
              </Link>
            );
          })}
        </div>
      </View>
    );
  }
};

export default WorkflowViewContainer;