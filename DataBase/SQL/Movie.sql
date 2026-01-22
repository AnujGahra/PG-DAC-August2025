use Mumbai;

DESC actors;

DESC movies;

SELECT * FROM actors;

SELECT * FROM movies;

SELECT * FROM movies ORDER BY rating DESC LIMIT 5, 4;


-- Example 1: Simple Subquery (Find actor(s) with highest-rated movie)

SELECT name
FROM actors
WHERE actor_id IN (
    SELECT actor_id
    FROM movies
    WHERE rating = (SELECT MAX(rating) FROM movies)
);

SELECT name
FROM actors
WHERE actor_id IN (
    SELECT actor_id
    FROM movies
    GROUP BY actor_id
    HAVING AVG(rating) > 8.0
);

-- BETWEEN OPERATOR
 SELECT * FROM movies WHERE release_year BETWEEN 2002 AND 2025;

-- USING OF IN 
SELECT * FROM movies WHERE genre IN ('Action', 'Sci-Fi');


-- Replace -> INSERT OR UPDATE IN ONE SHOT
REPLACE INTO students (id, name, age, rollno)
VALUES(1, 'Anuj Gahra', 22, 07);

