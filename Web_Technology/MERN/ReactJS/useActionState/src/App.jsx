import React, { useActionState } from 'react'

function App() {


  const hanleSubmit = async (previosData, formData) => {
    let name = formData.get('name');
    let password = formData.get('password');
    console.log('hanleSubmit called', name , password);

    await new Promise(res => setTimeout(res, 2000));

    if(name && password) {
      return {message: 'Data Submitted', name, password}
    } else {
      return {error: 'Failed to submit. Enter proper data'}
    }
    
  }
  const [data, action, pending] = useActionState(hanleSubmit, undefined);
  console.log(data);
  

  return (
    <div>
      <h1>useActionState Hook in ReactJS</h1>
      <form action={action}>
        <input defaultValue={data?.name} type="text" placeholder='enter name' name="name" />
        <br /><br />
        <input defaultValue={data?.password} type="password" placeholder='enter password' name='password' />
        <br />
        <br />
        <button disabled={pending}>
          {
            pending ? 'Loading...' : 'Submit'
          }
        </button>
        {
          data?.error && <span style={{color:'red'}}>{data?.error}</span>
        }
        {
          data?.message && <span style={{color:'green'}}>{data?.message}</span>
        }
      </form>

      <h1>Name: {data?.name}</h1>
      <h1>Password: {data?.password}</h1>
    </div>
  )
}

export default App