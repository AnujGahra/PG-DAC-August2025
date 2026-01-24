
-- CREATE DATABASE With datasets name
CREATE DATABASE datasets;

-- use dataset for perform operation
USE datasets;

SELECT * FROM customers;
SELECT * FROM employees;
SELECT * FROM orders;
SELECT * FROM ordersarchive;
SELECT * FROM products;



SELECT distinct * FROM Customers WHERE Country NOT LIKE '%a' AND COUNTRY NOT LIKE '%e' AND COUNTRY NOT LIKE '%i' AND COUNTRY NOT LIKE '%o' AND COUNTRY NOT LIKE '%u' ; 


SELECT distinct country FROM Customers WHERE LEFT (COUNTRY,2) NOT IN ('A','E','I','O','U');


SELECT distinct * FROM Customers WHERE LEFT (COUNTRY,2) NOT IN ('ge');


-- Retrieve each customer's name, country, and score.

SELECT FirstName,  Country, Score FROM Customers;

-- Retrieve customers with a score not equal to 0
SELECT * FROM Customers WHERE Score <> 0;

-- Retrieve customers from Germany
SELECT * FROM Customers WHERE Country = 'Germany';

-- OR

SELECT * FROM Customers WHERE Country IN ('Germany');

-- Retrieve the name and country of customers from Germany
SELECT 
    CONCAT(firstname, ' ', lastname) AS Customer_name,
    country AS Customer_Country
FROM customers
WHERE country = 'Germany';


/* ================================ ORDER BY =============================

*/ 
/* Retrieve all customers and 
   sort the results by the highest score first. */
   SELECT * FROM Customers ORDER BY Score DESC;
   
   /* Retrieve all customers and 
   sort the results by the lowest score first. */
   
   SELECT * FROM Customers ORDER BY Score;
   
   /* Retrieve all customers and 
   sort the results by the country. */
   
   SELECT * FROM Customers ORDER BY Country;
   
   SELECT * FROM Customers ORDER BY Country DESC;
   
   
   /* Retrieve all customers and 
   sort the results by the country and then by the highest score. */
   SELECT * FROM Customers ORDER BY Country ASC, Score DESC;
   
   
   /* Retrieve the name, country, and score of customers 
   whose score is not equal to 0
   and sort the results by the highest score first. */
   SELECT 
	CONCAT(Firstname, ' ', LastName),
    Country,
    Score
FROM Customers
WHERE Score != 0
ORDER BY Score DESC;


/*
============================== GROUP BY =================================================

*/
-- Find the total score for each country

SELECT Country,
	SUM(Score) AS Total_Score
FROM Customers
GROUP BY COUNTRY;

SELECT Country,
	SUM(Score) AS Total_Score
FROM Customers
GROUP BY COUNTRY ORDER BY Total_Score DESC, Country ASC;


-- Find the total score and total number of customers for each country
SELECT Country,
	SUM(SCORE) AS Total_Score,
    SUM(CustomerID) AS Total_Customer
FROM Customers
GROUP BY Country;

/*
======================================= HAVING ====================================
*/


/* Find the average score for each country
   and return only those countries with an average score greater than 430 */
SELECT Country,
	AVG(Score) AS Avg_Score
FROM Customers
GROUP BY Country
HAVING AVG(Score) > 430;


/* Find the average score for each country
   considering only customers with a score not equal to 0
   and return only those countries with an average score greater than 430 */
   
SELECT Country,
	AVG(Score) AS Avg_Score
FROM Customers
WHERE Score != 0
GROUP BY Country
HAVING AVG(Score) > 430;


/* ==============================================================================
   DISTINCT
=============================================================================== */

-- Return Unique list of all countries
SELECT DISTINCT Country FROM Customers;


/* ==============================================================================
   Limit
=============================================================================== */

-- Retrieve only 3 Customers
SELECT * FROM Customers LIMIT 3;

-- Retrieve the Top 3 Customers with the Highest Scores
SELECT * FROM Customers ORDER BY Score DESC LIMIT 3;

-- Retrieve the Lowest 2 Customers based on the score
SELECT * 
FROM Customers 
ORDER BY Score
LIMIT 2;

-- Get the Two Most Recent Orders
SELECT * 
FROM Orders
ORDER BY OrderDate LIMIT 2;

-- OR -----

SELECT * 
FROM Orders
ORDER BY STR_TO_DATE(OrderDate,'%Y-%M-%D') LIMIT 2;
	

/* ==============================================================================
   All Together
=============================================================================== */

