import React from "react";
import styled, { css } from "styled-components";

const Button = styled.button`
  &:hover {
    background: #aac34a;
  }
`;

const StyledComponent = () => {
  return (
    <div>
      <h2>🎨 StyledComponent 🎨</h2>
      <Button style={{ fontSize: 25 }}>버튼 디자인</Button>
    </div>
  );
};

export default StyledComponent;
