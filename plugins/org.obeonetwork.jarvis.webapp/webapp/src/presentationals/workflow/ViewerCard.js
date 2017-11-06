import React, { Component } from "react";

import { Card, Body, Divider, Header, List, Item, ItemImgAvatar, ItemLink, Title } from "../cards/Card";

import diagramImage from './DDiagram.gif';

class ViewerCard extends Component {
  constructor(props) {
    super(props);
    this.handleClick = this.handleClick.bind(this);
  }

  render() {
    return (
      <Card className='viewer-card'>
        <Header>
          <Title>Representations Viewer</Title>
        </Header>
        <Divider/>
        <Body>
          <List>
            {Object.entries(this.props.representations).map(representationEntry => {
              return (
                <Item key={representationEntry[0]}>
                  <ItemImgAvatar src={diagramImage} alt='The type of the representation' />
                  <ItemLink onClick={() => this.handleClick(representationEntry[1].representationId)}>{representationEntry[1].label}</ItemLink>
                </Item>
              );
            })}
          </List>
        </Body>
      </Card>
    );
  }

  handleClick(representationId) {
    this.props.onRepresentationClick(representationId);
  }
};

export default ViewerCard;