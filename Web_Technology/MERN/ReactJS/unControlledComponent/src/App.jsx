import React, { useRef } from "react";
import styled from "styled-components";

function App() {
  const usernameRef = useRef(null);
  const passwordRef = useRef(null);

  const submitHandler = (e) => {
    e.preventDefault();

    const username = usernameRef.current.value;
    const password = passwordRef.current.value;

    alert(`Username: ${username}\nPassword: ${password}`);
  };

  const submitHandlerDom = (e) => {
    e.preventDefault();

    const username = document.querySelector('#user').value;
    const password = document.querySelector('#password').value;
    

    alert(`Username: ${username}\nPassword: ${password}`);
  };

  return (
    <Container>
      <Form onSubmit={submitHandlerDom}>
        <Title>Login Form (Uncontrolled)</Title>

        <Input
        id="user"
          type="text"
          placeholder="Enter Username"
          ref={usernameRef}
        />

        <Input
        id="password"
          type="password"
          placeholder="Enter Password"
          ref={passwordRef}
        />

        <Button type="submit">Submit</Button>
      </Form>
    </Container>
  );
}

export default App;

// -----------------------------
// Styled Components
// -----------------------------

const Container = styled.div`
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #ececec;
`;

const Form = styled.form`
  width: 300px;
  padding: 20px;
  background: white;
  border-radius: 12px;
  box-shadow: 0px 4px 12px #0003;
  display: flex;
  flex-direction: column;
  gap: 15px;
`;

const Title = styled.h2`
  text-align: center;
  color: #333;
`;

const Input = styled.input`
  padding: 10px;
  border: 1px solid #bbb;
  border-radius: 6px;
  font-size: 16px;

  &:focus {
    outline: none;
    border-color: #4a90e2;
  }
`;

const Button = styled.button`
  padding: 10px;
  background: #4a90e2;
  color: white;
  border: none;
  border-radius: 6px;
  font-size: 16px;
  cursor: pointer;

  &:hover {
    background: #357ab7;
  }
`;