/* Calculate the average score for each country 
   considering only customers with a score not equal to 0
   and return only those countries with an average score greater than 430
   and sort the results by the highest average score first. */
SELECT Country,
	AVG(Score) AS Avg_Score
FROM Customers
WHERE Score != 0
GROUP BY Country
HAVING AVG(Score) > 430
ORDER BY AVG(Score) DESC;

/* ============================================================================== 
   COOL STUFF - Additional SQL Features
=============================================================================== */
-- Execute multiple queries at once
SELECT * FROM customers;
SELECT * FROM orders;

/* Selecting Static Data */
-- Select a static or constant value without accessing any table
SELECT 123 AS static_number;

SELECT 'Hello' AS static_string;

-- Assign a constant value to a column in a query
SELECT
    CustomerID,
    FirstName,
    'New Customer' AS customer_type
FROM customers;


/* ==============================================================================
   SQL Data Manipulation Language (DML)
-------------------------------------------------------------------------------
   This guide covers the essential DML commands used for inserting, updating, 
   and deleting data in database tables.

   Table of Contents:
     1. INSERT - Adding Data to Tables
     2. UPDATE - Modifying Existing Data
     3. DELETE - Removing Data from Tables
=================================================================================
*/

/* ============================================================================== 
   SQL Filtering Data
-------------------------------------------------------------------------------
   This document provides an overview of SQL filtering techniques using WHERE 
   and various operators for precise data retrieval.

   Table of Contents:
     1. Comparison Operators
        - =, <>, >, >=, <, <=
     2. Logical Operators
        - AND, OR, NOT
     3. Range Filtering
        - BETWEEN
     4. Set Filtering
        - IN
     5. Pattern Matching
        - LIKE
=================================================================================
*/

/* ============================================================================== 
   COMPARISON OPERATORS
=============================================================================== */

-- Retrieve all customers from Germany.
SELECT * FROM Customers WHERE Country = 'Germany';

-- Retrieve all customers who are not from Germany.
SELECT * FROM Customers WHERE Country <> 'Germany';

-- Retrieve all customers with a score greater than 500.
SELECT * FROM Customers WHERE Score > 500;

-- Retrieve all customers with a score of 500 or more.
SELECT * FROM Customers WHERE Score >= 500;

-- Retrieve all customers with a score less than 500.
SELECT * FROM Customers WHERE Score < 500;

-- Retrieve all customers with a score of 500 or less.
SELECT * FROM Customers WHERE Score <= 500;

/* ============================================================================== 
   LOGICAL OPERATORS
=============================================================================== */

/* Combining conditions using AND, OR, and NOT */

-- Retrieve all customers who are from the USA and have a score greater than 500.
SELECT * FROM Customers WHERE Country = 'USA' AND Score > 500;

-- Retrieve all customers with a score not less than 500.
SELECT * FROM Customers WHERE NOT Score < 500;

/* ============================================================================== 
   RANGE FILTERING - BETWEEN
=============================================================================== */

-- Retrieve all customers whose score falls in the range between 100 and 500.
SELECT * FROM Customers WHERE SCORE BETWEEN 100 AND 500;

-- Retrieve all customers from either Germany or the USA.
SELECT * FROM Customers WHERE Country IN ('Germany', 'USA');

SELECT * FROM Customers WHERE Country = 'Germany' OR Country = 'USA';

/* ============================================================================== 
   PATTERN MATCHING - LIKE
=============================================================================== */

-- Find all customers whose first name starts with 'M'.
SELECT * FROM Customers WHERE FirstName LIKE 'M%';

-- Find all customers whose first name ends with 'n'.
SELECT * FROM Customers WHERE FirstName LIKE '%n';

-- Find all customers whose first name contains 'r'.
SELECT * FROM Customers WHERE FirstName LIKE '%r%';

-- Find all customers whose first name has 'r' in the third position.
SELECT * FROM Customers WHERE FirstName LIKE '__r%';


/* ==============================================================================
   SQL Joins 
-------------------------------------------------------------------------------
   This document provides an overview of SQL joins, which allow combining data
   from multiple tables to retrieve meaningful insights.

   Table of Contents:
     1. Basic Joins
        - INNER JOIN
        - LEFT JOIN
        - RIGHT JOIN
        - FULL JOIN
     2. Advanced Joins
        - LEFT ANTI JOIN
        - RIGHT ANTI JOIN
        - ALTERNATIVE INNER JOIN
        - FULL ANTI JOIN
        - CROSS JOIN
     3. Multiple Table Joins (4 Tables)
=================================================================================
*/

