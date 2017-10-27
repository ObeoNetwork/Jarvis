(() => {
  'use strict';
  const getWorkflowData = async () => {
    const response = await fetch('/api/sessions/ThisIsAGreatSessionID/workflow');
    const data = await response.json();
    return data;
  };
  
  getWorkflowData()
    .then(data => {
      console.log(data);
    })
    .catch(reason => console.warn(reason));
})();