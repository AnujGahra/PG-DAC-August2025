import React, { useState } from 'react';

function Parent() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <Child1 count={count} setCount={setCount} />
      <Child2 count={count} />
      <Child3 count={count} />
    </div>
  );
}

function Child1({ count, setCount }) {
  return (
    <>
    <h1>Child1: {count}</h1>
    <button onClick={() => setCount(count + 1)}>
      Child1: {count}
    </button>
    </>
  );
}




function Child2({ count }) {
  return <h1>Child2: {count}</h1>;
}
function Child3({ count }) {
  return <h1>Child3: {count}</h1>;
}




export default Parent