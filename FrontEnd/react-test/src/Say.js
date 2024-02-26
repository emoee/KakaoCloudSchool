import React, { useState } from "react";

const Say = () => {
  const [msg, setMsg] = useState("");
  const onClickEnter=()=>{
    setMsg("Hi 🙋‍♀️")
  }
  return (
    <div style={{background:'rgb(255 230 175)', padding:'5px', marginBottom:'20px'}}>
      <h2>📢 Say 📢</h2>
      <p>{msg}</p>
      <button onClick={onClickEnter}>입장</button>
      <button onClick={()=>{setMsg("Bye 🙋")}}>퇴장</button>
    </div>
  );
};

export default Say;
