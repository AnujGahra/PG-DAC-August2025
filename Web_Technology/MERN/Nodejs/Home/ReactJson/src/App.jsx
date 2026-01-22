import React, { useEffect, useState } from "react";

function App() {
  const [usersData, setUsersData] = useState([]);

  const url = "http://localhost:3000/users";

  useEffect(() => {
    getUsersdata();
  }, []);

  async function getUsersdata() {
    try {
      let response = await fetch(url);
      let data = await response.json();
      console.log(data);
      setUsersData(data); // ✅ store data in state
    } catch (error) {
      console.log("Error fetching data:", error);
    }
  }

  return (
    <div>
      <h1>Integrate JSON Server API and Loader</h1>

      {usersData.length === 0 && <h2>Loading...</h2>}

      {usersData.map((user, index) => (
        <div key={index}>
          <h3>Name: {user.name}</h3>
          <h4>Email: {user.email}</h4>
        </div>
      ))}
    </div>
  );
}

export default App;
