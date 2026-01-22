import React, { useState } from "react";
import { updatePost } from "../api/PostApi";

const Form = ({data, setData}) => {
  const [addData, setaddData] = useState({ title: "", body: "" });

  const handleInputChange = (e) => {
    const name = e.target.name;
    const value = e.target.value;

    setaddData((prev) => {
      // console.log(prev)
      return {
        ...prev,
        [name]: value,
      };
    });
  };

  const addPostData = async () => {
    const res = await updatePost(addData);
    if (res.status == 201) {
      setData([...data, res.data]);
      setaddData({title:"", body:""})
    }
  };

  //   form Submission
  const handleFormSubmit = (e) => {
    e.preventDefault();
    addPostData();
  };

  return (
    <form onSubmit={handleFormSubmit}>
      <div>
        <label htmlFor="title"></label>
        <input
          type="text"
          name="title"
          id="title"
          placeholder="Add Title"
          autoComplete="off"
          value={addData.title}
          onChange={handleInputChange}
        />
      </div>
      <div>
        <label htmlFor="body"></label>
        <input
          type="text"
          name="body"
          id="body"
          placeholder="Add Post"
          autoComplete="off"
          value={addData.body}
          onChange={handleInputChange}
        />
      </div>
      <button type="submit">Add</button>
    </form>
  );
};

export default Form;
