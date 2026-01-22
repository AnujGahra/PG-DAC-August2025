import React, {useState} from 'react'
import AddUser from './Components/AddUser'
import DisplayUser from './Components/DisplayUser'

function App() {
   const [user, setUser] = useState('');
  return (
    <div>
      
      <AddUser setUser={setUser} />
      <DisplayUser user={user}/>
    </div>
  )
}

export default App