import React, { useRef } from "react";

function UseRef() {
  const inputRef = useRef(null);

  const inputHandler = () => {
    inputRef.current.focus();
    inputRef.current.style.color = "red";
    inputRef.current.placeholder = "Enter the password";
    inputRef.current.value = "123";
  };

  const toggleHandler = () => {
    if (inputRef.current.style.display !== "none") {
      inputRef.current.style.display = "none";   // hide
    } else {
      inputRef.current.style.display = "inline"; // show
    }
  };

  return (
    <div>
      <h1>useRef Hook in ReactJS</h1>

      <button onClick={toggleHandler}>Toggle</button>

      <input
        ref={inputRef}
        type="text"
        placeholder="Enter user name"
      />

      <button onClick={inputHandler}>Focus in input field</button>
    </div>
  );
}

export default UseRef;
