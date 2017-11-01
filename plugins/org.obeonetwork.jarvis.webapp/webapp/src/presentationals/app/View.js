import React from 'react';

import './View.css';

const View = (props) => {
  return (
    <div className={`view ${props.className}`}>
      <h1 className={`view__title`}>{props.title}</h1>
      {props.children}
    </div>
  );
};

export default View;