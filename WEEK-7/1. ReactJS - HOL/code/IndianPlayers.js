import React from 'react';

const IndianPlayers = () => {
  // Declare two arrays
  const T20players = ['Sachin1', 'Dhoni2', 'Virat3'];
  const RanjiTrophyPlayers = ['Rohit4', 'Yuvaraj5', 'Raina6'];

  // Merge arrays using ES6 spread operator
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  // Destructure to get each player by index
  const [first, second, third, fourth, fifth, sixth] = allPlayers;

  // Create odd and even player arrays with custom labels
  const oddPlayers = [
    { label: 'First', name: first },
    { label: 'Third', name: third },
    { label: 'Fifth', name: fifth }
  ];

  const evenPlayers = [
    { label: 'Second', name: second },
    { label: 'Fourth', name: fourth },
    { label: 'Sixth', name: sixth }
  ];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player.label} : {player.name}</li>
        ))}
      </ul>

      <hr />

      <h2>Even Players</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player.label} : {player.name}</li>
        ))}
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>Mr. {player.replace(/\d+$/, ' Player')}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
