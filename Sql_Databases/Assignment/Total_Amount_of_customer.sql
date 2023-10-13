use sakila
 select * from payment
 
  DELIMITER //
 CREATE PROCEDURE sp_getTotalAmountOfCustomer1(IN cust_id int)
 BEGIN
 select sum(amount) as "Total Amount" 
 From payment 
 where customer_id=cust_id;
 end
 // DELIMITER ;
 
 call sp_getTotalAmountOfCustomer1(3)
 
 