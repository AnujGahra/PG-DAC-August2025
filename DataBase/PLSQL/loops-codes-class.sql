CREATE DATABASE loop_lab_db;
USE loop_lab_db;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(30),
    salary DECIMAL(10,2)
);

INSERT INTO employees (name, department, salary) VALUES
('Anita', 'HR', 25000),
('Bhavesh', 'IT', 32000),
('Chitra', 'Finance', 28000),
('Deepak', 'IT', 40000),
('Esha', 'HR', 35000),
('Farhan', 'Finance', 30000);


-- ============================================
-- Question 1: Increase salary of first 3 employees by 10%
-- ============================================
DROP PROCEDURE IF EXISTS loop_increase_salary;
DELIMITER //
CREATE PROCEDURE loop_increase_salary()
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE total INT;
    SELECT COUNT(*) INTO total FROM employees;

    loop_label: LOOP
        IF i > 3 THEN
            LEAVE loop_label;
        END IF;
        UPDATE employees SET salary = salary * 1.10 WHERE id = i;
        SET i = i + 1;
    END LOOP loop_label;
END //
DELIMITER ;
CALL loop_increase_salary();
SELECT * FROM employees;


-- ============================================
-- Question 2: Display all employee names using LOOP
-- ============================================
DROP PROCEDURE IF EXISTS loop_display_names;
DELIMITER //
CREATE PROCEDURE loop_display_names()
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE total INT;
    DECLARE emp_name VARCHAR(50);
    SELECT COUNT(*) INTO total FROM employees;

    display_loop: LOOP
        IF i > total THEN
            LEAVE display_loop;
        END IF;
        SELECT name INTO emp_name FROM employees WHERE id = i;
        SELECT emp_name AS Employee_Name;
        SET i = i + 1;
    END LOOP display_loop;
END //
DELIMITER ;
CALL loop_display_names();

delimiter //
create procedure display_names_all()
begin
	declare i int default 1;
    declare total int;
    declare curr_emp_name varchar(50);
    select count(*) into total from employees;
    create temporary table names_of_employees(emp_name varchar(50));
    display_names_loop:loop
		if i>total then
			leave display_names_loop;
		end if;
        select name into curr_emp_name from employees where id=i;
        insert into names_of_employees values(curr_emp_name);
        set i=i+1;
	end loop;
    select*from names_of_employees;
end //
delimiter ;

call display_names_all();





-- ============================================
-- Question 3: Calculate total salary of all employees using LOOP
-- ============================================
DROP PROCEDURE IF EXISTS loop_total_salary;
DELIMITER //
CREATE PROCEDURE loop_total_salary()
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE total INT;
    DECLARE total_salary DECIMAL(10,2) DEFAULT 0;
    DECLARE sal DECIMAL(10,2);
    SELECT COUNT(*) INTO total FROM employees;

    salary_loop: LOOP
        IF i > total THEN
            LEAVE salary_loop;
        END IF;
        SELECT salary INTO sal FROM employees WHERE id = i;
        SET total_salary = total_salary + sal;
        SET i = i + 1;
    END LOOP salary_loop;
    SELECT total_salary AS Total_Salary;
END //
DELIMITER ;
CALL loop_total_salary();



-- ============================================
-- Question 4: Insert 3 new temporary employees into the table using LOOP
-- ============================================
DROP PROCEDURE IF EXISTS loop_insert_temps;
DELIMITER //
CREATE PROCEDURE loop_insert_temps()
BEGIN
    DECLARE i INT DEFAULT 1;
    temp_loop: LOOP
        IF i > 3 THEN
            LEAVE temp_loop;
        END IF;
        INSERT INTO employees(name, department, salary)
        VALUES (CONCAT('TempEmp', i), 'Temp', 20000);
        SET i = i + 1;
    END LOOP temp_loop;
END //
DELIMITER ;
CALL loop_insert_temps();
SELECT * FROM employees;


-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================




-- ============================================
-- Question 5: Display employees having salary greater than ₹30,000 using WHILE
-- ============================================
DROP PROCEDURE IF EXISTS while_high_salary;
DELIMITER //
CREATE PROCEDURE while_high_salary()
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE total INT;
    DECLARE sal DECIMAL(10,2);
    DECLARE emp_name VARCHAR(50);
    SELECT COUNT(*) INTO total FROM employees;

    WHILE i <= total DO
        SELECT salary, name INTO sal, emp_name FROM employees WHERE id = i LIMIT 1;
        IF sal > 30000 THEN
            SELECT emp_name AS Name, sal AS Salary;
        END IF;
        SET i = i + 1;
    END WHILE;
END //
DELIMITER ;
CALL while_high_salary();


