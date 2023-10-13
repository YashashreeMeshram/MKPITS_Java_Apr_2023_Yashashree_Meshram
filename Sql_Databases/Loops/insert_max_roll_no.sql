use sakila
drop table roll_numbers
CREATE TABLE roll_numbers (
rollno int
)
delimiter //
create procedure sp_insertRN1(IN n int)
begin
declare i int;
declare rn int;
set i=0;
select max(rollno) intorn  from roll_numbers;
if rn is null then
set rn=0;
end if;
while i<=n do
set rn=rn+1;
insert into roll_numbers values (rn);
set i=i+1;
end while;
end
// delimiter ;

call sp_insertRN1(5);
select * from roll_numbers