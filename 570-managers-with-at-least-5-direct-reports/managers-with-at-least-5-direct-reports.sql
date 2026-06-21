SELECT e1.name FROM Employee e1
join Employee e2 
on e1.id=e2.managerId
group by e1.name,e2.managerId
having count(e2.managerId)>=5
