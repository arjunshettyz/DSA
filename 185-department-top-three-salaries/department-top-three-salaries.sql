# Write your MySQL query statement below
select d.name as department, e.name as employee, e.salary 
from employee as e 
inner join department as d 
on d.id = e.departmentId
where (
    select 
    count(distinct(salary))
    from employee 
    where salary > e.salary
    and departmentId = e.DepartmentId
)<3;