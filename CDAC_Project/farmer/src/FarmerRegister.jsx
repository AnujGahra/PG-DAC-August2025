// FarmerRegister.jsx
import React from "react";

const FarmerRegister = () => {
  return (
    <form className="ac-form">
      <label className="ac-field">
        <span className="ac-field-label">Full Name</span>
        <div className="ac-input-wrap">
          <span className="ac-input-icon ac-input-icon-user" />
          <input
            className="ac-input"
            type="text"
            placeholder="Enter your name"
          />
        </div>
      </label>

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
        Register
      </button>

      <p className="ac-switch-text">
        Already have an account? <span className="ac-link">Login</span>
      </p>
    </form>
  );
};

export default FarmerRegister;
