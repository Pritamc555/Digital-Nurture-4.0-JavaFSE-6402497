import React from 'react';
import './App.css';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = true; // we still keep flag if you want to use it separately

  return (
    <div className="App">
      <h1> flag == true</h1>
      <ListofPlayers />

      <hr />

      <h1>flag == false</h1>
      <IndianPlayers />
    </div>
  );
}

export default App;
