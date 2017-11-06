import React from "react";

import { Card, Body, Divider, Header, List, Item, ItemImgAvatar, ItemText, Title } from "../cards/Card";

import diagramImage from './DDiagram.gif';

const ViewerCard = (props) => {
  return (
    <Card className='viewer-card'>
      <Header>
        <Title>Representations Viewer</Title>
      </Header>
      <Divider />
      <Body>
        <List>
          {Object.entries(props.representations).map(representationEntry => {
            return (
              <Item key={representationEntry[0]}>
                <ItemImgAvatar src={diagramImage} alt='The type of the representation' />
                <ItemText onClick={props.handleClick}>{representationEntry[1].label}</ItemText>
              </Item>
            );
          })}
        </List>
      </Body>
    </Card>
  );
};

export default ViewerCard;