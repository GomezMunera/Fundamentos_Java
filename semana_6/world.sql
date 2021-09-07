SELECT * FROM world.city
where CountryCode='arg';

-- 

SELECT COUNT(*) AS contador_ciudades 
FROM world.city;

-- 
USE world;

-- vista

CREATE VIEW miVista AS
SELECT Name, District 
FROM city 
WHERE Name LIKE 'L%';

SELECT * FROM mivista;
