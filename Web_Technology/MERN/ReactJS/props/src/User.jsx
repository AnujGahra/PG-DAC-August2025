import React from 'react'

function User({user}) {
  return (
    <div>
        {/* <h1>{user.name}</h1>
        <h1>{user.age}</h1>
        <h1>{user.email}</h1> */}
        <h1>{user[0]}</h1>
        <h1>{user[1]}</h1>
        <h1>{user[2]}</h1>
        
    </div>
  )
}

export default User