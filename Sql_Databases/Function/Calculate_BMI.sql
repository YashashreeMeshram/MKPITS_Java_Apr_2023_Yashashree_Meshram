-- Problem Statement 4: Calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a person's weight (in kilograms) and height (in meters) as input and calculates their BMI.
drop function cal_BMI
delimiter //
create function cal_BMI(height decimal, weight decimal)
returns decimal 
deterministic
begin
declare BMI int;
set BMI= weight/ sqrt(height);  
return BMI;
end
// delimiter ;

select cal_BMI(45,100)
