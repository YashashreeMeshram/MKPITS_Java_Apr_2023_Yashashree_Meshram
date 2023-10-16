-- Problem Statement 2: Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and calculates their current age in years.

delimiter //
create function calculate_age(ur_birth_year int , current_year_date int)
returns int
deterministic
begin
declare calculate_age  int;
set  calculate_age= current_year_date - ur_birth_year;
return calculate_age;
end
// delimiter ;

select calculate_age(1999,2023) as calculate_age ;

