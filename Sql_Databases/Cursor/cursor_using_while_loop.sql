use bank
drop table newCustomer
create table newCustomer1
   (
       
       customer_name char(15),
       customer_city char(15)
       ) ;
       drop procedure customer_info1
	delimiter //
    create procedure customer_info1()
    begin
    DECLARE records int;
    declare n,c varchar(20);
    declare myCursor CURSOR for
      select cust_name, city from customer;
      declare continue handler for NOT FOUND set records=1;
      open myCursor;
	  fetch myCursor into n,c;
     WHILE (records=1)DO
      insert into newCustomer values (n,c);
	  fetch myCursor into n,c;
	 end while;
      close myCursor;
      end ;
      // delimiter ;
      
      call customer_info1();
      select * from newCustomer1
      
      select * from customer

