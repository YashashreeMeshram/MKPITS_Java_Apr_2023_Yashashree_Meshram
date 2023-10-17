-- Problem Statement 1: Retrieve Customer Names and Addresses
-- Create a cursor to retrieve the names and addresses of all customers from the Sakila database.

use sakila
 select * from customer
 select * from address

drop table newCustomer
create table newCustomer
   (
       
       customer_name varchar(500),
       customer_address varchar(500)
       ) ;
     
     drop procedure customer_info2  
	delimiter //
    create procedure customer_info2()
    begin
    DECLARE records varchar(500);
     declare n,c varchar(500);
    declare myCursor CURSOR for
      SELECT  first_name,  address
    FROM sakila.customer, sakila.address;
	 declare continue handler for NOT FOUND set records=1;
     open myCursor;
      label: loop
      fetch myCursor into n,c;
      insert into newCustomer values (n,c);
      if records=1 then
      leave label;
      end if;
      end loop;
      close myCursor;
      end ;
      // delimiter ;
      
      call  customer_info2();
      select * from newCustomer

