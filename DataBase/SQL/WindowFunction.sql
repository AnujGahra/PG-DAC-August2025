-- Window Function in SQL

Use mac;


 CREATE TABLE students1 (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(50),
    marks INT
);

INSERT INTO students1 (student_id, name, branch, marks)
VALUES (1, 'Anuj Kumar', 'CSE', 88);


INSERT INTO students1 (student_id, name, branch, marks)
VALUES
(2, 'Ravi Singh', 'ECE', 76),
(3, 'Priya Sharma', 'IT', 92),
(4, 'Rahul Verma', 'ME', 81),
(5, 'Sneha Gupta', 'CSE', 95);


SELECT * FROM students1;


-- Find all the students who have marks higher than the avg marks of their respective branch
SELECT *, AVG(marks) OVER (PARTITION BY branch) FROM students1;

