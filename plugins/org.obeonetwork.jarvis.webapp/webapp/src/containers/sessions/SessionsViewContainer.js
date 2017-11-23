import React, { Component } from 'react';
import { Link } from "react-router-dom";

import SessionCard from "../../components/sessions/SessionCard";
import View from "../../components/app/View";

import './SessionsViewContainer.css';

class SessionsViewContainer extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoading: true
    };
  }

  componentDidMount() {
    fetch(`/api/sessions`)
      .then(response => response.json())
      .then(jsonResponse => this.setState((prevState, props) => {
        return {
          isLoading: false,
          sessions: jsonResponse.sessions
        }
      }))
      .catch(error => this.setState((prevState, props) => {
        return {
          isLoading: false,
          error: 'The page has not been properly loaded due to an error with the server.'
        }
      }));
  }

  render() {
    let body;
    if (this.state.isLoading) {
      body = <p>Loading...</p>;
    } else if (this.state.error) {
      body = <p>{this.state.error}</p>
    } else {
      body = (
        <div className='sessions-view__container'>
          {Object.entries(this.state.sessions).map(sessionEntry => {
            return (
              <Link key={sessionEntry[0]} to={`/sessions/${sessionEntry[1].sessionId}/workflow`}>
                <SessionCard session={sessionEntry[1]} />
              </Link>
            );
          })}
        </div>
      );
    }
    return (
      <View className='sessions-view' title="Sessions">
        {body}
      </View>
    );
  }
};

export default SessionsViewContainer;