/* ============================================================================== 
   BASIC JOINS 
=============================================================================== */

-- No Join
/* Retrieve all data from customers and orders as separate results */
SELECT * FROM customers;
SELECT * FROM orders;
SELECT * FROM products;
SELECT * FROM employees;

-- INNER JOIN
/* Get all customers along with their orders, 
   but only for customers who have placed an order */
   
SELECT 
	c.CustomerID, 
    c.FirstName, 
    o.OrderID, 
    o.Sales 
FROM Customers AS c
INNER JOIN Orders AS o 
ON c.CustomerID = O.CustomerID;

-- LEFT JOIN
/* Get all customers along with their orders, 
   including those without orders */
SELECT 
	c.CustomerID, 
    c.FirstName, 
    o.OrderID, 
    o.Sales 
FROM Customers AS c
LEFT JOIN Orders AS o 
ON c.CustomerID = O.CustomerID;

-- RIGHT JOIN
/* Get all customers along with their orders, 
   including orders without matching customers */
SELECT 
	c.CustomerID, 
    c.FirstName, 
    o.OrderID, 
    o.Sales 
FROM Customers AS c
RIGHT JOIN Orders AS o 
ON c.CustomerID = O.CustomerID;

-- FULL JOIN
/* Get all customers and all orders, even if there’s no match */
SELECT 
    c.CustomerID, 
    c.FirstName, 
    o.OrderID, 
    o.Sales
FROM Customers AS c
LEFT JOIN Orders AS o 
    ON c.CustomerID = o.CustomerID

UNION

SELECT 
    c.CustomerID, 
    c.FirstName, 
    o.OrderID, 
    o.Sales
FROM Customers AS c
RIGHT JOIN Orders AS o 
    ON c.CustomerID = o.CustomerID;


/* ============================================================================== 
   ADVANCED JOINS
=============================================================================== */

-- LEFT ANTI JOIN
/* Get all customers who haven't placed any order */
SELECT * 
FROM Customers c
LEFT JOIN Orders o
ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL ;

SELECT c.*
FROM Customers c
LEFT JOIN Orders o
ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL;

-- RIGHT ANTI JOIN
/* Get all orders without matching customers */
SELECT *
FROM Customers c
RIGHT JOIN Orders o
ON c.CustomerID = o.CustomerID
WHERE c.CustomerID IS NULL ;

-- Alternative to RIGHT ANTI JOIN using LEFT JOIN
/* Get all orders without matching customers */
SELECT *
FROM Orders AS o 
LEFT JOIN Customers AS c
ON c.CustomerID = o.CustomerID
WHERE c.CustomerID IS NULL;

-- CROSS JOIN
/* Generate all possible combinations of customers and orders */
SELECT *
FROM Customers
CROSS JOIN Orders;

SELECT * 
FROM Customers, Orders;


/* ============================================================================== 
   MULTIPLE TABLE JOINS (4 Tables)
=============================================================================== */

/* Task: Using SalesDB, Retrieve a list of all orders, along with the related customer, product, 
   and employee details. For each order, display:
   - Order ID
   - Customer's name
   - Product name
   - Sales amount
   - Product price
   - Salesperson's name */
   
SELECT 
    c.CustomerID, 
    c.FirstName, 
    o.OrderID, 
    p.ProductName,
    s.ShipperName
FROM Customers c
INNER JOIN Orders o 
    ON c.CustomerID = o.CustomerID
INNER JOIN OrderDetails od 
    ON o.OrderID = od.OrderID
INNER JOIN Products p 
    ON od.ProductID = p.ProductID
INNER JOIN Shippers s 
    ON o.ShipperID = s.ShipperID;


/* ==============================================================================
   SQL SET Operations
-------------------------------------------------------------------------------
   SQL set operations enable you to combine results from multiple queries
   into a single result set. This script demonstrates the rules and usage of
   set operations, including UNION, UNION ALL, EXCEPT, and INTERSECT.
   
   Table of Contents:
     1. SQL Operation Rules
     2. UNION
     3. UNION ALL
     4. EXCEPT
     5. INTERSECT
=================================================================================
*/

/* ==============================================================================
   RULES OF SET OPERATIONS
===============================================================================*/

/* RULE: Data Types
   The data types of columns in each query should match.
*/

SELECT
    FirstName,
    LastName,
    Country
FROM Customers

UNION

SELECT
    FirstName,
    LastName,
    NULL AS Country
FROM Employees;



