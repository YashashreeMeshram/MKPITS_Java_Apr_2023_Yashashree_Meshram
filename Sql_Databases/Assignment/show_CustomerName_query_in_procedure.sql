use sakila 
select *  from city
select * from address
select * from customer
delimiter //
create procedure sp_getCustFromCity1(IN v_city char (20))
BEGIN
select first_name, last_name,city from customer left outer join address
on customer.address_id=address.address_id  join city
on address.city_id=city.city_id
where city=v_city;
end
// delimiter ;

call sp_getCustFromCity1("Abu Dhabi")

