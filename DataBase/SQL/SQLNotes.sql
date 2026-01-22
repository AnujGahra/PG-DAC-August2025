
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


	