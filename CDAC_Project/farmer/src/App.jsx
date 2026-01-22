// App.jsx
import React, { useState } from "react";
import RoleSelectPage from "./RoleSelectPage";
import AuthPage from "./AuthPage";
import "./styles.css";

const App = () => {
  const [selectedRole, setSelectedRole] = useState(null); // "farmer" | "admin" | null

  if (!selectedRole) {
    return <RoleSelectPage onSelectRole={setSelectedRole} />;
  }

  return (
    <AuthPage
      role={selectedRole}
      onBack={() => setSelectedRole(null)}
    />
  );
};

export default App;
