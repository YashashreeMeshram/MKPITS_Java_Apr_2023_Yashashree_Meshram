use bank


declare
delimiter //
create procedure basicloopfactorial1(n int)
begin
declare i int ;
declare f int ;
set i=1;
set f=1;
factorialnumber : loop
if i=10 then
set f=f*i;
set i=i+1;
 select f;
 leave factorialnumber;
 end if ;
 end loop ;
 end;
 //
 delimiter ;
 

 call basicloopfactorial1(4)

