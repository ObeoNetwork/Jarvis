import React, { Component } from 'react';
import { withRouter } from 'react-router-dom'

import View from "../../presentationals/app/View";
import WorkflowPageCard from "../../presentationals/workflow/WorkflowPageCard";

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
    this.setState((prevState, props) => {
      return {
        isLoading: false,
        sessionId: props.match.params.sessionId,
        workflow: {
          pages: [
            { pageId: 1, title: 'Overview', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 2, title: 'Analyze', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 3, title: 'Review', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 4, title: 'Documentation', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 5, title: 'Planning', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 5, title: 'Evaluation', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 7, title: 'Publication', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' },
            { pageId: 8, title: 'Deployment', description: 'Experiential agile human-centered design earned media prototype user centered design pivot Steve Jobs physical computing disrupt fund user centered design engaging. 360 campaign responsive intuitive user centered design venture capital iterate agile. Bootstrapping thought leader big data SpaceTeam responsive convergence big data user story unicorn pitch deck. Entrepreneur quantitative vs. qualitative co-working SpaceTeam thinker-maker-doer co-working thought leader paradigm physical computing.' }
          ]
        }
      };
    });
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
    this.props.history.push(`/sessions/${this.props.sessionId}/workflow/pages/${pageId}`);
  }
};

export default withRouter(WorkflowViewContainer);