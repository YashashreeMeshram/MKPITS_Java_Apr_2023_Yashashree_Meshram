create database Bank
use Bank;
create table Customer
   (
       cust_id char(6) primary key,
       cust_name char(6),
       city char(15),
       mobileno varchar(10),
       occupation varchar(10)
     )
     
	select * from Customer
insert into Customer value('101','Shreyu','Amravati','7875013528','Student')
insert into Customer value('102','Riya','Amravati','9665960827','Student')


create table Loan
(
cust_id char(6),
branch_id varchar(12),
loan_amount varchar(20),
constraint fk_rn foreign key(cust_id) references Customer(cust_id)
)
use bank;
select * from Customer
insert into Customer values('103','Mishti','Amravati','8390540152','Student')
insert into Customer values('104','Niya','Amravati','9545063187','Student')
insert into Customer values('105','Isha','Amravati','9545063187','Student')

select * from Loan
insert into Loan values('101','abc','20000')
insert  into Loan values('103','mpy','40000')
insert into Loan values('105','ngr','10000')
where clause
 select * from Customer where  cust_name='Riya'
 
 select * from Loan where loan_amount<='20000'
 where clause
 update Customer set city='Yawatmal' where cust_id='104'
 
 delete from Loan where cust_id='105'
 