import React from 'react';

function SayWelcome() {
  const sayWelcome = (message) => {
    alert(message);
  }

  return (
    <div>
      <button onClick={() => sayWelcome('Welcome!')}>Say Welcome</button>
    </div>
  );
}

export default SayWelcome;
