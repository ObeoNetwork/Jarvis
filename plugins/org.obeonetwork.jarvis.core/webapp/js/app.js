(() => {
  'use strict';
  const getDashboardData = async () => {
    const response = await fetch('/api/dashboard');
    const data = await response.json();
    return data;
  };
  
  const createActivity = (activityName) => {
    const activity = document.createElement('li');
    activity.setAttribute('class', 'c-activity');
    activity.appendChild(document.createTextNode(activityName));
    return activity;
  };
  
  const createSection = (sectionData) => {
    const section = document.createElement('div');
    section.setAttribute('class', 'o-section c-activities');
    
    const sectionHeader = document.createElement('div');
    sectionHeader.setAttribute('class', 'o-section__header');
    section.appendChild(sectionHeader);
    
    const sectionTitle = document.createElement('h3');
    sectionTitle.setAttribute('class', 'o-section__title');
    const title = document.createTextNode(sectionData.title);
    sectionTitle.appendChild(title);
    sectionHeader.appendChild(sectionTitle);
    
    const sectionBody = document.createElement('div');
    sectionBody.setAttribute('class', 'o-section__body');
    
    const activities = document.createElement('ul');
    activities.setAttribute('class', 'c-activities__list');
    activities.appendChild(createActivity('Create a class diagram'));
    activities.appendChild(createActivity('Create a component diagram'));
    activities.appendChild(createActivity('Create an activity diagram'));
    sectionBody.appendChild(activities);
    
    section.appendChild(sectionBody);
    
    const sections = document.getElementById('sections');
    sections.appendChild(section);
  };
  
  getDashboardData()
    .then(data => {
      data.sections.forEach(section => createSection(section));
    })
    .catch(reason => console.warn(reason));
})();