import React from 'react'
import College from './Components/College'
import { SubjectContext } from './Components/ContextData'
import { useState } from 'react'

function App() {
  const [subject, setSubject] = useState('');
  return (
    <div style={{backgroundColor:"yellow", padding:10}}>
      <SubjectContext.Provider value={subject}>
        <select defaultValue={subject} onChange={(e) => setSubject(e.target.value)} name="" id="">
          <option value="">Select</option>
          <option value="Maths">Maths</option>
          <option value="History">History</option>
          <option value="English">English</option>
        </select>
        <h1>Context API</h1>
      <College/>
      </SubjectContext.Provider>
    </div>
  )
}

export default App