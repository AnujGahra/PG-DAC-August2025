import React from 'react'
import { useRef } from 'react';
import UserInput from './UserInput';

function ForwardRef() {

  const inputRef = useRef(null);

  const updateInput = () => {
    inputRef.current.value=1000;
    inputRef.current.focus();
    
  }


  return (
    <div>
      <h1>ForwardRef</h1>
      <UserInput ref={inputRef} />
        <button onClick={updateInput}>Update Input Filed</button>
    </div>
    
  )
}

export default ForwardRef