import React from "react";
import { useFormStatus } from "react-dom";

function UseFormStatus() {
  const handleSubmit = async () => {
    await new Promise((res) => setTimeout(res, 2000)); // simulate async delay  
    console.log("Form Submitted"); 
  };

  function CustomerForm() {
    const { pending } = useFormStatus();

    return (
      <>
        <input type="text" name="name" placeholder="Enter Name" />
        <br />
        <br />
        <input type="password" name="password" placeholder="Enter Password" />
        <br />
        <br />
        <button disabled={pending}>
          {pending ? "Loading..." : "Submit"}
        </button>
      </>
    );
  }

  return (
    <div>
      <h1>useFormStatus Hook in React 19</h1>

      <form action={handleSubmit}>
        <CustomerForm />
      </form>
    </div>
  );
}

export default UseFormStatus;
