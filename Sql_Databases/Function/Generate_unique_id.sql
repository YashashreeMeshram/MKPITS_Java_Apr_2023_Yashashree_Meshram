-- Problem Statement 5: Generate a Unique Customer ID
-- Design a user-defined function that generates a unique customer ID based on a predefined pattern and the customer's personal details.

drop  function Generates_unique_ID
delimiter //
create function Generates_unique_ID(first_name varchar(20), last_name varchar(20), mobile varchar(10) , udia varchar(20))
returns varchar(35)
deterministic
begin
declare Generates_unique_customer_ID varchar(35) ;
 set Generates_unique_customer_ID = concat(left(first_name,3),right(last_name,2),right(mobile,4),left(udia,9));
 return Generates_unique_customer_ID;
 end
 // delimiter ;
 drop function Generates_unique_ID
 
 select Generates_unique_ID("yashashree","meshramr","7875013528","400508232524") as Generates_unique_customer_ID;

