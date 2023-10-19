-- Calculate Average Film Rental Duration
-- Create a cursor to sum of rental duration for all films in the Sakila database.
 use sakila
 select * from film
 
 
 create table duration
   (
       
     movie_rental_duration varchar(100)
       ) ;
 
 delimiter //
 create procedure film_rental_duration()
    begin
    declare n varchar(500);
    declare myCursor CURSOR for
   SELECT SUM(rental_duration) 
   FROM film
 where film_id=film_id;
 open myCursor;
      fetch myCursor into n;
      insert into duration values (n);
      close myCursor;
      end ;
      // delimiter ;
      
     call film_rental_duration() 
     
     select * from duration