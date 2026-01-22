import { useState } from "react";

function FormComponent({ onSubmit }) {
  const [formData, setFormData] = useState({
    firstname: "",
    lastname: "",
    age: ""
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit(formData); // send data to App.jsx
  };

  return (
    <form onSubmit={handleSubmit} style={{ marginBottom: "20px" }}>
      <div>
        <label>First Name: </label>
        <input 
          type="text" 
          name="firstname" 
          value={formData.firstname} 
          onChange={handleChange} 
          required
        />
      </div>
      <br />

      <div>
        <label>Last Name: </label>
        <input 
          type="text" 
          name="lastname" 
          value={formData.lastname} 
          onChange={handleChange} 
          required
        />
      </div>
      <br />

      <div>
        <label>Age: </label>
        <input 
          type="number" 
          name="age" 
          value={formData.age} 
          onChange={handleChange} 
          required
        />
      </div>
      <br />

      <button type="submit">Submit</button>
    </form>
  );
}

export default FormComponent;
