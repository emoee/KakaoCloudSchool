import React, { useState, Component } from 'react';

class StateSample extends Component {
    constructor(props){
        super(props)
        this.state={
            number:0,
            name:'1씩 올라갑니당'
        }
    }
    
    render() {
        const {number, name} = this.state

        return (
            <div style={{background:'lightgray', color:'#933f4e', height:'250px'}}>
                    <h2>🍍 State 🍍</h2>
                    <p>{number} / {name}</p>
                    <button onClick={()=>{
                        this.setState({
                            number : this.state.number+1,
                            name: '1씩 올라갑니당!'
                        })
                }}>1 더하기</button>
            </div>
        );
    }
}

export default StateSample;