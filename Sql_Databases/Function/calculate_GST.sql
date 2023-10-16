use sakila
select * from customer
select * from payment

delimiter //
create function calGST(p_amount decimal(5,2))
returns decimal(5,2) deterministic
begin
declare gst int;
set gst=p_amount*0.18;
return gst;
end //
delimiter ;

select calGST(45.45)

select payment_id, amount,calGST(amount) as GST , amount + calGST(amount) as total from payment; 
