import React, { useState } from 'react'

function App() {
  const[name, setName] = useState('');
  const[password, setPassword] = useState('');
  const[email, setEmail] = useState('');
  return (
    <div>
      <h1>Controlled Component</h1>
      <form action="" method="get">
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} placeholder='Enter Name'  />
        <br />
        <br />
        <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} placeholder='Enter Password'  />
        <br />
        <br />
        <input type="text" value={email} onChange={(e) => setEmail(e.target.value)} placeholder='Enter email'  />
        <br />
        <br />
        <button>Submit</button>
        <button onClick={() => setName("")} >Clear</button>
        <h2>{name}</h2>
        <h2>{password}</h2>
        <h2>{email}</h2>
      </form>
    </div>
  )
}

export default App