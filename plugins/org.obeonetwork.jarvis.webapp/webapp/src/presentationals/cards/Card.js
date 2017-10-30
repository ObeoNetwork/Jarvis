import React from 'react';

import './Card.css';

const Card = (props) => {
  return (
    <div className={`card ${props.className}`}>
      {props.children}
    </div>
  );
};

const Divider = () => <div className={`card__divider`}></div>;

const Header = (props) => {
  return (
    <div className={`card__header`}>
      {props.children}
    </div>
  );
};

const Title = (props) => {
  return <h4 className={`card__title`}>{props.children}</h4>;
};

const Body = (props) => {
  return (
    <div className={`card__body`}>
      {props.children}
    </div>
  );
};

const List = (props) => <div className={`card__list`}>{props.children}</div>;

const Item = (props) => <div className={`card__list__item`}>{props.children}</div>;

const Footer = (props) => {
  return (
    <div className={`card__footer`}>
      {props.children}
    </div>
  );
};

export {
  Card,
  Divider,
  Header,
  Item,
  List,
  Title,
  Body,
  Footer
};