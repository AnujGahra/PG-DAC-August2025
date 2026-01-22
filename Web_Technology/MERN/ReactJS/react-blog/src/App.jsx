

import { useState } from 'react'
import './App.css'
import User from './Components/User'
import UiT from './Components/UiT';

function App() {
  const [counter, setCounter] = useState(0);
  const [fruit, setFruit] = useState("Apple")
  // let fruit = "Apple";

  const handleFruilt = () => {
    // eslint-disable-next-line react-hooks/immutability
    setFruit("Banana")
  }

  return (
    <div>
      <User/>
      <h1>Counter Val: {counter}</h1>
      <h1>Demo Project</h1>
      <button onClick={() => setCounter(counter+1)}>Increment</button>
      <div>
        <UiT name="Sook" />
      </div>
      <h1>{fruit}</h1>
      <button onClick={handleFruilt}>Change Fruit Name</button>
    </div>
  )
}

export default App
