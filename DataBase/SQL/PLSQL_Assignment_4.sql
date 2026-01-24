DROP DATABASE IF EXISTS bookstore;

-- CREATE DATABASE
CREATE DATABASE jdbctest;

-- use this database
USE bookstore;

-- For Author Table
CREATE TABLE authors ( author_id INT AUTO_INCREMENT PRIMARY KEY,
author_name VARCHAR(50), country VARCHAR(30) );

-- For Book Table
CREATE TABLE books ( book_id INT AUTO_INCREMENT PRIMARY KEY, title
VARCHAR(100), author_id INT, price DECIMAL(10,2), stock INT, published_year INT,
FOREIGN KEY (author_id) REFERENCES authors(author_id) );

-- Insert value in authors table
INSERT INTO authors (author_name, country) VALUES ('Chetan Bhagat', 'India'), ('J.K.
Rowling', 'UK'), ('George R.R. Martin', 'USA'), ('R.K. Narayan', 'India'), ('Agatha
Christie', 'UK');

-- Insert values into book table
INSERT INTO books (title, author_id, price, stock, published_year) VALUES ('Five
Point Someone', 1, 250, 10, 2004), ('2 States', 1, 300, 5, 2009), ('Harry Potter', 2, 800, 15,
1997), ('Game of Thrones', 3, 1200, 8, 1996), ('Malgudi Days', 4, 200, 12, 1943), ('Murder
on the Orient Express', 5, 500, 6, 1934);

-- show tables
SELECT * FROM authors;
SELECT * FROM books;


-- Question 1: Write a function to return the total number of books in stock. 
DELIMITER $$
CREATE FUNCTION totalBookss()
RETURNS INT DETERMINISTIC
BEGIN
DECLARE total_books INT;
SELECT COUNT(*) INTO total_books FROM books;
RETURN total_books;
END $$
DELIMITER ;
SELECT totalBookss();


-- Question 2: Write a function to return the price of a given book title.
DELIMITER $$

CREATE FUNCTION returnBookPrice(book_title VARCHAR(100))
RETURNS DECIMAL(10,2) 
DETERMINISTIC
BEGIN
    DECLARE book_price DECIMAL(10,2); 

    SELECT price INTO book_price 
    FROM books 
    WHERE title = book_title 
    LIMIT 1;  

    RETURN book_price;
END $$

DELIMITER ;

SELECT returnBookPrice('Harry Potter') AS BookPrice;


-- Question 3: Write a function to find how many books an author has written.
DELIMITER $$
CREATE FUNCTION authorBooks(id INT)
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE total_books INT;
    SELECT COUNT(title) INTO total_books FROM books WHERE author_id = id;
    RETURN total_books;
END $$
DELIMITER ;
SELECT authorBooks(1);

-- Question 4: Write a function to return whether a book is "Old" or "New" based on its published year (before 2000 → Old, else → New).
DELIMITER $$
CREATE FUNCTION returnOldOrNewBook(published_year INT)
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
    DECLARE result VARCHAR(20);

    IF published_year < 2000 THEN
        SET result = 'OLD BOOK';
    ELSE
        SET result = 'NEW BOOK';
    END IF;

    RETURN result;
END $$

DELIMITER ;
SELECT returnOldOrNewBook(1998) AS BookStatus;
SELECT returnOldOrNewBook(2022) AS BookStatus;


-- Question 5: Write a function to calculate a 10% discount on the price of a given book.
DELIMITER $$

CREATE FUNCTION calculateDiscount(book_title VARCHAR(100))
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE original_price DECIMAL(10,2);
    DECLARE discounted_price DECIMAL(10,2);

    
    SELECT price INTO original_price
    FROM books
    WHERE title = book_title
    LIMIT 1;
    SET discounted_price = original_price - (original_price * 0.10);

    RETURN discounted_price;
END $$

DELIMITER ;
SELECT calculateDiscount('Harry Potter') AS DiscountedPrice;

-- Question 6: Write a function to return the author's country for a given book.

DELIMITER $$
CREATE FUNCTION getAuthorCountry(book_title VARCHAR(100))
RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN
    DECLARE author_country VARCHAR(100);
    SELECT country INTO author_country
    FROM authors
    WHERE author_id = (
        SELECT author_id 
        FROM books 
        WHERE title = book_title
        LIMIT 1
    )
    LIMIT 1;
    RETURN author_country;
END $$

DELIMITER ;
SELECT getAuthorCountry('Harry Potter') AS AuthorCountry;

DROP FUNCTION IF EXISTS getAuthorCountry;

-- Question 7: Write a function to find the total value of all books in stock (price × stock).
DELIMITER $$
CREATE FUNCTION totalValues()
RETURNS DECIMAL(15,2)
DETERMINISTIC
BEGIN
    DECLARE Total_Values DECIMAL(15,2);
    SELECT SUM(price * stock)
    INTO Total_Values
    FROM books;
    RETURN Total_Values;
END $$

DELIMITER ;
SELECT totalValues() AS Total_Value_of_All_Books;

DROP FUNCTION IF EXISTS totalValues;


-- Question 8: Write a function to return the oldest book title in the store.
DELIMITER $$
CREATE FUNCTION Old_books()
RETURNS VARCHAR(100) DETERMINISTIC
BEGIN
    DECLARE OldBook_Title VARCHAR(100);
    SELECT title 
    INTO OldBook_Title
    FROM books
    WHERE published_year = (SELECT MIN(published_year) FROM books)
    LIMIT 1;

    RETURN OldBook_Title;
END $$
DELIMITER ;
SELECT Old_books() AS RESULT;

DROP FUNCTION IF EXISTS Old_books;


-- Question 9: Write a function to check if a given book is in stock or not.
DELIMITER $$
CREATE FUNCTION IsBookInStock(book_title VARCHAR(100))
RETURNS VARCHAR(50)
DETERMINISTIC
BEGIN
    DECLARE stock_count INT;
    SELECT stock INTO stock_count
    FROM books
    WHERE title = book_title;

    IF stock_count > 0 THEN
        RETURN CONCAT('Book "', book_title, '" is in stock.');
    ELSE
        RETURN CONCAT('Book "', book_title, '" is NOT in stock.');
    END IF;
END $$
DELIMITER ;
SELECT IsBookInStock('Harry Potter') AS StockStatus;

	
DROP FUNCTION IF EXISTS IsBookInStock;


-- Question 10: Write a function to return the total number of books available by authors from a specific country.
DELIMITER $$
CREATE FUNCTION TotalBooksByCountry(author_country VARCHAR(100))
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE total_books INT;
    SELECT SUM(stock) INTO total_books
    FROM books
    WHERE author_id IN (
        SELECT author_id 
        FROM authors 
        WHERE country = author_country
    );

    IF total_books IS NULL THEN
        SET total_books = 0;
    END IF;
    RETURN total_books;
END $$
DELIMITER ;
SELECT TotalBooksByCountry('India') AS TotalBooks;

DROP FUNCTION IF EXISTS TotalBooksByCountry;
