import React from 'react';
import ReactDom from 'react-dom';
import ReactTestUtils from 'react-dom/test-utils';

import Renderer from 'react-test-renderer';

// tag::import[]
import {
  DefaultButton,
  DefaultButtonState
} from './DefaultButton';
// end::import[]

describe('Default Button', () => {
  it('Renders a Button without a label', () => {
    const button = Renderer.create(<DefaultButton />);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with the label as props', () => {
    const component = 
    // tag::examples[]
      // Label as a property
      <DefaultButton label='Click Me'/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with the label as child', () => {
    const component =
    // tag::examples[]
      // Label as a property
      <DefaultButton>Click Me</DefaultButton>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button as a link', () => {
    const component = 
    // tag::examples[]
      // Button as a link
      <DefaultButton label='Click Me' href='https://www.google.com'/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button as a link with a target', () => {
    const component =
    // tag::examples[]
      // Button as link with a target
      <DefaultButton label='Click Me' href='https://www.google.com' target='_blank'/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with a primary state', () => {
    const component =
    // tag::examples[]
      // Button with a primary state
      <DefaultButton label='Click Me' state={DefaultButtonState.primary}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with a success state', () => {
    const component =
    // tag::examples[]
      // Button with a success state
      <DefaultButton label='Click Me' state={DefaultButtonState.success}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with a warning state', () => {
    const component =
    // tag::examples[]
      // Button with a warning state
      <DefaultButton label='Click Me' state={DefaultButtonState.warning}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with a danger state', () => {
    const component =
    // tag::examples[]
      // Button with a danger state
      <DefaultButton label='Click Me' state={DefaultButtonState.danger}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with a ghost state', () => {
    const component =
    // tag::examples[]
      // Button with a ghost state
      <DefaultButton label='Click Me' state={DefaultButtonState.ghost}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders a Button with a click listener', () => {
    const component =
    // tag::examples[]
      // Button with a click listener
      <DefaultButton label='Click Me' onClick={() => console.log('Clicked')}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders an alternate label with onRenderLabel', () => {
    const component = 
    // tag::examples[]
      // Alternate label renderer
      <DefaultButton label='Click Me' onRenderLabel={() => {
        return (
          <div className='Button-Label'>
            Alternate Label
          </div>
        );
      }}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  it('Renders an alternate contents with onRenderContainer', () => {
    const component = 
    // tag::examples[]
      // Alternate container renderer
      <DefaultButton label='Click Me' onRenderContainer={() => {
        return (
          <div className='Button-Container'>
            Alternate Content
          </div>
        );
      }}/>;

    // end::examples[]
    const button = Renderer.create(component);
    let json = button.toJSON();
    expect(json).toMatchSnapshot();
  });

  describe('Handles DOM events', () => {
    let hasBeenClicked = false;
    let hasBeenHovered = false;

    beforeEach(() => {
      hasBeenClicked = false;
      hasBeenHovered = false;
    });

    it('Can trigger the onClick event handler when clicked', () => {
      const button = ReactTestUtils.renderIntoDocument(<DefaultButton label='Click Me' onClick={() => hasBeenClicked = true}/>);
      const buttonDOMNode = ReactDom.findDOMNode(button);
      ReactTestUtils.Simulate.click(buttonDOMNode);
      expect(hasBeenClicked).toEqual(true);
      expect(hasBeenHovered).toEqual(false);
    });

    it('Can trigger the onMouseOver event handler when hovered', () => {
      const button = ReactTestUtils.renderIntoDocument(<DefaultButton label='Click Me' onMouseOver={() => hasBeenHovered = true}/>);
      const buttonDOMNode = ReactDom.findDOMNode(button);
      ReactTestUtils.Simulate.mouseOver(buttonDOMNode);
      expect(hasBeenClicked).toEqual(false);
      expect(hasBeenHovered).toEqual(true);
    });
  });
});