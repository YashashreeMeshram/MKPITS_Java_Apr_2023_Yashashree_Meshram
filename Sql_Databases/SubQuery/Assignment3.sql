-- Assignment 3: Find rental details for the most recent rental:
-- Retrieve the rental details for the most recent rental transaction in the database.

select* from customer
select* from film
select* from rental
 
 select rental_id,rental_date,return_date from rental 
 order by rental_date desc