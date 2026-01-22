USE dac42;

-- 1. Select all information from Salgrade table.
SELECT * 
FROM salgrade;

-- 2. Select all information from emp table.
SELECT * 
FROM emp;

-- 3. Select all information from dept table.
SELECT * 
FROM dept;

-- 4. List all employees who have a salary between 1000 and 2000.
SELECT * 
FROM emp 
WHERE sal BETWEEN 1000 AND 2000;

-- 5. List department numbers and names in department name order.
SELECT deptno, dname 
FROM dept 
ORDER BY deptno;

-- 6. Display all the different job types.
SELECT DISTINCT job 
FROM emp;

-- 7. List the details of employees in departments 10 and 20 
--    in alphabetical order of employee names.
SELECT e.*, d.dname 
FROM emp e
JOIN dept d ON e.deptno = d.deptno
WHERE d.deptno IN (10, 20)
ORDER BY e.ename;

-- 8. List names and jobs of all clerks in department 20.
SELECT ename, job, deptno 
FROM emp 
WHERE deptno = 20 
  AND job = 'CLERK';

-- 9. Display all employee names which have 'TH' or 'LL' in them.
SELECT ename 
FROM emp 
WHERE ename REGEXP 'TH|LL';

-- 10. List the details of the employees who have a manager.
SELECT * 
FROM emp 
WHERE job = 'MANAGER';

-- 11. Display the name and the total remuneration for all employees.
SELECT ename, 
       sal + IFNULL(comm, 0) AS total_remuneration 
FROM emp;

-- 12. Display name, annual salary, and commission of all salespeople 
--     whose monthly salary is greater than their commission. 
--     Output should be ordered by salary (highest first), 
--     then by employee name.
SELECT ename, 
       sal * 12 AS annual_salary, 
       IFNULL(comm, 0) AS commission, 
       job 
FROM emp 
WHERE sal > IFNULL(comm, 0) 
  AND job = 'SALESMAN' 
ORDER BY sal DESC, ename;

-- 13. Display all employees who were hired during 1982.
SELECT * 
FROM emp 
WHERE YEAR(STR_TO_DATE(hiredate, '%d-%b-%y')) = 1982;

-- 14. Display the employee name and job by concatenating them 
--     with an appropriate heading.
SELECT CONCAT(ENAME,' ',JOB) AS  ENAME_WITH_JOB FROM EMP;

-- 15. Display the employee name and the job in brackets.
SELECT CONCAT(ENAME,'(',JOB,')') FROM EMP;

-- 16. Display the job of salesman as salesperson for department 30 employees.
select ename,if(job='SalesMan','SalesPerson',job) as job_title from emp
where deptno = 30 ;

