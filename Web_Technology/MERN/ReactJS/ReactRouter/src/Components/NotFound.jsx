import React from "react";
import "./NotFound.css";

function NotFound() {
  return (
    <div className="notfound-container">
      <div className="notfound-animation">
        <h1 className="glitch" data-text="404">404</h1>
        <p className="fade-in">Oops! Page Not Found</p>

        <button
          className="home-btn"
          onClick={() => (window.location.href = "/")}
        >
          Go Home
        </button>
      </div>
    </div>
  );
}

export default NotFound;
