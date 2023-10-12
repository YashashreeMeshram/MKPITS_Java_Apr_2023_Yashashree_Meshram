use bank

delimiter //
create Procedure GreaterNumber1()
begin
declare g int;
if a>b then
 if a>c then
 set g=a;
 else
 set g=c;
 end if; 
 else
 if b>c then
 set g=b;
 else
 set g=c;
 end if;
 end if;
 select "Gtreatest_num=",g;
 END
 
 // delimiter ;
 
 call GreaterNumber1();
 
 

