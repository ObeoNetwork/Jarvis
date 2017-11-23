import React, { Component } from 'react';

import { Body, Card, Footer, Header, Subtitle, Title } from '../cards/Card';
import { DefaultButton } from '../buttons/DefaultButton';

import './WorkflowPageCard.css';

class WorkflowPageCard extends Component {
  constructor(props) {
    super(props);
    this.handleView = this.handleView.bind(this);
  }

  render() {
    return (
      <Card className='workflow-page-card'>
        <Header>
          <Title>{this.props.page.label}</Title>
          <Subtitle>Workflow</Subtitle>
        </Header>
        <Body>
          {this.props.page.description}
        </Body>
        <Footer>
          <DefaultButton onClick={this.handleView}>View</DefaultButton>
        </Footer>
      </Card>
    );
  }

  handleView() {
    this.props.handleView(this.props.page.pageId);
  }
};

export default WorkflowPageCard;