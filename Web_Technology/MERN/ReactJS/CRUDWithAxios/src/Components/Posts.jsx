import React, { useEffect, useState } from "react";
import { deletePost, getPost } from "../api/PostApi";
import "../App.css";
import Form from "./Form";

export const Posts = () => {
  const [data, setData] = useState([]);

  const getPostData = async () => {
    const res = await getPost(); // wait for API call
    console.log(res.data); // IMPORTANT: use .data
    setData(res.data);
  };

  //   function to delete
  const handleDeletePost = async (id) => {
    try {
      const res = await deletePost(id);
      if (res.status === 200) {
        const newUpdatedPosts = data.filter((currPost) => {
          return currPost.id !== id;
        });
        setData(newUpdatedPosts);
      }
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getPostData();
  }, []);

  return (
    <>
    <section className="section-form">
        <Form data={data} setData={setData} />
    </section>
    <section className="section-post">
      <ol>
        {data.map((currEle) => {
          const { id, body, title } = currEle;
          return (
            <li key={id}>
              <p>Title: {title}</p>
              <p>Body: {body}</p>
              <button className="btn-edit">Edit</button>
              <button
                className="btn-delete"
                onClick={() => handleDeletePost(id)}
              >
                Delete
              </button>
            </li>
          );
        })}
      </ol>
    </section>
    </>
  );
};
