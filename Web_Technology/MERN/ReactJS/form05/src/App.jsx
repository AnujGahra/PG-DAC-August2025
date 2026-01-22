import React from 'react'
import { useState } from 'react'

function App() {
  const [val, setVal] = useState("Anuj");
  const [password, setPassword] = useState("");
  const [age, setAge] = useState("");
  return (
    <div>
      <h1>Get Input feild Value</h1>
      <input type="text" value={val} onChange={(e)=> setVal(e.target.value)} placeholder='Enter user name' />
      <input type="password" value={password} onChange={(e)=> setPassword(e.target.value)} placeholder='Enter user password' />
      <input type="number" value={age} onChange={(e)=> setAge(e.target.value)} placeholder='Enter user age' />
      <h1>{val}</h1>
      {/* <h1>{password</h1> */}
      <h1>{age}</h1>
      <button onClick={() => setVal("")}>Clear Value</button>
      <button onClick={() => setAge("")}>Clear Age</button>
    </div>
  )
}

export default App