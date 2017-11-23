const classNames = (staticClassNames, optionalClassNames) => {
  if (optionalClassNames) {
    return staticClassNames + ' ' + optionalClassNames;
  }
  return staticClassNames;
};

export {
  classNames
};