import {BrowserRouter, Routes, Route, Link, Navigate} from "react-router";
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contact";
import Navbar from "./Components/Navbar";
import NotFound from "./Components/NotFound";

function App() {
  return (
    <div>
      {/* <BrowserRouter>
      
      <Link to="/">Home</Link>
      <Link to="/about">About</Link>
      <Link to="/contact">Contact</Link>
      
          <Routes>
            <Route path="/" element={<h1>This is Home component</h1>}/>
            <Route path="/about" element={<h1>This is About component</h1>}/>
            <Route path="/contact" element={<h1>This is Contact component</h1>}/>
          </Routes>
      </BrowserRouter> */}
       <Navbar/>
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
        <Route path="/contact" element={<Contact/>}/>
        {/* <Route path="/*" element={<NotFound/>}/> */}
        <Route path="/*" element={<Navigate to={'/'} />}/>
      </Routes>
    </div>
  )
}

export default App