# Write your MySQL query statement below
select k.unique_id, s.name from Employees s left join EmployeeUNI k on s.id=k.id;