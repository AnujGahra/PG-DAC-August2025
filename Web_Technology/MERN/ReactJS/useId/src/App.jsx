import React from 'react';
import CustomInput from './CustomInput';


function App() {
  return (
    <div>
      <h1>Registration Form</h1>
      
      {/* Two inputs using same component but IDs will be unique */}
      <CustomInput label="Username" type="text" />
      <CustomInput label="Password" type="password" />
    </div>
  );
}

export default App;
