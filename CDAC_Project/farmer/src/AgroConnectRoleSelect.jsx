// AgroConnectRoleSelect.jsx
import React from "react";
import "./AgroConnect.css";

const AgroConnectRoleSelect = () => {
  return (
    <div className="ac-page">
      <div className="ac-logo-circle">
        <span className="ac-logo-sprout">🌱</span>
      </div>

      <h1 className="ac-title">AgroConnect</h1>
      <p className="ac-subtitle">Connect, Share, and Grow Together</p>

      <div className="ac-card">
        <h2 className="ac-card-title">Welcome to AgroConnect</h2>
        <p className="ac-card-subtitle">Select your role to continue</p>

        <button className="ac-role ac-role-farmer">
          <div className="ac-role-icon ac-role-icon-farmer">👤</div>
          <div className="ac-role-text">
            <div className="ac-role-name">Farmer</div>
            <div className="ac-role-desc">
              Share your farming experiences and connect with community
            </div>
          </div>
          <span className="ac-role-arrow">→</span>
        </button>

        <button className="ac-role ac-role-admin">
          <div className="ac-role-icon ac-role-icon-admin">🛡️</div>
          <div className="ac-role-text">
            <div className="ac-role-name">Admin</div>
            <div className="ac-role-desc">
              Manage platform and support the farming community
            </div>
          </div>
          <span className="ac-role-arrow">→</span>
        </button>
      </div>
    </div>
  );
};

export default AgroConnectRoleSelect;
