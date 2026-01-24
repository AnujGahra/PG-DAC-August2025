-- Create Database and Use Database
CREATE DATABASE MedicalStoreDB;
USE MedicalStoreDB;

-- Create first table 
CREATE TABLE Medicine (
    med_id INT,
    med_name VARCHAR(50),
    price DECIMAL(10,2),
    category VARCHAR(30)
);

-- Create Table 2
CREATE TABLE Supplier (
    supplier_id INT,
    supplier_name VARCHAR(50),
    city VARCHAR(30)
); 

-- Create Table 3
CREATE TABLE Sales (
    sale_id INT,
    med_id INT,
    quantity INT,
    sale_date DATE
); 

-- Add Primary Key to each Table
ALTER TABLE Medicine
ADD PRIMARY KEY (med_id);

ALTER TABLE Supplier
ADD PRIMARY KEY (supplier_id);

ALTER TABLE Sales
ADD PRIMARY KEY (sale_id);

-- 3. Connect atleast 2 tables using foreign key

ALTER TABLE Sales
ADD CONSTRAINT fk_medicine
FOREIGN KEY (med_id) REFERENCES Medicine(med_id); 

-- 4. Insert minimum 3 record in each table

INSERT INTO Medicine VALUES
(1, 'Paracetamol', 25.00, 'Tablet'),
(2, 'Cough Syrup', 120.00, 'Syrup'),
(3, 'Vitamin C', 80.00, 'Tablet');

INSERT INTO Supplier VALUES
(101, 'ABC Pharma', 'Mumbai'),
(102, 'HealthCare Ltd', 'Pune'),
(103, 'MediLife', 'Delhi');

INSERT INTO Sales VALUES
(1001, 1, 5, '2025-01-10'),
(1002, 2, 2, '2025-01-11'),
(1003, 3, 10, '2025-01-12');

-- write command to sort the result based on name
SELECT * FROM Medicine
ORDER BY med_name; 

-- write an appropriate command to use where with OR clause.
SELECT * FROM Medicine
WHERE category = 'Tablet' OR price > 100;

-- Write command to show first five records from any one table.
SELECT * FROM Sales
LIMIT 5; 

-- write command with condition to use 'between' key word
SELECT * FROM Medicine
WHERE price BETWEEN 50 AND 150;


-- Write a command for appropriate and logical use of Group By Clause
SELECT category, COUNT(*) AS total_medicines
FROM Medicine
GROUP BY category; 

-- Write a command to use Left Join
SELECT s.sale_id, m.med_name, s.quantity
FROM Sales s
LEFT JOIN Medicine m
ON s.med_id = m.med_id;

-- Cretae a tempory table. write command to remove this table permantaly
CREATE TEMPORARY TABLE Temp_Medicine (
    med_name VARCHAR(50),
    price DECIMAL(10,2)
); 

-- REMOVE TEMPORARY TABLE PERMANENTLY
DROP TEMPORARY TABLE Temp_Medicine;

-- create at least one procudure(with one input and one output parameter) based on the created tables with appropriate utility
DELIMITER $$

CREATE PROCEDURE GetMedicinePrice (
    IN p_med_id INT,
    OUT p_price DECIMAL(10,2)
)
BEGIN
    SELECT price INTO p_price
    FROM Medicine
    WHERE med_id = p_med_id;
END$$

DELIMITER ; 

-- Create a one trigger of before update on any one of the table 

DELIMITER $$

CREATE TRIGGER before_price_update
BEFORE UPDATE ON Medicine
FOR EACH ROW
BEGIN

    IF NEW.price < 0 THEN
        SET NEW.price = OLD.price;
    END IF;
END$$

DELIMITER ; 

