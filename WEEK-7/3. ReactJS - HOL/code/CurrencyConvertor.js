import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      euros: '',
      rupees: ''
    };
  }

  handleChange = (e) => {
    this.setState({ euros: e.target.value });
  }

  handleSubmit = () => {
    const rupeeRate = 91; // Example rate: 1 EUR = 91 INR
    const rupees = this.state.euros * rupeeRate;
    alert(`Converting to Rupees: Amount is ₹${rupees.toFixed(2)}`);
    this.setState({ rupees: rupees.toFixed(2) });
  }

  render() {
    return (
      <div>
        <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
        <p>Amount in Euros:</p>
        <input
          type="number"
          value={this.state.euros}
          onChange={this.handleChange}
        />
        <br /><br />
        <button onClick={this.handleSubmit}>Submit</button>
        {this.state.rupees && (
          <p>Converted Amount in Rupees: ₹{this.state.rupees}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
