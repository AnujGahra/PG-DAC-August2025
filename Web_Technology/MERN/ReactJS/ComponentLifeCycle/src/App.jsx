import React from 'react'
import Counter from './Components/Counter'
import { useState } from 'react'

function App() {
  const [count, setCount] = useState(0);
  const [data, setData] = useState(100);
  const[display, setDisplay] = useState(true);

  return (
    <div>
      {
        display ? <Counter count={count} data={data}/> : null
      }
      <button onClick={() => setCount(count+1)}>Increment</button>
      <button onClick={() => setData(data-1)}>Decrement</button>
      <button onClick={() => setDisplay(!display)}>Toggle</button>
    </div>
  )
}

export default App