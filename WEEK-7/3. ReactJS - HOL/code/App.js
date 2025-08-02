import React from 'react';
import './App.css';
import Counter from './Counter';
import SayWelcome from './SayWelcome';
import SyntheticEventDemo from './SyntheticEventDemo';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  return (
    <div className="App">
      
      <Counter />
      <SayWelcome />
      <SyntheticEventDemo />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
