-- 1 
select * from hr.departments;

-- 2
select department_name as Name from hr.departments;

-- 3 
select concat(first_name,' ', last_name) as Name,convert(salary /12, decimal(10,2)) as 'Month Salary' 
from hr.employees;

select concat(first_name,' ', last_name) as Name, convert(salary /12/20, decimal (10, 2)) as 'Day Salary' 
from hr.employees;

select concat(first_name,' ',last_name) as Name, convert(salary /12/20/8, decimal(10, 2)) as 'Hour Salary'
from hr.employees;

-- 4
select concat(first_name,' ',last_name) as Name, concat(email, '@mail.ittalents.bg') as 'FULL EMAIL ADDRESS' from hr.employees;

-- 5
select distinct(salary), concat(first_name,' ',last_name) as Name from hr.employees
group by salary
order by salary desc;

-- 6
select department_name from hr.departments 
union 
select region_name from hr.regions 
union
select country_name from hr.countries
union
select city from hr.locations;

-- 7
select * from hr.employees e
where job_id = 'AC_MGR';

-- 8
select concat(first_name,' ', last_name) as 'Full name' from hr.employees e
where first_name like 'Sa%';

-- 9
select concat(first_name,' ', last_name) as 'Full Name ' from hr.employees
where last_name like '%ei%';

-- 10
select first_name, last_name, salary from employees
where salary between 3000 and 5000
order by salary desc;

-- 11
-- Ne namoram kak da stane s MINUS, navsqkude pishe che ne se poddurza.
select first_name, last_name, salary from employees
where  salary between 2000 and 15000
and salary not between 5000 and 10000
order by salary desc;

-- 12 
select first_name, last_name, salary from employees
where salary in (2500,4000,5000);

-- 13
select * from locations
where city is null or postal_code is null;

-- 14
select concat(first_name,' ', last_name) as Name, salary from employees
where salary > 10000
order by salary desc;

-- 15
select concat(first_name,' ', last_name) as Name, hire_date from employees
order by hire_date asc limit 10;

-- 16
select d.department_name, l.city from departments d natural join locations l
where (d.location_id = l.location_id );

-- 17
select d.department_name, l.city from departments d
join locations l
using (location_id);

-- 18
select d.department_name, l.city, e.fir from departments d
inner join locations l
on (d.location_id = l.location_id);


-- 19
select d.department_name, l.city,  concat(e.first_name,' ', e.last_name) as Name from departments d
inner join locations l
on (d.location_id = l.location_id)
inner join employees e
on(d.department_id = e.department_id) 
and
d.manager_id = e.employee_id;


-- 20
select l.city, d.department_name from departments d
right outer join locations l
on (l.location_id = d.location_id);

-- 21
select l.city, d.department_name from locations l
left outer join departments d
on (l.location_id = d.location_id);

-- 22;
-- tuk ne se seshtam kak da izkaram i null gradovete bez outer join kakto se iska po uslovie
select l.city, d.department_name from locations l, departments d
where l.location_id = d.location_id;

-- 23;
select d.department_name, concat(e.first_name, ' ', e.last_name) as Name from departments d, employees e
where d.manager_id = e.employee_id
order by department_name;

-- 24

select d.department_name, concat(e.first_name, ' ', e.last_name) as Name, l.city from departments d
join employees e on d.manager_id = e.employee_id
join locations l on  l.location_id = d.location_id
order by department_name;

-- 25
select concat(e.first_name, ' ', e.last_name) as Name, e.hire_date from hr.employees e
where(
select e.hire_date between '1995-01-01' and '2000-01-01'
where 
e.department_id = 80 or e.department_id = 100)
order by e.hire_date;

-- 26
select concat(e.first_name, ' ', e.last_name) as Name from employees e
join job_history jh
on (e.employee_id = jh.employee_id)
join departments d
on (jh.department_id = d.department_id)
and (d.department_name = 'Sales');

-- 27
select concat(e.first_name, ' ', e.last_name) as 'Employee Name', concat(m.first_name, ' ', m.last_name) as 'Manager Name' from employees e
inner join employees m 
on (m.employee_id = e.manager_id);

-- 28
select e.first_name, l.last_name from hr.employees e
cross join employees l
on (l.employee_id = e.employee_id);

-- 29
select concat(e.first_name, ' ', e.last_name) as Name, j.job_title as Job, d.department_name as Department,
						l.city, c.country_name as Country, r.region_name as Name from employees e
join jobs j
on(e.job_id = j.job_id)
join departments d
on (e.department_id = d. department_id)
join locations l
on (d.location_id = l.location_id)
join countries c
on (l.country_id = c.country_id)
join regions r
on (c.region_id = r.region_id);

-- 30;
select concat(e.first_name, ' ', e.last_name) as Name,
						j.job_title as Job,
							d.department_name as Department,
								l.city, c.country_name as Country, r.region_name as Name,
									coalesce (concat(m.first_name, ' ', m.last_name), 'No Manager') as Manager from employees e
left join jobs j
on(e.job_id = j.job_id)
left join departments d
on (e.department_id = d. department_id)
left join locations l
on (d.location_id = l.location_id)
left join countries c
on (l.country_id = c.country_id)
left join regions r
on (c.region_id = r.region_id)
left join employees m
on (select e.manager_id = m.employee_id);


-- 31


select * from employees;
select * from jobs;
select * from departments;
select * from locations;
select * from job_history;
select * from countries;
select * from regions;


select * from job_history mgr
where (mgr.job_id = 'AC_MGR') and
(exists (select acc.employee_id
from hr.job_history acc
where acc.job_id = 'AC_ACCOUNT' and
mgr.employee_id = acc.employee_id and
acc.end_date < mgr.start_date));



