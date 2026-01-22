import React from 'react'
import Skill from './Skill'
import RadioAndDropdown from './RadioAndDropdown'
import Loop from './Loop'
import Clock from './Clock'
import { useState } from 'react'

function App() {
  const[color, setColor] = useState('green');
  return (
    <div>
      {/* <Skill/> */}
      {/* <RadioAndDropdown/> */}
      {/* <Loop/> */}
      <select onChange={(e) => setColor(e.target.value)} name="" id="">
        <option value="red">Red</option>
        <option value="blue">Blue</option>
        <option value="orange">Orange</option>
        <option value="green">Green</option>
      </select>
      <Clock color={color}/>
    </div>
  )
}

export default App