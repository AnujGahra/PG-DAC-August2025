// AuthPage.jsx
import React, { useState } from "react";
import FarmerLogin from "./FarmerLogin";
import FarmerRegister from "./FarmerRegister";
import AdminLogin from "./AdminLogin";
import AdminRegister from "./AdminRegister";

const AuthPage = ({ role, onBack }) => {
  const [mode, setMode] = useState("login"); // "login" | "register"

  const isFarmer = role === "farmer";

  return (
    <div className="ac-page">
      <div className="ac-logo-circle">
        <span className="ac-logo-sprout">🌱</span>
      </div>

      <h1 className="ac-title">AgroConnect</h1>
      <p className="ac-subtitle">Connect, Share, and Grow Together</p>

      <div className="ac-card ac-card-auth">
        <button className="ac-back-btn" onClick={onBack}>
          ← <span>Change Role</span>
        </button>

        <div className="ac-current-role">
          <div
            className={`ac-role-chip ${
              isFarmer ? "ac-role-chip-farmer" : "ac-role-chip-admin"
            }`}
          >
            <div
              className={`ac-role-chip-icon ${
                isFarmer ? "ac-role-icon-farmer" : "ac-role-icon-admin"
              }`}
            >
              {isFarmer ? (
                <span className="ac-icon-person" />
              ) : (
                <span className="ac-icon-shield" />
              )}
            </div>
            <div className="ac-role-chip-text">
              <span className="ac-role-chip-title">
                {isFarmer ? "Farmer" : "Admin"}
              </span>
              <span className="ac-role-chip-subtitle">
                Login or Register
              </span>
            </div>
          </div>
        </div>

        <div className="ac-auth-toggle">
          <button
            onClick={() => setMode("login")}
            className={`ac-auth-tab ${
              mode === "login" ? "ac-auth-tab-active" : ""
            }`}
          >
            Login
          </button>
          <button
            onClick={() => setMode("register")}
            className={`ac-auth-tab ${
              mode === "register" ? "ac-auth-tab-active" : ""
            }`}
          >
            Register
          </button>
        </div>

        {isFarmer && mode === "login" && <FarmerLogin />}
        {isFarmer && mode === "register" && <FarmerRegister />}
        {!isFarmer && mode === "login" && <AdminLogin />}
        {!isFarmer && mode === "register" && <AdminRegister />}
      </div>
    </div>
  );
};

export default AuthPage;
