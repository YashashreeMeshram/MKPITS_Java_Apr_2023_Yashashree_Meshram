create database Market_Management
use Market_Management;
create table Product
   (
       product_id varchar(20) primary key,
       sale_id varchar(6),
       Quantity varchar(15)
      
     )
     select * from Product;
insert into Product value('101','2001','60');
insert into Product value('102','2002','55');
insert into Product value('103','2003','80');
insert into Product value('104','2004','40');
insert into Product value('105','2005','68');
insert into Product value('106','2006','52');

drop table sale;

create table Sale
(
product_name char(20),
price varchar(12),
product_id varchar(20),
Quantity varchar (15)

)
insert into Sale values('Fridge','10500','101','6')

delimiter //
create TRIGGER after_sale_trigger AFTER INSERT ON Sale
for each row
begin
-- Update the product stock after a sale
UPDATE Product
SET Quantity = Quantity - NEW.Quantity
WHERE  product_id=NEW.product_id;
end;
//
delimiter ;

select * from Product

