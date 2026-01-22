import axios from "axios";

const api = axios.create({
  baseURL: "https://jsonplaceholder.typicode.com",
});

// GET method
export const getPost = () => {
  return api.get("/posts");   // correct endpoint
};


// delete method
export const deletePost = (id) => {
    return api.delete(`/posts/${id}`);
};

// post method
export const updatePost = (post) => {
    return api.post("/posts", post);
};