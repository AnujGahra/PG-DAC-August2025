import { useState } from "react";
import FormComponent from "./FormComponent";

function App() {
  const [submittedData, setSubmittedData] = useState(null);

  const handleFormSubmit = (data) => {
    setSubmittedData(data); // get data from child
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>React Form Example</h1>

      <FormComponent onSubmit={handleFormSubmit} />

      {submittedData && (
        <div>
          <h2>Submitted Data:</h2>
          <p><strong>First Name:</strong> {submittedData.firstname}</p>
          <p><strong>Last Name:</strong> {submittedData.lastname}</p>
          <p><strong>Age:</strong> {submittedData.age}</p>
        </div>
      )}
    </div>
  );
}

export default App;
