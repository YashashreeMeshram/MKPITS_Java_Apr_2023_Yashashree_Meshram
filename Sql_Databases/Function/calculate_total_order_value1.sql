-- Problem Statement 1: Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.
use sakila


delimiter //
 CREATE FUNCTION total_order_value(order_quantity int , unit_price int)
RETURNS int
DETERMINISTIC
BEGIN
  DECLARE total_order_value int ;
  SET total_order_value = order_quantity * unit_price;
  RETURN total_order_value;
END
// delimiter ;


select order_id,total_order_value(order_quantity, unit_price) AS total_order_value
from orders;