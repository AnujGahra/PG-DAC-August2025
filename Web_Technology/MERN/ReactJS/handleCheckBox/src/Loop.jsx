import React from 'react'

function Loop() {

    const userData = [
        { name: "Anil", age: "21", email: "anil@gmail.com", id: 1 },
        { name: "Rahul", age: "24", email: "rahul24@gmail.com", id: 2 },
        { name: "Sneha", age: "22", email: "sneha22@gmail.com", id: 3 },
        { name: "Amit", age: "26", email: "amit26@gmail.com", id: 4 },
        { name: "Priya", age: "23", email: "priya23@gmail.com", id: 5 },
        { name: "Karan", age: "25", email: "karan25@gmail.com", id: 6 }
    ];

    return (
        <div style={{ padding: "20px", fontFamily: "Arial" }}>
            <h1 style={{ textAlign: "center", color: "blue", marginBottom: "20px" }}>
                Loop in JSX with Map Function
            </h1>

            <table
                style={{
                    width: "100%",
                    borderCollapse: "collapse",
                    marginBottom: "40px",
                    border: "2px solid black"
                }}
            >
                <thead>
                    <tr style={{ backgroundColor: "#f2f2f2" }}>
                        <td style={{ padding: "10px", border: "1px solid black" }}>Id</td>
                        <td style={{ padding: "10px", border: "1px solid black" }}>Name</td>
                        <td style={{ padding: "10px", border: "1px solid black" }}>Age</td>
                        <td style={{ padding: "10px", border: "1px solid black" }}>Email</td>
                    </tr>
                </thead>

                <tbody>
                    {
                        userData.map(user => (
                            <tr key={user.id}>
                                <td style={{ padding: "8px", border: "1px solid black" }}>{user.id}</td>
                                <td style={{ padding: "8px", border: "1px solid black" }}>{user.name}</td>
                                <td style={{ padding: "8px", border: "1px solid black" }}>{user.age}</td>
                                <td style={{ padding: "8px", border: "1px solid black" }}>{user.email}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>

        </div>
    )
}

export default Loop;
