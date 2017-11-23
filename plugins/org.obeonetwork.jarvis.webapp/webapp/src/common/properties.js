/**
 * The list of all events handlers supported by all HTML elements.
 * See https://html.spec.whatwg.org/multipage/webappapis.html#event-handler-attributes
 * See https://reactjs.org/docs/events.html for the React definitions of the events
 */
export const domElementEventHandlers = [
  /* Clipboard Events */
  'onCopy',
  'onCut',
  'onPaste',
  /* Composition Events */
  'onCompositionEnd',
  'onCompositionStart',
  'onCompositionUpdate',
  /* Keyboard Events */
  'onKeyDown',
  'onKeyPress',
  'onKeyUp',
  /* Focus Events */
  'onFocus',
  'onBlur',
  /* Form Events */
  'onChange',
  'onInput',
  'onInvalid',
  'onSubmit',
  /* Mouse Events */
  'onClick',
  'onContextMenu',
  'onDoubleClick',
  'onDrag',
  'onDragEnd',
  'onDragEnter',
  'onDragExit',
  'onDragLeave',
  'onDragOver',
  'onDragStart',
  'onDrop',
  'onMouseDown',
  'onMouseEnter',
  'onMouseLeaveonMouseMove',
  'onMouseOut',
  'onMouseOver',
  'onMouseUp',
  /* Selection Events */
  'onSelect',
  /* Touch Events */
  'onTouchCancel',
  'onTouchEnd',
  'onTouchMove',
  'onTouchStart',
  /* UI Events */
  'onScroll',
  /* Wheel Events */
  'onWheel',
  /* Media Events */
  'onAbort',
  'onCanPlay',
  'onCanPlayThrough',
  'onDurationChange',
  'onEmptied',
  'onEncrypted',
  'onEnded',
  'onError',
  'onLoadedData',
  'onLoadedMetadata',
  'onLoadStart',
  'onPause',
  'onPlay',
  'onPlaying',
  'onProgress',
  'onRateChange',
  'onSeeked',
  'onSeeking',
  'onStalled',
  'onSuspend',
  'onTimeUpdate',
  'onVolumeChange',
  'onWaiting',
  /* Image Events */
  'onLoad',
  'onError',
  /* Animation Events */
  'onAnimationStart',
  'onAnimationEnd',
  'onAnimationIteration',
  /* Transition Events */
  'onTransitionEnd',
  /* Other Events */
  'onToggle'
]

/**
 * The list of all supported HTML attributes.
 * See https://reactjs.org/docs/dom-elements.html for the React definitions of those attributes.
 */
export const domElementAttributes = [
  'defaultChecked',
  'defaultValue',
  'accept',
  'acceptCharset',
  'accessKey',
  'action',
  'allowFullScreen',
  'allowTransparency',
  'alt',
  'async',
  'autoComplete',
  'autoFocus',
  'autoPlay',
  'capture',
  'cellPadding',
  'cellSpacing',
  'challenge',
  'charSet',
  'checked',
  'cite',
  'classID',
  'className',
  'colSpan',
  'cols',
  'content',
  'contentEditable',
  'contextMenu',
  'controls',
  'controlsList',
  'coords',
  'crossOrigin',
  'data',
  'dateTime',
  'default',
  'defer',
  'dir',
  'disabled',
  'download',
  'draggable',
  'encType',
  'form',
  'formAction',
  'formEncType',
  'formMethod',
  'formNoValidate',
  'formTarget',
  'frameBorder',
  'headers',
  'height',
  'hidden',
  'high',
  'href',
  'hrefLang',
  'htmlFor',
  'httpEquiv',
  'icon',
  'id',
  'inputMode',
  'integrity',
  'is',
  'keyParams',
  'keyType',
  'kind',
  'label',
  'lang',
  'list',
  'loop',
  'low',
  'manifest',
  'marginHeight',
  'marginWidth',
  'max',
  'maxLength',
  'media',
  'mediaGroup',
  'method',
  'min',
  'minLength',
  'multiple',
  'muted',
  'name',
  'noValidate',
  'nonce',
  'open',
  'optimum',
  'pattern',
  'placeholder',
  'poster',
  'preload',
  'profile',
  'radioGroup',
  'readOnly',
  'rel',
  'required',
  'reversed',
  'role',
  'rowSpan',
  'rows',
  'sandbox',
  'scope',
  'scoped',
  'scrolling',
  'seamless',
  'selected',
  'shape',
  'size',
  'sizes',
  'span',
  'spellCheck',
  'src',
  'srcDoc',
  'srcLang',
  'srcSet',
  'start',
  'step',
  'style',
  'summary',
  'tabIndex',
  'target',
  'title',
  'type',
  'useMap',
  'value',
  'width',
  'wmode',
  'wrap'
];

/**
 * The list of all the properties (event handlers and attributes) supported by all the
 * DOM elements.
 */
export const domElementProperties = domElementEventHandlers.concat(domElementAttributes);

/**
 * Computes the properties natively supported.
 * @param props The properties of the Recat components
 * @param nativeProperties The native properties supported by the DOM element.
 */
export const computeNativeProperties = (props, nativeProperties) => {
  const properties = {};

  Object.entries(props).forEach(entry => {
    const key = entry[0];
    const value = entry[1];

    if (nativeProperties.indexOf(key) !== -1) {
      properties[key] = value;
    }
  });

  return properties;
};