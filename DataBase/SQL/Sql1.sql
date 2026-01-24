-- CREATE DATABASE
CREATE DATABASE cdac_db;

USE cdac_db;

-- CREATE Student TABLE
CREATE TABLE Student(
id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
age INT,
email VARCHAR(100) UNIQUE,
marks DECIMAL(5, 2),
city VARCHAR(30) DEFAULT 'Delhi'
);


-- CREATE Course TABLE
CREATE TABLE Course (
	course_id INT PRIMARY KEY,
    course_name VARCHAR(50)
);

-- CREATE Enrollment Table


CREATE TABLE Enrollment (
    enroll_id INT PRIMARY KEY,
    student_id INT,   
    course_id INT,
    FOREIGN KEY (student_id) REFERENCES Student(id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);

-- CREATE VIEW
CREATE VIEW student_view AS
SELECT name, marks FROM Student;

-- CREATE INDEX
CREATE INDEX idx_student_name ON Student(name);

