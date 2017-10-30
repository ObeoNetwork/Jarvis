import React from 'react';

import { Body, Card, Header, Title } from "../cards/Card";

import './WorkflowPageCard.css';

import pageImage from './page.svg';

const WorkflowPageCard = (props) => {
  return (
    <Card className="workflow-page-card">
      <Header>
        <Title>{props.page.title}</Title>
      </Header>
      <Body>
        <img src={pageImage} alt='Illustration the workflow page'/>
      </Body>
    </Card>
  );
};

export default WorkflowPageCard;