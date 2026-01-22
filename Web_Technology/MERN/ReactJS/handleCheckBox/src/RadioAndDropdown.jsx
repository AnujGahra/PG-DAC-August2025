import React from 'react'
import { useState } from 'react'

function RadioAndDropdown() {

    const [gender, setGender] = useState('male');
    const [city, setCity] = useState('delhi');
  return (
    <div>
        <h1>Hanle radio and Dropdown</h1>
        <h4>Select Gender</h4>
        <input type="radio" onChange={(e) => setGender(e.target.value)} name="gender" id="male" value={"male"} checked={gender=='male'} />
        <label htmlFor="male">Male</label>
        <input type="radio" onChange={(e) => setGender(e.target.value)} name="gender" id="female" value={"female"} checked={gender=='female'} />
        <label htmlFor="female">Female</label>
        <br />
        <h2>Selected Gender: {gender}</h2>
        <br />
        <br />
        <h4>Select City</h4>
        <select onChange={(e) => setCity(e.target.value)} name="" id="" defaultValue={"moradabad"}>
            <option value="noida">Noida</option>
            <option value="moradabad">Moradabad</option>
            <option value="kanpur">Kanpur</option>
        </select>
        <h2>Selected City: {city}</h2>
    </div>
  )
}

export default RadioAndDropdown