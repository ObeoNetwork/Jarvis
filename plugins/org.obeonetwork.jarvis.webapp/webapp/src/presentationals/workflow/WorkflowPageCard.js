import React, { Component } from 'react';
import { withRouter } from 'react-router-dom'

import { Action, Body, Card, Footer, Header, Subtitle, Title } from "../cards/Card";

import './WorkflowPageCard.css';

class WorkflowPageCard extends Component {
  constructor(props) {
    super(props);
    this.handleView = this.handleView.bind(this);
  }

  render() {
    return (
      <Card className="workflow-page-card">
        <Header>
          <Title>{this.props.page.title}</Title>
          <Subtitle>Workflow</Subtitle>
        </Header>
        <Body>
          {this.props.page.description}
        </Body>
        <Footer>
          <Action handleClick={this.handleView}>View</Action>
        </Footer>
      </Card>
    );
  }

  handleView() {
    this.props.history.push(`/sessions/${this.props.sessionId}/workflow/pages/${this.props.page.pageId}`);
  }
};

export default withRouter(WorkflowPageCard);