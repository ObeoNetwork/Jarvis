import React from 'react';
import { Redirect, Route, Switch } from "react-router-dom";

import SessionsViewContainer from '../../containers/sessions/SessionsViewContainer';
import SessionViewContainer from '../../containers/sessions/SessionViewContainer';
import WorkflowViewContainer from '../../containers/workflow/WorkflowViewContainer';
import WorkflowPageViewContainer from '../../containers/workflow/WorkflowPageViewContainer';

import PageNotFoundView from '../errors/PageNotFoundView';

const Main = () => {
  return (
    <main>
      <Switch>
        <Route exact path="/" render={() => <Redirect to="/sessions"/>} />
        <Route exact path="/sessions" component={SessionsViewContainer} />
        <Route exact path="/sessions/:sessionId" component={SessionViewContainer} />
        <Route exact path="/sessions/:sessionId/workflow" component={WorkflowViewContainer} />
        <Route exact path="/sessions/:sessionId/workflow/pages" render={() => <Redirect to="/sessions/:sessionId/workflow"/>} />
        <Route exact path="/sessions/:sessionId/workflow/pages/:pageId" component={WorkflowPageViewContainer} />
        <Route component={PageNotFoundView}/>
      </Switch>
    </main>
  );
};

export default Main;