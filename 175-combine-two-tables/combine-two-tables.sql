# Write your MySQL query statement below
select person.firstName, person.lastName, Address.city, address.state
from person
left join address on person.personId =address.personid
