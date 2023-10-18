create database Online_Work
use Online_Work
drop table student
create table Student (
Name char(20),
Roll_no varchar(20),
Branch char(20),
Mobile_no varchar(10)
)

select * from Student
insert into student values('Niya','101','IT',7875013528);
insert into student values('Niyansh','102','IT',9545063187);
insert into student values('Mohit','103','IT',9158941635);

create table MarkDetails (
Roll_no varchar(20),
Physics int,
Chemistry int,
Science int
)

select * from MarkDetails;
insert into MarkDetails values('101',67,87,76);
insert into MarkDetails values('102',92,80,86);
insert into MarkDetails values('103',80,57,96);

Create table Total_Marks (
Roll_no varchar(20),
Total int
)

Delimiter //
create TRIGGER Total_marks_trigger AFTER INSERT ON MarkDetails
for each row
begin
insert into Total_Marks value(new.Roll_no,new.Physics+new.Chemistry+new.Science);
end;
// delimiter ;

select * from markDetails;
insert into MarkDetails values('104',70,80,90);



