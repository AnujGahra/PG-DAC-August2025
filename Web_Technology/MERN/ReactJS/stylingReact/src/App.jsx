import { useState } from "react";

import style from "./ClassComponent.module.css"

function App() {
  const [cardStyle, setCardStyle] = useState({
    border: "1px solid #cccccc3b",
    width: "200px",
    boxShadow: "1px 2px 3px 0px #cccccc57",
    margin: "10px",
    backgroundColor: "white",
  });

  const [textColor, setTextColor] = useState("black");

  const updateTheme = (bgColor, text) => {
    setCardStyle((prev) => ({
      ...prev,
      backgroundColor: bgColor,
    }));
    setTextColor(text);
  };

  return (
    <>
      <h1 style={{ color: "red", backgroundColor: "black" }}>
        Inline css in ReactJS
      </h1>

      <button onClick={() => updateTheme("gray", "green")}>Gray Theme</button>
      <button onClick={() => updateTheme("white", "aqua")}>Default Theme</button>

      <div style={{ display: "flex", flexWrap: "wrap" }}>
        <div style={cardStyle}>
          <img
            style={{ width: "200px" }}
            src="https://cdn.pixabay.com/photo/2023/02/18/11/00/icon-7797704_640.png"
            alt=""
          />
          <div style={{ padding: "5px", color: textColor }}>
            <h4 className={style.heading}>Anuj Gahra</h4>
            <p>SDE-III</p>
          </div>
        </div>
      </div>
	  
    </>
  );
}

export default App;
