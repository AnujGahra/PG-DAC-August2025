import React from 'react'

function Counter({counter, data}) {

    const getCounter = () => {
        console.log("Call only");
        
    }
    getCounter();
  return (
    <div>
        <div>{counter}</div>
    <h1>{data}</h1>
    </div>
  )
}

export default Counter