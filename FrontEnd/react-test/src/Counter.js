import React from "react";
import PropTypes from "prop-types";

Counter.defaultProps={
  superName: '뽀또'
}
Counter.propTypes={
  superName: PropTypes.string,
  superType: PropTypes.string
}

function Counter(props) {
  const name = "test!!";
  const type= undefined;

  const {superName, superType, children} = props;

  const style = {
    background: 'pink',
    color: '#585858',
    height: '250px'
  }

  return (
    <div id="counter" style= {style}>
      <h2>🌻 Counter 🌻</h2>
      <p>{name} 떡볶이 맛있겠당.</p>
      <p>{name === "test!!" && true? "일치" : "불일치"}</p>
      <p>{type === undefined? "!": "?"}</p>
      <p>{superName}는 {superType}이다.</p>
      <p style={{color:'red'}}>{children}</p>
    </div>
  );
}

export default Counter;