/* TASK 1: 
   Combine the data from Employees and Customers into one table using UNION 
*/
SELECT
    FirstName,
    LastName
FROM Customers
UNION
SELECT
    FirstName,
    LastName
FROM Employees;

/* TASK 2: 
   Combine the data from Employees and Customers into one table, including duplicates, using UNION ALL 
*/
SELECT
	CONCAT(FirstName, ' ', LastName) AS CustomerName
FROM Customers
UNION ALL
SELECT 
	CONCAT(FirstName, ' ', LastName) AS EmployeeName
FROM Employees;


/* TASK 3: 
   Find employees who are NOT customers using EXCEPT 
*/



SELECT 
    e.FirstName,
    e.LastName
FROM Employees AS e
LEFT JOIN Customers AS c
    ON e.FirstName = c.FirstName 
    AND e.LastName = c.LastName
WHERE c.FirstName IS NULL;

/* TASK 4: 
   Find employees who are also customers using INTERSECT 
*/
-- SELECT
--     FirstName,
--     LastName
-- FROM Employees
-- INTERSECT
-- SELECT
--     FirstName,
--     LastName
-- FROM Customers;

SELECT 
    e.FirstName,
    e.LastName
FROM Employees AS e
INNER JOIN Customers AS c
    ON e.FirstName = c.FirstName 
    AND e.LastName = c.LastName;


/* ============================================================================== 
   SQL String Functions
-------------------------------------------------------------------------------
   This document provides an overview of SQL string functions, which allow 
   manipulation, transformation, and extraction of text data efficiently.

   Table of Contents:
     1. Manipulations
        - CONCAT
        - LOWER
        - UPPER
	- TRIM
	- REPLACE
     2. Calculation
        - LEN
     3. Substring Extraction
        - LEFT
        - RIGHT
        - SUBSTRING
=================================================================================
*/

/* ============================================================================== 
   CONCAT() - String Concatenation
=============================================================================== */

-- Concatenate first name and country into one column
SELECT 
    CONCAT(FirstName, '-', Country) AS full_info
FROM customers;

/* ============================================================================== 
   LOWER() & UPPER() - Case Transformation
=============================================================================== */

-- Convert the first name to lowercase
SELECT 
    LOWER(FirstName) AS lower_case_name
FROM customers;

-- Convert the first name to uppercase
SELECT 
    UPPER(FirstName) AS upper_case_name
FROM customers;

/* ============================================================================== 
   TRIM() - Remove White Spaces
=============================================================================== */

-- Find customers whose first name contains leading or trailing spaces
SELECT 
    FirstName,
	LENGTH(FirstName) len_name,
	LENGTH(TRIM(FirstName)) len_trim_name,
	LENGTH(FirstName) - LENGTH(TRIM(FirstName)) flag
FROM customers
WHERE LENGTH(FirstName)  != LENGTH(TRIM(FirstName));

SELECT TRIM('   Anuj Kumar   ') AS TrimmedString;


/* ============================================================================== 
   LEN() - String Length & Trimming
=============================================================================== */

-- Calculate the length of each customer's first name
SELECT 
    FirstName, 
    LENGTH(FirstName) AS name_length
FROM Customers;

SELECT LEN('Anuj Kumar') AS TrimmedString;


-- Retrieve a list of customers' first names after removing the first character
SELECT 
    FirstName,
    SUBSTRING(TRIM(FirstName), 2, LENGTH(FirstName)) AS trimmed_name
FROM customers	;

/* ==============================================================================
   NESTING FUNCTIONS
===============================================================================*/

-- Nesting
SELECT
FirstName, 
UPPER(LOWER(FirstName)) AS nesting
FROM customers;



/* ==============================================================================
   SQL Date & Time Functions
-------------------------------------------------------------------------------
   This script demonstrates various date and time functions in SQL.
   It covers functions such as GETDATE, DATETRUNC, DATENAME, DATEPART,
   YEAR, MONTH, DAY, EOMONTH, FORMAT, CONVERT, CAST, DATEADD, DATEDIFF,
   and ISDATE.
   
   Table of Contents:
     1. GETDATE | Date Values
     2. Date Part Extractions (DATETRUNC, DATENAME, DATEPART, YEAR, MONTH, DAY)
     3. DATETRUNC
     4. EOMONTH
     5. Date Parts
     6. FORMAT
     7. CONVERT
     8. CAST
     9. DATEADD / DATEDIFF
    10. ISDATE
===============================================================================
*/

/* ==============================================================================
   Now() | DATE VALUES
===============================================================================*/

