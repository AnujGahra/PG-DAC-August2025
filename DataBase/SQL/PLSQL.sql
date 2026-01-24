DELIMITER $$

CREATE PROCEDURE SayHello()
BEGIN
    SELECT 'HELLO GOOD MORNING';
END$$

DELIMITER ;

CALL SayHello();


-- Procedure with IN Parameter
DELIMITER $$
CREATE PROCEDURE GreetUser(IN userName VARCHAR(50))
BEGIN
SELECT CONCAT('Hello, ', userName, '!') AS Greeting;
END $$
DELIMITER ;
CALL GreetUser('Ravi');


-- Procedure to add two numbers
DELIMITER $$
CREATE PROCEDURE AddTwoNumbers(IN a INT, IN b INT)
BEGIN
	SELECT a + b AS sum;
END $$
DELIMITER ;

CALL AddTwoNumbers(2, 4);

-- Procedure with OUT Parameter

DELIMITER $$
CREATE PROCEDURE SquareNumber(IN input INT, OUT result INT)
BEGIN
SET result = input * input;
END $$
DELIMITER ;
CALL SquareNumber(3, @out);
SELECT @out;


-- Procedure with INOUT Parameter
DELIMITER $$
CREATE PROCEDURE DoubleValue(INOUT num INT)
BEGIN
SET num = num * 2;
END $$
DELIMITER ;
SET @val = 10;
CALL DoubleValue(@val);
SELECT @val;


DELIMITER $$

CREATE PROCEDURE GreetUser(IN user_name VARCHAR(100))
BEGIN
    SELECT CONCAT('Hello ', user_name, '! Good Morning!') AS Greeting,
           CURDATE() AS TodayDate;
END $$

DELIMITER ;

-- Call it
CALL GreetUser('Anuj');


/*

. Greet user and show current date.


2. Swap two numbers using INOUT.
3. Calculate area and perimeter of rectangle.

*/

DELIMITER $$

CREATE PROCEDURE GreetUser(IN user_name VARCHAR(100))
BEGIN
    SELECT CONCAT('Hello ', user_name, '! Good Morning!') AS Greeting,
           CURDATE() AS TodayDate;
END $$

DELIMITER ;

-- Call it
CALL GreetUser('Anuj');



DELIMITER $$

CREATE PROCEDURE SwapNumbers(INOUT num1 INT, INOUT num2 INT)
BEGIN
    DECLARE temp INT;
    SET temp = num1;
    SET num1 = num2;
    SET num2 = temp;
END $$

DELIMITER ;

-- Call it
SET @a = 10;
SET @b = 20;
CALL SwapNumbers(@a, @b);
SELECT @a AS FirstNumber, @b AS SecondNumber;



DELIMITER $$

CREATE PROCEDURE RectangleDetails(IN length DECIMAL(10,2), IN width DECIMAL(10,2), 
                                  OUT area DECIMAL(10,2), OUT perimeter DECIMAL(10,2))
BEGIN
    SET area = length * width;
    SET perimeter = 2 * (length + width);
END $$

DELIMITER ;

-- Call it
CALL RectangleDetails(5, 3, @area, @perimeter);
SELECT @area AS Area, @perimeter AS Perimeter;


-- FUNCTION IN MySQL
/* ===================================================================
	What is a MySQL Function?
➔ A function is a stored program that returns a single value.
➔ Can be used in SELECT, WHERE, SET clauses.
➔ Similar to procedures but return values.
➔ Called inside SQL expressions.
➔ Q1: What is the main difference between a function and a procedure in
MySQL?
Answer
A function must return a value and can be used in
expressions, unlike procedures.
======================================================================*/

USE datasets;

SHOW TABLES;

SELECT * FROM Customers;
SELECT * FROM employees;
SELECT * FROM orders;

DELIMITER $$
CREATE FUNCTION AddNumbers(a INT, b INT)
RETURNS INT DETERMINISTIC
BEGIN
	RETURN  a + b;
END $$
DELIMITER ;
SELECT AddNumbers(10, 5);


--  FUNCTION WITH STRING MANIPULATION

DELIMITER $$
CREATE FUNCTION Greet(name VARCHAR(50))
RETURNS VARCHAR(50) DETERMINISTIC
BEGIN
	RETURN name;
END $$
DELIMITER ;
SELECT Greet('Anuj Gahra');


DELIMITER $$
CREATE FUNCTION Greet1(name VARCHAR(50))
RETURNS VARCHAR(50) DETERMINISTIC
BEGIN
	RETURN CONCAT('HELLO, ', name);
END $$
DELIMITER ;
SELECT Greet1('Anuj Gahra');

 -- FIND SQUARE OF A NUMBER
DELIMITER $$
CREATE FUNCTION SquareNumber(num INT)
RETURNS INT DETERMINISTIC
BEGIN
	RETURN num*num;
END $$
DELIMITER ;
SELECT SquareNumber(4);

-- Function for Date Calculation
DELIMITER $$
CREATE FUNCTION YearsBetween(startDate DATE, endDate DATE)
RETURNS INT DETERMINISTIC
BEGIN
RETURN YEAR(endDate) - YEAR(startDate);
END $$
DELIMITER ;
SELECT YearsBetween('2010-01-01', '2024-01-01');

-- Function to return area of circle (input radius).
DELIMITER $$
CREATE FUNCTION AreaOfCircle(r INT)
RETURNS INT DETERMINISTIC
BEGIN
	RETURN 3.14 * r * r;
END $$
DELIMITER ;
SELECT AreaOfCircle(20);


-- Function to return reverse of a string.
DELIMITER $$

CREATE FUNCTION CheckEvenOddNumber(a INT)
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
    IF MOD(a, 2) = 0 THEN
        RETURN 'EVEN NUMBER';
    ELSE 
        RETURN 'ODD NUMBER';
    END IF;
END$$

DELIMITER ;

SELECT CheckEvenOddNumber(20) AS Result;

/* ================================================================================================================
	CURSOR
A cursor is a database object that allows you to process query results row by row.
❖ It is used when you need to perform actions on each row individually inside a stored
procedure or trigger.
❖ Useful for complex, conditional, or sequential row processing that a normal SQL query
cannot handle.
   ================================================================================================================ */

-- DECLARE done INT DEFAULT 0;
-- DECLARE name_var VARCHAR(50);
-- DECLARE emp_cursor CURSOR FOR SELECT
-- name FROM employees;
-- DECLARE CONTINUE HANDLER FOR NOT FOUND
-- SET done = 1;
-- OPEN emp_cursor;
-- read_loop: LOOP
-- FETCH emp_cursor INTO name_var;
-- IF done THEN LEAVE read_loop; END IF;
-- SELECT CONCAT('Employee: ', name_var);
-- END LOOP;
-- CLOSE emp_cursor;