import React from 'react';

function SyntheticEventDemo() {
  const handleClick = (event) => {
    alert('I was clicked');
    console.log('Synthetic event:', event);
  }

  return (
    <div>
      <button onClick={handleClick}>Click on me</button>
    </div>
  );
}

export default SyntheticEventDemo;
