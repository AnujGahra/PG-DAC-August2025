// AdminLogin.jsx
import React from "react";

const AdminLogin = () => {
  return (
    <form className="ac-form">
      <label className="ac-field">
        <span className="ac-field-label">Email</span>
        <div className="ac-input-wrap">
          <span className="ac-input-icon ac-input-icon-mail" />
          <input
            className="ac-input"
            type="email"
            placeholder="Enter your email"
          />
        </div>
      </label>

      <label className="ac-field">
        <span className="ac-field-label">Password</span>
        <div className="ac-input-wrap">
          <span className="ac-input-icon ac-input-icon-lock" />
          <input
            className="ac-input"
            type="password"
            placeholder="Enter your password"
          />
        </div>
      </label>

      <button type="submit" className="ac-primary-btn">
        Login
      </button>

      <p className="ac-switch-text">
        Do not have an account? <span className="ac-link">Register</span>
      </p>
    </form>
  );
};

export default AdminLogin;
