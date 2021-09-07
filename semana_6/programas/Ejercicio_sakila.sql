use sakila;

# comentario

-- comentario

/*
comentario múltiple
*/

#1
SELECT * 
FROM customer
WHERE active=1 AND address_id > 300;

#2
SELECT * FROM actor
WHERE (first_name) = 'julia';
#3
SELECT * 
FROM actor 
WHERE upper(last_name) = 'KILMER';

#4
SELECT * 
FROM staff
WHERE password IS NULL;

#5
SELECT DISTINCT name FROM language;

#6
SELECT * FROM category
LIMIT 5;

#7
SELECT * 
FROM film 
WHERE rating <> 'NC-17';

#8
SELECT COUNT(*) as num_actor 
FROM actor;

#9
SELECT * 
FROM city 
WHERE country_id = (SELECT country_id FROM country WHERE upper(country) = 'colombia');

#10
SELECT COUNT(*) as num_ciudades 
FROM city 
WHERE country_id=(SELECT country_id from country where upper(country) = 'colombia');

#11
SELECT count(*) as pagos, 
sum(amount) as suma,
avg(amount) as promedio,
min(amount) as minimo,
max(amount) as maximo
FROM payment;

#12
SELECT COUNT(title) as num_peliculas
FROM film_text;

#13
SELECT title
FROM film_text
WHERE title BETWEEN 'P' AND 'S';

#14
SELECT MAX(length) as mayor_duracion 
FROM film;

#15
SELECT film_id, title
FROM film
WHERE length=(SELECT MAX(length) as max_dur FROM film)
LIMIT 5;

#16
SELECT COUNT(*)
FROM film 
WHERE upper(title) LIKE '%k%';

#17
SELECT film_id,title
FROM film 
WHERE upper(title) LIKE '%k%';

#18
SELECT * 
FROM city 
WHERE upper(city) LIKE '__e%' AND country_id=(SELECT country_id from country where upper(country) = 'argentina');

#19
SELECT * 
FROM country;

#20
SELECT * 
FROM city 
WHERE country_id = 15 ;

#21
SELECT * 
FROM city 
WHERE city LIKE '% %';

#22
SELECT * 
FROM film 
WHERE length between 40 and 60;

#23
SELECT first_name, length(first_name) as longitud 
FROM actor 
WHERE length(first_name) >= 8;

#24
SELECT MIN(length) as mayor_duracion 
FROM film;

#26
SELECT film_id, title
FROM film
WHERE length=(SELECT MIN(length) as min_dur FROM film)
LIMIT 5;

#27
SELECT rating, count(*)
FROM film
GROUP BY rating;

#28
SELECT co.country, c.city
FROM city AS c, country AS co
WHERE c.country_id = co.country_id;

#29
SELECT f.title, c.name as category
FROM film f, category c, film_category ca
WHERE f.film_id = ca.film_id 
AND c.category_id = ca.category_id
ORDER BY f.title DESC;

#30
SELECT COUNT(*) FROM payment;

#31
SELECT * FROM payment
WHERE payment_date BETWEEN "20050601"AND "20050701"
LIMIT 3000;

#32
SELECT * FROM payment ORDER BY payment_id DESC limit 10;

#33
SELECT * FROM country
WHERE country IN ('COLOMBIA','ARGENTINA','Ecuador','Venezuela');

#34
SELECT co.country, c.city, a.address, a.address2, s.first_name, s.last_name
FROM country co, city c, address a, staff s
WHERE co.country_id = c.country_id 
AND a.city_id = c.city_id 
AND s.address_id = a.address_id;

#35
SELECT f.title, a.first_name, a.last_name
FROM film f, actor a, film_actor fa
WHERE f.film_id = fa.film_id 
AND a.actor_id = fa.actor_id
ORDER BY f.title;

#36
SELECT a.first_name as Nombre, f.title as Titulo
FROM actor as a
LEFT JOIN film_actor as fa
ON a.actor_id = fa.actor_id
LEFT JOIN film as f
ON fa.film_id = f.film_id;
-- WHERE f.title IS NULL;

#37
SELECT  c.customer_id, c.first_name, c.last_name, c.email, sum(p.amount) as suma
FROM customer c
LEFT JOIN payment p
ON c.customer_id = p.customer_id
WHERE payment_date >= "20050101"
GROUP BY customer_id
HAVING customer_id > 1
ORDER BY suma DESC;