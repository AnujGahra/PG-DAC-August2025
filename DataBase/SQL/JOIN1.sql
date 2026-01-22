SELECT ename, job, dept.deptno, dname
FROM dept, emp
WHERE emp.deptno=ept.deptno AND job='CLEARK'
ORDER BY dept.deptno;

use joins;


CREATE TABLE Customers (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO Customers (id, name)
VALUES 
(1, 'John'),
(2, 'Alice');


CREATE TABLE Orders (
    id INT PRIMARY KEY,
    customer_id INT,
    amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES Customers(id)
);

INSERT INTO Orders (id, customer_id, amount)
VALUES
(1, 1, 250),
(2, 1, 500);


SELECT * FROM Customers;
SELECT * FROM Orders;

-- INNER JOIN
-- SELECT Customers.name, Orders.amount-- 
SELECT * 
FROM Customers
INNER JOIN Orders ON Customers.id = Orders.id;  


-- Full Outer Join
SELECT 
    Customers.id AS Customer_ID,
    Customers.name AS Customer_Name,
    Orders.id AS Order_ID,
    Orders.amount AS Order_Amount
FROM Customers
LEFT JOIN Orders
ON Customers.id = Orders.customer_id

UNION

SELECT 
    Customers.id AS Customer_ID,
    Customers.name AS Customer_Name,
    Orders.id AS Order_ID,
    Orders.amount AS Order_Amount
FROM Customers
RIGHT JOIN Orders
ON Customers.id = Orders.customer_id;


-- COUNT 
SELECT COUNT(*) AS count_mem FROM Customers;



-- NORMALIZATION


-- INDEXES

CREATE INDEX idx_name ON Customers(name); 
SELECT * FROM Customers WHERE name = 'ALICE';






