import React, { Component } from 'react';

import { Body, Card, Divider, Header, ItemImgAvatar, ItemSvgIcon, Item, ItemText, List, Title } from "../cards/Card";

import createDiagramImage from './DiagramCreationDescription.gif';
import './WorkflowSectionCard.css';

class WorkflowSectionCard extends Component {
  constructor(props) {
    super(props);
    this.handleClick = this.handleClick.bind(this);
  }

  render() {
    return (
      <Card className="workflow-section-card">
        <Header>
          <Title>{this.props.section.title}</Title>
        </Header>
        <Divider />
        <Body>
          <List>
            {Object.entries(this.props.section.activities).map(activityEntry => {
              return (
                <Item key={activityEntry[0]}>
                  <ItemImgAvatar src={createDiagramImage} alt='Create a new diagram' />
                  <ItemText>{activityEntry[1].title}</ItemText>
                  <ItemSvgIcon onClick={(event) => this.handleClick(event, activityEntry[1])}>
                    <path d="M50,5C25.1,5,5,25.1,5,50c0,24.9,20.1,45,45,45s45-20.1,45-45C95,25.1,74.9,5,50,5z M38.8,69.5v-39L72.5,50L38.8,69.5z"/>
                  </ItemSvgIcon>
                </Item>
              );
            })}
          </List>
        </Body>
      </Card>
    );
  }

  handleClick(event, activity) {
    this.props.onActivityClick(event, activity);
  }
};

export default WorkflowSectionCard;