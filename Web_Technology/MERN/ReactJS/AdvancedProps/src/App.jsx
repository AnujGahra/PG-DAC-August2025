import React from 'react'
import User from './User'
import Wrapper from './Wrapper'

function App() {
  return (
    <div>
      <h1>App</h1>
      {/* <User name="Anuj Kumar"/>
      <User name="Anuj Kumar"/>
      <User /> */}
      <Wrapper color="orange">
         <h1>Wrapper</h1>
      </Wrapper>
      <Wrapper color='red'>
         <h1>Hii, This is wrapper </h1>
      </Wrapper>
      <Wrapper>
         <h1>Hii, This is 3rd Wrapper </h1>
      </Wrapper>
    </div>
  )
}

export default App