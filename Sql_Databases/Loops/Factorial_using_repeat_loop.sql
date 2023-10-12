use bank
delimiter //
create procedure factorial (n int)
begin
declare i int;
declare f int;
set i=1;
set f=1;
 repeat
set f=f*i;
set i=i+1;
until i>n 
end repeat;
select f;
end
//
delimiter ;
call factorial(10)