-- ============================================
-- Question 6: Increase one employee’s salary until it reaches ₹50,000 using WHILE
-- ============================================
DROP PROCEDURE IF EXISTS while_increase_until;
DELIMITER //
CREATE PROCEDURE while_increase_until()
BEGIN
    DECLARE sal DECIMAL(10,2);
    DECLARE emp_name VARCHAR(50);
    SELECT salary, name INTO sal, emp_name FROM employees WHERE id = 1;
    WHILE sal < 50000 DO
        SET sal = sal + 5000;
        SELECT CONCAT(emp_name, ' salary increased to ', sal) AS Progress;
    END WHILE;
END //
DELIMITER ;
CALL while_increase_until();


-- ============================================
-- Question 7: Count total IT department employees using WHILE
-- ============================================
DROP PROCEDURE IF EXISTS while_count_it;
DELIMITER //
CREATE PROCEDURE while_count_it()
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE total INT;
    DECLARE dept VARCHAR(30);
    DECLARE count_it INT DEFAULT 0;
    SELECT COUNT(*) INTO total FROM employees;

    WHILE i <= total DO
        SELECT department INTO dept FROM employees WHERE id = i;
        IF dept = 'IT' THEN
            SET count_it = count_it + 1;
        END IF;
        SET i = i + 1;
    END WHILE;
    SELECT count_it AS Total_IT_Employees;
END //
DELIMITER ;
CALL while_count_it();




-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================
-- ====================================================================================================================================



-- ============================================
-- Question 8: Add ₹5,000 to one employee’s salary until it exceeds ₹40,000 using REPEAT
-- ============================================
DROP PROCEDURE IF EXISTS repeat_add_salary;
DELIMITER //
CREATE PROCEDURE repeat_add_salary()
BEGIN
    DECLARE sal DECIMAL(10,2);
    DECLARE emp_name VARCHAR(50);
    SELECT salary, name INTO sal, emp_name FROM employees WHERE id = 2;
    REPEAT
        SET sal = sal + 5000;
        SELECT CONCAT('New salary of ', emp_name, ' is ', sal) AS Info;
    UNTIL sal > 40000
    END REPEAT;
END //
DELIMITER ;
CALL repeat_add_salary();

-- ============================================
-- Question 9: Insert employees until 10 total records exist using REPEAT
-- ============================================
DROP PROCEDURE IF EXISTS repeat_insert_until10;
DELIMITER //
CREATE PROCEDURE repeat_insert_until10()
BEGIN
    DECLARE total INT;
    SELECT COUNT(*) INTO total FROM employees;
    REPEAT
        INSERT INTO employees(name, department, salary)
        VALUES (CONCAT('ExtraEmp', total + 1), 'Support', 25000);
        SELECT COUNT(*) INTO total FROM employees;
    UNTIL total >= 10
    END REPEAT;
END //
DELIMITER ;
CALL repeat_insert_until10();
SELECT * FROM employees;

-- ============================================
-- Question 20: Display all employee salaries using REPEAT
-- ============================================
DROP PROCEDURE IF EXISTS repeat_display_salaries;
DELIMITER //
CREATE PROCEDURE repeat_display_salaries()
BEGIN
   DECLARE i INT DEFAULT 1;
   DECLARE total INT;
   DECLARE emp_name VARCHAR(50);
   DECLARE sal DECIMAL(10,2);
   SELECT COUNT(*) INTO total FROM employees;

   REPEAT
       SELECT name, salary INTO emp_name, sal FROM employees WHERE id = i;
       SELECT CONCAT(emp_name, ' earns ₹', sal) AS Employee_Salary;
       SET i = i + 1;
   UNTIL i > total
   END REPEAT;
END //
DELIMITER ;
CALL repeat_display_salaries();


DROP PROCEDURE IF EXISTS repeat_display_salaries;
DELIMITER //
CREATE PROCEDURE repeat_display_salaries()
BEGIN
   DECLARE i INT DEFAULT 1;
   DECLARE total INT;
   DECLARE emp_name VARCHAR(50);
   DECLARE sal DECIMAL(10,2);

   -- Create a temporary table to store results
   CREATE TEMPORARY TABLE temp_salaries (
       message VARCHAR(100)
   );

   SELECT COUNT(*) INTO total FROM employees;

   REPEAT
       SELECT name, salary INTO emp_name, sal FROM employees WHERE id = i;
       INSERT INTO temp_salaries VALUES (CONCAT(emp_name, ' earns ₹', sal));
       SET i = i + 1;
   UNTIL i > total
   END REPEAT;

   -- Display all messages
   SELECT * FROM temp_salaries;

   -- Drop the temporary table
   DROP TEMPORARY TABLE temp_salaries;
END //
DELIMITER ;

-- Call the procedure
CALL repeat_display_salaries();
