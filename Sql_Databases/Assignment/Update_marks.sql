create database college
use college

create table student 
(
Roll_no varchar (8) PRIMARY KEY,
name varchar (20),

Phone_no varchar (10)
)

create table marks 
(
Roll_no int,
sub1 int,
sub2  int,
sub3 int
);

insert into student
   values
  (
  101,'Nishtha',1234567890
  );

insert into student
   values
  (
  102,'Niyati',123456777
  );

insert into student
   values
  (
  103,'Malika',9873456777
  );

insert into student
   values
  (
  104,'Samruddhi',9873456777
  );

insert into student
   values
  (
  105,'Tanvee',9873456777
  );



insert into marks
   values
  (
  101,78,89,90
  );

insert into marks
   values
  (
  102,45,82,93
  );

insert into marks
   values
  (
  103,66,72,63
  );

insert into marks
   values
  (
  104,48,72,73
  );

insert into marks
   values
  (
  105,48,99,73
  );


delimiter //
create procedure stud_mark(roll_no int , incr int)
begin
update marks
set sub1 = sub1+incr, sub2= sub2+incr , sub3= sub3+incr
where Roll_no=roll_no;
end;
// delimiter ;

call  stud_mark('104',10);
select * from marks