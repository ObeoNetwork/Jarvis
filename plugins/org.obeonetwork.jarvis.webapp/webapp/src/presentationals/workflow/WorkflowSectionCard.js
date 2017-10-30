import React from 'react';

import { Body, Card, Divider, Header, Item, List, Title } from "../cards/Card";

import './WorkflowSectionCard.css';

const WorkflowSectionCard = (props) => {
  return (
    <Card className="workflow-section-card">
      <Header>
        <Title>{props.section.title}</Title>
      </Header>
      <Divider />
      <Body>
        <List>
          {Object.entries(props.section.activities).map(activityEntry => {
            return (
              <Item key={activityEntry[0]}>{activityEntry[1].title}</Item>
            );
          })}
        </List>
      </Body>
    </Card>
  );
};

export default WorkflowSectionCard;