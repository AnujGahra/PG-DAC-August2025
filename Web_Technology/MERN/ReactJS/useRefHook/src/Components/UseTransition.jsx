import React from 'react'
import { useTransition } from 'react';
import { useState } from 'react'

function UseTransition() {
  // const [pending, setPending] = useState(false);
  const [pending, startTransition] = useTransition()

  const handleButton = async () => {
  //   setPending(true)
  //   await new Promise(res => setTimeout(res, 2000))
  //   setPending(false)

  startTransition(async () => {
    await new Promise(res => setTimeout(res, 2000))
  });
  
  }
  return (
    <div>
      <h1>useTransition Hook in React js 19</h1>
      <button disabled={pending} onClick={handleButton}>Click Me</button>
    </div>
  )
}

export default UseTransition