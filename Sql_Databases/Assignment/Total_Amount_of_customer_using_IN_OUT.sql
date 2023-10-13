use sakila
 select * from payment
 
  DELIMITER //
 CREATE PROCEDURE sp_getTotalAmountOfCustomer2(IN cust_id int,OUT tot_amt int)
 BEGIN
 select sum(amount) into tot_amt  
 From payment 
 where customer_id=cust_id;
 end
 // DELIMITER ;
 
 call sp_getTotalAmountOfCustomer2(3, @tot_amt);
 select @tot_amt
 
 