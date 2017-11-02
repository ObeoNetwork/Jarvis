import React from 'react';

import { Body, Card, Divider, Header, ItemIcon, Item, ItemText, List, Title } from "../cards/Card";

import executeImage from './execute.svg';

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
              <Item key={activityEntry[0]}>
                <ItemText>{activityEntry[1].title}</ItemText>
                <ItemIcon src={executeImage} alt='Execute the action'/>
              </Item>
            );
          })}
        </List>
      </Body>
    </Card>
  );
};

export default WorkflowSectionCard;