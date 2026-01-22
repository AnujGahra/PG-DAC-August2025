


-- Finding the movie with highest rating. = Scalar Subquery
SELECT * FROM movies; 

SELECT MAX(score) FROM movies;

SELECT * FROM movies WHERE score > 5;

-- Subqueries
SELECT * FROM movies WHERE score = ( SELECT MAX(score) FROM movies ); 

-- Find the movie with highest profit(vs order by)
SELECT * FROM movies
WHERE (gross - budget) = (SELECT MAX(gross - budget) FROM movies);

-- OR
SELECT * FROM movies
ORDER BY (gross - budget) DESC limit 1; 


-- Find how many movies have a rating > the avg of all the movie ratings(Find the count of above average movies) 
SELECT * FROM movies WHERE score > (SELECT AVG(score) FROM movies);

SELECT COUNT(*) FROM movies;
 
 
-- Find the highest rated movie of 2000
SELECT * FROM movies 
WHERE year = 2000 AND score = (SELECT MAX(score) FROM movies WHERE year = 2000); 

-- Find the highest rated movie among all movies whose number of votes are > the dataset avg votes 

SELECT * FROM movies
WHERE score = (SELECT MAX(score) FROM movies WHERE votes > (SELECT AVG(votes) FROM movies));


-- Independent Subquery - Row Subquery- one col and multi rows;

 SELECT * FROM orders;
 
 -- Find all users who never ordered
SELECT * FROM users
WHERE user_id NOT IN ( SELECT DISTINCT(user_id) FROM orders);


-- Find all the movies made by top 3 directors(in terms of total gross income)

SELECT * FROM movies WHERE director IN (SELECT director 
FROM movies 
GROUP BY director
ORDER BY SUM(gross) DESC
LIMIT 3); 


-- Find all movies of all those actors whose filmography's avg rating > 8.5(take 25000 votes as cutoff) 

SELECT * FROM movies
WHERE star IN (SELECT star FROM movies
WHERE votes > 25000
GROUP BY star
HAVING AVG(score) > 8.5);
