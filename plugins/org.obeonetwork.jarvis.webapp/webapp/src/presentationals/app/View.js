import React from 'react';

import './View.css';

const View = (props) => {
  return (
    <div className={`view ${props.className}`}>
      <h2 className={`view__title`}>{props.title}</h2>
      {props.children}
    </div>
  );
};

export default View;