import React, { useId } from 'react';

function CustomInput({ label, type }) {
  const id = useId(); // unique id for each component instance

  return (
    <div style={{ marginBottom: '12px' }}>
      <label htmlFor={id} style={{ marginRight: '10px' }}>
        {label}:
      </label>

      <input
        id={id}
        type={type}
        placeholder={`Enter your ${label.toLowerCase()}`}
      />
    </div>
  );
}

export default CustomInput;
