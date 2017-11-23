import React, { Component } from 'react';

import {
  classNames
} from '../../common/classNames';

import {
  computeNativeProperties,
  domElementProperties
} from '../../common/properties';

import './DefaultButton.css';

/**
 * The state of button supported, ghost will be used by default.
 */
export const DefaultButtonState = {
  primary: 'primary',
  success: 'success',
  warning: 'warning',
  danger: 'danger',
  ghost: 'ghost'
};

/**
 * The default button should be used to execute some actions or provide a link
 * in order to navigate to another page.
 * 
 * @author sbegaudeau
 */
export class DefaultButton extends Component {
  constructor(props) {
    super(props);

    this._computeClassName = this._computeClassName.bind(this);
    this._renderContent = this._renderContent.bind(this);
    this._onRenderContainer = this._onRenderContainer.bind(this);
    this._onRenderLabel = this._onRenderLabel.bind(this);
  }

  render() {
    const {
      href,
      label,
      state,
      children,
      onRenderLabel,
      onRenderContainer
    } = this.props;
    
    const nativeProperties = computeNativeProperties(this.props, domElementProperties);
    
    let defaultClassName = this._computeClassName(state, nativeProperties);
    const className = classNames(defaultClassName, nativeProperties.className);
    const additionalProperties = {
      className,
      href,
      label,
      children
    };

    let rootElementTag = 'button';
    if (href) {
      rootElementTag = 'a';
    }

    const buttonProps = Object.assign({}, nativeProperties, additionalProperties);
    return this._renderContent(rootElementTag, buttonProps);
  }

  /**
   * Computes the className property.
   * @param state The state of the button
   * @param nativeProperties The native properties of the element
   */
  _computeClassName(state = 'ghost', nativeProperties) {
    let defaultClassName = 'Button Button--' + state;
    return classNames(defaultClassName, nativeProperties.className);
  }

  /**
   * Renders the content of the button.
   * @param rootElementTag The tag of the root element (<a> or <button>)
   * @param buttonProps The preprocessed properties of the button
   */
  _renderContent(rootElementTag, buttonProps) {
    const {
      onRenderContainer = this._onRenderContainer
    } = this.props;
    const container = onRenderContainer(buttonProps);
    return React.createElement(rootElementTag, buttonProps, container);
  }

  /**
   * Renders the container of the elements in the button.
   * @param buttonProps The preprocessed properties of the button
   */
  _onRenderContainer(buttonProps) {
    const {
      onRenderLabel = this._onRenderLabel
    } = this.props;

    return (
      <div className='Button-Container'>
        {onRenderLabel(buttonProps)}
      </div>
    );
  }

  /**
   * Renders the label of the button from the label property or a child string.
   * @param buttonProps The preprocessed properties of the button.
   */
  _onRenderLabel(buttonProps) {
    const {
      label,
      children
    } = buttonProps;

    let text;
    if (label) {
      text = label
    } else if (label === undefined && typeof children === 'string') {
      text = children;
    }

    if (text) {
      return (
        <div className='Button-Label'>
          {text}
        </div>
      );
    }
    return undefined;
  }
}
