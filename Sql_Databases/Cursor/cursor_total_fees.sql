-- Problem Statement 2: Calculate Total Rental Fees for a Customer
-- Create a cursor to calculate the total rental fees paid by a specific customer in the Sakila database.

select * from payment
select * from rental
select * from customer

create table newCustomer1
   (
       
       total_fees int

       ) ;
     
     drop procedure customer_amount  
	
    delimiter //
    create procedure customer_amount(in cust_id int)
    begin
    declare n varchar(500);
    declare myCursor CURSOR for
   select sum(amount)
 From payment 
 where customer_id=cust_id;
 open myCursor;
      fetch myCursor into n;
      insert into newCustomer1 values (n);
      close myCursor;
      end ;
      // delimiter ;

call customer_amount(2);
SELECT 
    *
FROM
    newCustomer1

