import React from 'react';

import { classNames } from '../../common/classNames';

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

const Item = (props) => <div className={classNames('card__item', props.className)}>{props.children}</div>;

const ItemImgAvatar = (props) => <img className={classNames('card__item_avatar', props.className)} src={props.src} alt={props.alt} />;

const ItemText = (props) => <div className={classNames('card__item__text', props.className)}>{props.children}</div>;

const ItemLink = (props) => <div className={classNames('card__item__link', props.className)} onClick={props.onClick}>{props.children}</div>;

const ItemSvgIcon = (props) => {
  return (
    <svg xmlns="http://www.w3.org/2000/svg" version="1.1" x="0px" y="0px" viewBox="0 0 100 100" className={classNames('card__item__icon', props.className)} onClick={props.onClick}>
      {props.children}
    </svg>
  );
};

const Footer = (props) => {
  return (
    <div className={classNames('card__footer', props.className)}>
      {props.children}
    </div>
  );
};

export {
  Body,
  Card,
  Divider,
  Footer,
  Header,
  Item,
  ItemImgAvatar,
  ItemLink,
  ItemSvgIcon,
  ItemText,
  List,
  Subtitle,
  Title
};