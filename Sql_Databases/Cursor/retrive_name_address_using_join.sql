use sakila
drop table customers_info
create table customers_info(
name varchar(500),
city varchar(500)
);


drop procedure Retrieve_Customer_Names_Addresses;
delimiter //
create procedure Retrieve_Customer_Names_Addresses()
begin
declare done varchar(500);
declare cust_name,cust_city varchar(500);
declare cursor1 cursor for
select customer.first_name,address.address from customer join address on
customer.address_id=address.address_id;
declare continue handler for not found set done =1;
open cursor1;
label:loop
fetch cursor1 into cust_name ,cust_city ;
insert into customers_info value (cust_name ,cust_city);
if done=1 then
leave label;
end if;
end loop;
close cursor1;
end
// delimiter ;


call Retrieve_Customer_Names_Addresses;
select *from customers_info

