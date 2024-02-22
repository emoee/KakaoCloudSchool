import React, { Component } from "react";

class CounterState extends Component {
  state = {
    number: 0,
    fixedNumber: 0,
  };
  render() {
    const {number, fixedNumber} = this.state;
    return (
      <div style={{background:'#afd9ff', padding:'5px'}}>
        <h2>☃️ CounterState ☃️</h2>
        <p>number : {number}</p>
        <p>fixedNumber : {fixedNumber}</p>
        <button onClick={
          ()=> {
            this.setState((prevState)=>{
              return{
                //업데이트 내용 작성 : prevState(전 상태), props(기존 상태)
                number: prevState.number + 1
              }
            });
            this.setState(prevState=>{
              return {
                number: prevState.number + 1
              }
            });
          }
        }>NumberChange</button>
      </div>);
  }
}

export default CounterState;
