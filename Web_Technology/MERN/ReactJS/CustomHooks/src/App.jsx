import React from 'react'
import useToggle from './Components/useToggle'

function App() {
  const [value, toggleValue] = useToggle(true)
  return (
    <div>
      <button onClick={toggleValue}>Toggle Heading</button>
      <button onClick={() => toggleValue(false)}>Hide Heading</button>
      <button onClick={() => toggleValue(true)}>show Heading</button>
     {
      value ?  <h1>Custom Hooks in ReactJS</h1> : null
     }
    </div>
  )
}

export default App