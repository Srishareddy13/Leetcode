select e.employee_id,e.name,count(e1.employee_id) as reports_count,round(avg(e1.age),0) as average_age
from Employees e
join employees e1
on e.employee_id=e1.reports_to
group by e.employee_id,e.name
order by e.employee_id
