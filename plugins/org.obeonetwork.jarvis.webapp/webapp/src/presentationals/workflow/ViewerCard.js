import React from "react";

import { Card, Body, Header, List, Item, ItemText, Title } from "../cards/Card";

const ViewerCard = (props) => {
  return (
    <Card className='viewer-card'>
      <Header>
        <Title>Representations Viewer</Title>
      </Header>
      <Body>
        <List>
          <Item><ItemText>Capture</ItemText></Item>
          <Item><ItemText>Design</ItemText></Item>
          <Item><ItemText>Analysis</ItemText></Item>
          <Item><ItemText>Documentation</ItemText></Item>
          <Item><ItemText>Review</ItemText></Item>
        </List>
      </Body>
    </Card>
  );
};

export default ViewerCard;