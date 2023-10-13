use sakila
drop table RollNumber
CREATE TABLE RollNumber (
roll_no int
)
Delimiter //
create procedure sp_roll_num(roll_no int, num int)
begin
while roll_no<num do
insert into RollNumbers values(roll_no);
set roll_no=roll_no+1;
end while;
end
// delimiter ;

call sp_roll_num(50,500);
SELECT * FROM RollNumbers