/* TASK 1:
   Display OrderID, CreationTime, a hard-coded date, and the current system date.
*/
SELECT
    OrderID,
    CreationTime,
    '2025-08-20' AS HardCoded,
    NOW() AS Today
FROM Orders;

/* TASK 2:
   Extract various parts of CreationTime using DATETRUNC, DATENAME, DATEPART,
   YEAR, MONTH, and DAY.
*/
SELECT
    CreationTime,
    -- Truncate to year, month, day
    DATETRUNC(year, CreationTime) AS TruncatedToYear,
    DATETRUNC(month, CreationTime) AS TruncatedToMonth,
    DATETRUNC(day, CreationTime) AS TruncatedToDay,

    -- Get name of day, month
    DATENAME(weekday, CreationTime) AS WeekdayName,
    DATENAME(month, CreationTime) AS MonthName,

    -- Get numeric parts of date
    DATEPART(year, CreationTime) AS YearPart,
    DATEPART(month, CreationTime) AS MonthPart,
    DATEPART(day, CreationTime) AS DayPart,

    -- Alternative functions
    YEAR(CreationTime) AS YearFunc,
    MONTH(CreationTime) AS MonthFunc,
    DAY(CreationTime) AS DayFunc
FROM Orders;



/* ==============================================================================
   SQL Window Ranking Functions
-------------------------------------------------------------------------------
   These functions allow you to rank and order rows within a result set 
   without the need for complex joins or subqueries. They enable you to assign 
   unique or non-unique rankings, group rows into buckets, and analyze data 
   distributions on ordered data.

   Table of Contents:
     1. ROW_NUMBER
     2. RANK
     3. DENSE_RANK
     4. NTILE
     5. CUME_DIST
=================================================================================
*/

/* ============================================================
   SQL WINDOW RANKING | ROW_NUMBER, RANK, DENSE_RANK
   ============================================================ */
   
   /* TASK 1:
   Rank Orders Based on Sales from Highest to Lowest
*/
SELECT
    OrderID,
    ProductID,
    Sales,
    ROW_NUMBER() OVER (ORDER BY Sales DESC) AS SalesRank_Row,
    RANK() OVER (ORDER BY Sales DESC) AS SalesRank_Rank,
    DENSE_RANK() OVER (ORDER BY Sales DESC) AS SalesRank_Dense
FROM Orders;



/* ==============================================================================
   SQL Common Table Expressions (CTEs)
-------------------------------------------------------------------------------
   This script demonstrates the use of Common Table Expressions (CTEs) in SQL Server.
   It includes examples of non-recursive CTEs for data aggregation and segmentation,
   as well as recursive CTEs for generating sequences and building hierarchical data.

   Table of Contents:
     1. NON-RECURSIVE CTE
     2. RECURSIVE CTE | GENERATE SEQUENCE
     3. RECURSIVE CTE | BUILD HIERARCHY
===============================================================================

/* ==============================================================================
   NON-RECURSIVE CTE
===============================================================================*/


-- Step1: Find the total Sales Per Customer (Standalone CTE)
WITH CTE_Total_Sales AS
(
    SELECT
        CustomerID,
        SUM(Sales) AS TotalSales
    FROM Orders
    GROUP BY CustomerID
)
-- Must follow with a SELECT that uses the CTE
SELECT *
FROM CTE_Total_Sales;





-- Create the view
CREATE VIEW temp_Table AS
SELECT FirstName
FROM Customers
WHERE CustomerID = 2;
SELECT * FROM temp_Table;


-- What is a Stored Procedure?
-- A stored procedure is a precompiled set of SQL statements stored in the database under a unique name.

DELIMITER $$

CREATE PROCEDURE ADDUsers1(
    IN P_Name VARCHAR(100),
    IN P_email VARCHAR(100)
)
BEGIN
    INSERT INTO ADDUsers1(name, email) 
    VALUES (P_Name, P_email);
END
$$

DELIMITER ;

CALL ADDUsers1('ANUJ GAHRA', 'anujgahra244304@gmail.com');


DELIMITER $$
CREATE PROCEDURE SayHello2()
BEGIN
SELECT 'Hello from MySQL!';
END $$
DELIMITER ;
CALL SayHello2();

DELIMITER $$
CREATE PROCEDURE SayGreet()
BEGIN
SELECT 'Hello Good morning' as GreetMSG;
SELECT 'Hello Good afternoon' as GreetNoon;
END $$
DELIMITER ;
CALL SayGreet();