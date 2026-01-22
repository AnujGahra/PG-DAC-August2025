import React from 'react'

function App() {
    const collegeData = [
  {
    name: "IET Alwar",
    city: "Alwar",
    website: "https://www.ietalwar.ac.in",
    student: [
      {
        name: "Anil Sidhu",
        age: "29",
        email: "anil@gmail.com"
      },
      {
        name: "Rohit Verma",
        age: "23",
        email: "rohit23@gmail.com"
      },
      {
        name: "Suman Sharma",
        age: "24",
        email: "suman24@gmail.com"
      },
      {
        name: "Anuj Kumar",
        age: "22",
        email: "anuj@gmail.com"
      },
      {
        name: "Shyam",
        age: "22",
        email: "shyam@gmail.com"
      },
      {
        name: "Nitin Sharma",
        age: "22",
        email: "nitin@gmail.com"
      }
    ]
  },
  {
    name: "Rajkiya Engineering College",
    city: "Azamgarh",
    website: "https://recazamgarh.ac.in"
  },
  {
    name: "IIT Kanpur",
    city: "Kanpur",
    website: "https://www.iitk.ac.in"
  },
  {
    name: "NIT Jaipur",
    city: "Jaipur",
    website: "https://www.mnit.ac.in"
  },
  {
    name: "Delhi Technological University",
    city: "Delhi",
    website: "https://www.dtu.ac.in"
  },
  {
    name: "Graphic Era University",
    city: "Dehradun",
    website: "https://geu.ac.in"
  },
  {
    name: "Galgotias University",
    city: "Greater Noida",
    website: "https://www.galgotiasuniversity.edu.in"
  },
  {
    name: "MIT Pune",
    city: "Pune",
    website: "https://mitwpu.edu.in"
  }
];



  return (
    <div>
      {
        collegeData.map((college, index) => {
          <div key={index}>
            <h1>Name: {college.name}</h1>
          </div>
        })
      }
      <h1>Nested Looping with Component</h1>
    </div>
  )
}

export default App