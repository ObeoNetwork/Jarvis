import React, { Component } from 'react';
import { Link } from "react-router-dom";

import View from "../../presentationals/app/View";
import WorkflowSectionCard from "../../presentationals/workflow/WorkflowSectionCard";

import './WorkflowPageViewContainer.css';

class WorkflowPageViewContainer extends Component {
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
        page: {
          pageId: 1,
          title: 'Page 1',
          description: 'Description of the page',
          sections: [
            { sectionId: 1, title: 'Section 1', activities: [ { activityId: 1, title: 'Open Diagram' }, { activityId: 2, title: 'Create Activity Diagram' }, { activityId: 3, title: 'Create Component Diagram' }, { activityId: 4, title: 'Create Class Diagram' } ] },
            { sectionId: 2, title: 'Section 2', activities: [ { activityId: 3, title: 'Open Diagram' }, { activityId: 4, title: 'Create Diagram' } ] },
            { sectionId: 3, title: 'Section 3', activities: [ { activityId: 5, title: 'Open Diagram' }, { activityId: 6, title: 'Create Diagram' } ] },
            { sectionId: 4, title: 'Section 4', activities: [ { activityId: 7, title: 'Open Diagram' }, { activityId: 8, title: 'Create Diagram' } ] },
            { sectionId: 5, title: 'Section 5', activities: [ { activityId: 7, title: 'Open Diagram' }, { activityId: 8, title: 'Create Diagram' } ] },
            { sectionId: 6, title: 'Section 6', activities: [ { activityId: 7, title: 'Open Diagram' }, { activityId: 8, title: 'Create Diagram' } ] }
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
      <View className='workflow-page-view' title={this.state.page.title}>
        <Link to={`/sessions/${this.props.match.params.sessionId}/workflow`}>Back to the workflow</Link>
        <div className='workflow-page-view__container'>
          <div className='workflow-page-view__sections'>
            {Object.entries(this.state.page.sections).map(sectionEntry => {
              return <WorkflowSectionCard key={sectionEntry[0]} section={sectionEntry[1]}/>
            })}
          </div>

          <div className='workflow-page-view__viewer'>
            Viewer
          </div>
        </div>
      </View>
    );
  }
};

export default WorkflowPageViewContainer;