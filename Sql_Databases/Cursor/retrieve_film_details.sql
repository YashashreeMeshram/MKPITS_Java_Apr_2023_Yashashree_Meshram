-- problem statement 4
-- Retrieve film Information by Category
-- Create a specific cursor to retrieve film details for a specific film category from the sakila database

use sakila
select * from film
select * from film_category

create table film_details
   (
       
      Film_Title varchar(200),
      film_special_features varchar(300),
      film_rental_duration varchar (200),
      film_rating varchar(200)
       ) ;
     
     drop procedure Films_info
	
    delimiter //
    create procedure Films_info(in picture_id int)
    begin
    declare n,p,m,y varchar(500);
    declare myCursor CURSOR for
  SELECT  title,special_features,rental_duration,rating
   From film
 where film_id=picture_id;
 open myCursor;
      fetch myCursor into n,p,m,y;
      insert into film_details values (n,p,m,y);
      close myCursor;
      end ;
      // delimiter ;

call Films_info(1);
SELECT 
    *
FROM film_details
    
