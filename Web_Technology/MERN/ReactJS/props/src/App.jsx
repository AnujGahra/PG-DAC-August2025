import React from 'react'
import User from './User'
import { useState } from 'react'
import Annu from './Annu';

const App = () => {
  const[student, setStudent] = useState();
  // let userObject={
  //   name:"Soil Sadhu",
  //   age:"29",
  //   email:"anujgahra@gmail.com"
  // }
  let userDetails = ["anuj", "lucky", "chetak", "satyam"]
  return (
    <div>
      <h1>Props</h1>
    {/* <User user = {userObject}/> */}
    <User user = {userDetails}/>

    {
      student && <Annu name={student} />
    }
    <button onClick={() => setStudent("Anuj Gahra")}>Update Student name</button>
    </div>
  )
}

export default App