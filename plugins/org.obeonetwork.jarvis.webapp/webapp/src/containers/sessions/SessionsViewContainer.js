import React, { Component } from 'react';
import { Link } from "react-router-dom";

import SessionCard from "../../presentationals/sessions/SessionCard";
import View from "../../presentationals/app/View";

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
      .catch(error => console.warn(error));
  }

  render() {
    if (this.state.isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <View className='sessions-view' title="Sessions">
        <div className='sessions-view__container'>
          {Object.entries(this.state.sessions).map(sessionEntry => {
            return (
              <Link key={sessionEntry[0]} to={`/sessions/${sessionEntry[1].sessionId}/workflow`}>
                <SessionCard session={sessionEntry[1]} />
              </Link>
            );
          })}
        </div>
      </View>
    );
  }
};

export default SessionsViewContainer;