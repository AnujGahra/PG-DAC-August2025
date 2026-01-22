import React from 'react'
import { useState } from 'react'

function Skill() {

    const[skills, setSkills] = useState([]);

    const handleSkills = (e) => {
        console.log(e.target.value, e.target.checked)
        if(e.target.checked){
            setSkills([...skills , e.target.value]);
        } else {
            setSkills([...skills.filter((item) => item != e.target.value)])
        }
    }
  return (
    <div>
        <h3>Select Your Skills</h3>
        <input onChange={handleSkills} type="checkbox" id='php' value="php" />
        <label htmlFor="php">PHP</label>
        <br />

        <input onChange={handleSkills}  type="checkbox" id='react' value="react" />
        <label htmlFor="react">REACT</label>
        <br />

        <input onChange={handleSkills}  type="checkbox" id='node' value="node" />
        <label htmlFor="node">NODE</label>
        <br />

        <input onChange={handleSkills}  type="checkbox" id='express' value="express" />
        <label htmlFor="express">EXPRESS</label>
        <br />
        <h1>{skills.toString()}</h1>
    </div>
  )
}

export default Skill