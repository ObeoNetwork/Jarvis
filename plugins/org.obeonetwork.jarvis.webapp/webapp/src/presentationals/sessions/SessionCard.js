import React from 'react';

import { Body, Card, Header, Title } from "../cards/Card";

import './SessionCard.css';

import sessionImage from './session.svg';

const SessionCard = (props) => {
  return (
    <Card className="session-card">
      <Header>
        <Title>{props.session.title}</Title>
      </Header>
      <Body>
        <img src={sessionImage} alt='Illustration the session'/>
      </Body>
    </Card>
  );
};

export default SessionCard;