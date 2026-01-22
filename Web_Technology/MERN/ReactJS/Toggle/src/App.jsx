import React, { useState } from 'react'
import User from './User';

function App() {
  // const [display, setDisplay] = useState(true);
  const [count, setCount] = useState(0)

  return (
    <>
    <h1>Toggle in React js {count }</h1>
    {/* <button onClick={() => setDisplay(!display)}>Toggle</button> */}
    <button onClick={() => setCount(count+1)}>Multiple condition</button>
    {/* {
      display ? <User/> : null
    } */}
    {
      count==0?<h1>Condition 0</h1>
      :count==1?<h1>Condition 1</h1>
      :count==2?<h1>Condition 2</h1>
      :count==3?<h1>Condition 3</h1>
      :count==4?<h1>Condition 4</h1>
      :count==5?<h1>Condition 5</h1>
      :null
    }
    </>
  )
}

export default App