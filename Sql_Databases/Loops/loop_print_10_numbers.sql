use bank
DELIMITER  //
CREATE procedure abc()
begin
declare i int;
set i=0;
xyz : loop
set i=i+1;
select i;
if i>=10 then
leave xyz;
end if;
end loop;
end
// delimiter ;

call abc();