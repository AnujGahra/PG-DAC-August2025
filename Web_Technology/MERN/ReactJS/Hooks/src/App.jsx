import React from 'react'
import { useEffect } from 'react';
import { useState } from 'react'
import Counter from '../Counter';

function App() {
  const[counter, setCounter] = useState(0);
  const [data, setData] = useState(0);

  useEffect(() => {
    // eslint-disable-next-line react-hooks/immutability
    callOnce();
  }, [counter, data])
  function callOnce(){
    console.log("CallOnce function called");
    
  }
  // callOnce()
  return (
    <div>
      <h1>useEffect Hook {counter}</h1>
      <button onClick={() => setCounter(counter+1)}>Counter</button>
      <button onClick={() => setData(data+1)}>Counter</button>
      <Counter/>
    </div>
  )
}



export default App