import React from 'react'

function User({displayName, name}) {
    // const name = 'Mahi'
  return (
    <div>
        <button onClick={() => displayName(name)}>Click Me</button>
    </div>
  )
}

export default User