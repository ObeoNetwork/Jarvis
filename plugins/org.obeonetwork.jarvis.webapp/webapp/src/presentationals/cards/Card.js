import React from 'react';

import { classNames } from '../../common/utils';

import './Card.css';

const Card = (props) => {
  return (
    <div className={classNames('card', props.className)}>
      {props.children}
    </div>
  );
};

const Divider = (props) => <div className={classNames('card__divider', props.className)}></div>;

const Header = (props) => {
  return (
    <div className={classNames('card__header', props.className)}>
      {props.children}
    </div>
  );
};

const Title = (props) => {
  return <h1 className={classNames('card__title', props.className)}>{props.children}</h1>;
};

const Subtitle = (props) => {
  return <h2 className={classNames('card__subtitle', props.className)}>{props.children}</h2>;
};

const Body = (props) => {
  return (
    <div className={classNames('card__body', props.className)}>
      {props.children}
    </div>
  );
};

const List = (props) => <div className={classNames('card__list', props.className)}>{props.children}</div>;

const Item = (props) => <div className={classNames('card__item', props.className)}>{props.children}</div>

const ItemText = (props) => <div className={classNames('card__item__text', props.className)}>{props.children}</div>;

const ItemIcon = (props) => {
  return (
    <img className={classNames('card__item__icon', props.className)} src={props.src} alt={props.alt} />
  );
};

const Footer = (props) => {
  return (
    <div className={classNames('card__footer', props.className)}>
      {props.children}
    </div>
  );
};

const Action = (props) => {
  return (
    <button className={classNames('card__action', props.className)} onClick={props.handleClick}>
      {props.children}
    </button>
  );
};

export {
  Action,
  Body,
  Card,
  Divider,
  Footer,
  Header,
  Item,
  ItemIcon,
  ItemText,
  List,
  Subtitle,
  Title
};