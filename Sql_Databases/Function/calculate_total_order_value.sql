-- Problem Statement 1: Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.

use sakila
select * from inventory

delimiter //
create function total_order_value(order_quantity decimal(10,2), unit_price decimal(10,2))
returns decimal(10,2)
deterministic
begin
declare total_order_value decimal(10,2);
set total_order_value = order_quantity * unit_price;
return total_order_value;
end
// delimiter ;


select order_id,total_order_value(order_quantity, unit_price) AS total_order_value
from orders;