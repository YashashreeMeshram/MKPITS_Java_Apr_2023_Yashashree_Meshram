use sakila

CREATE TABLE RollNumbers (
roll_no int
)
Delimiter //
create procedure abcd()
begin
declare roll_no int;
set roll_no=1;
while roll_no<100 do
insert into RollNumbers values(roll_no);
set roll_no=roll_no+1;
end while;
end
// delimiter ;

call abcd();
SELECT * FROM RollNumbers
