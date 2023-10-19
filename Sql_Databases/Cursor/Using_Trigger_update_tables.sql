create database Mysql_database
use MySql_database

drop table product
create table Product(
Product_id varchar(50),
Product_name varchar(50),
Product_price long,
Product_Quantity int
);
insert into Product(product_id,product_name,Product_price,Product_quantity)
values ('101', 'Pulser',120000,40),
       ('102','activa',100000,35),
       ('103','shine',106000,60);
       
       select *from product
       drop table sales
  create  table sales(
  sale_id varchar(50),
  product varchar(50),
  Quantity int
  );    
delimiter //
    create trigger sale_product after insert on sales for each row
    begin
    update product  set Product_Quantity=Product_Quantity - new.Quantity
    where product_id=new.product;
    end
    //  delimiter ;
   
    select * from product
   
    insert into sales(sale_id,product,Quantity)
    value( '1771','101',2);
   
    drop table purchase
    create table purchase(
Product_id varchar(50),
Product_name varchar(50),
Product_price long,
Product_Quantity1 int
    )
     drop trigger purchase_product
    delimiter //
    create trigger purchase_product after insert on purchase for each row
    begin
    update product set  Product_Quantity=Product_Quantity + new.Product_Quantity1
    where  Product_id=new.Product_id;
    end
    // delimiter ;
   
    insert into purchase (product_id,product_name,product_price,Product_Quantity1)
    value('101','Pulser',120000,20)
   
    select *from product
    select * from purchase

