import React from 'react'
import User from './User'

function App() {
  const displayName =(name) => {
    alert("display user name is: " + name)
  }
  return (
    <>
      <h1>Call Parent component function child component</h1>
      <User displayName={displayName} name="Anuj"/>
    </>
  )
}

export default App