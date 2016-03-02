Use hr;

-- 1
select avg(salary)from employees e
join departments d
on e.department_id = (select d.department_id from departments d where d.department_name = "Sales");

-- 2
select count(e.employee_id) from employees e
join departments d
on e.department_id = (select d.department_id from departments d where d.department_name = "Sales");

-- 3
select count(distinct location_id )from locations;

-- 4
select count(distinct d.department_name) from departments d
where manager_id is not null;

-- 5
select count(distinct d.department_id) from departments d
where manager_id is null;

-- 6
select d.department_name, avg(e.salary) from departments d
join employees e
on d.department_id = e.department_id
group by d.department_name;

-- 7
select d.department_name, l.city,  count(distinct e.employee_id) as employees from employees e
join departments d
on e.department_id = d.department_id
join locations l
on d.location_id = l.location_id
group by d.department_name;

-- 8
select d.department_name, concat(e.first_name, ' ', e.last_name) as 'Manager Name',  count(distinct em.employee_id) from employees e
join departments d
on d.manager_id = e.employee_id
join employees em
on em.department_id = d.department_id
group by d.department_name;

-- 9
select concat(e.first_name, ' ', e.last_name) as 'Manager Name', d.department_name, l.city  from employees e
inner join employees em
on em.manager_id = e.employee_id
join departments d
on e.department_id = d.department_id
join locations l
on d.location_id = l.location_id
where d.department_name = (
select d.department_name from departments d
join employees e
on e.department_id = d.department_id
group by d.department_name
having count(e.department_id) = 5)
group by em.manager_id;


-- 10
select r.region_name, count(e.employee_id) as Employees from employees e
join departments d
on d.department_id = e.department_id
join locations l
on l.location_id =d.location_id
join countries c
on c.country_id = l.country_id
join regions r
on r.region_id = c.region_id
group by r.region_id;


-- 11
select d.department_name, j.job_title , count(e.employee_id) from employees e
join departments d
on d.department_id = e.department_id
join jobs j
on j.job_id = e.job_id
group by j.job_title;

-- 12
select concat(e.first_name, ' ', e.last_name) as Name, e.salary from employees e
where salary =
(select min(em.salary) from employees em);

-- 13
select concat(e.first_name, ' ', e.last_name) as Name, e.salary from employees e
where e.salary <= (
select min(em.salary) * 1.10 from employees em);

-- 14
select  distinct(concat(e.first_name,' ', e.last_name)) as Employee, d.department_name,max(e.salary) from departments d
join employees e
on e.department_id = d.department_id
group by d.department_name
order by salary desc;

-- 15
select concat(e.first_name, ' ', e.last_name) as Name from employees e
where length(e.last_name) = 5;

-- 16
select concat(e.first_name, ' ', e.last_name) as Name from employees e
-- where e.first_name LIKE 
where
substring(e.first_name, 1,1) = substring(last_name,1,1);

-- 17
-- select * from departments;
select d.department_name, coalesce(concat(e.first_name, ' ', e.last_name), 'No Manager') as Manager  from departments d
left join employees e
on d.manager_id = e.employee_id;

-- 18
SELECT concat(e.first_name, ' ', e.last_name) as Employee, count(e.employee_id),
				if(count(e.employee_id) = 0, 'Just an Employee', 
						if(count(e.employee_id) = 1, 'Junior Manager', 'Segnior Manager')) from employees e 
left join employees em
on em.manager_id = em.employee_id
group by e.manager_id
order by employee;

-- 19
-- select now() as Time;
-- DATE_ADD()	MySQL DATE_ADD() adds time values (as intervals) to a date value. The ADDDATE() is the synonym of DATE_ADD().
select date_format(now(), '%h:%i:%s %d-%m-%y') as Time, date_add(current_date(),interval 1 week) as 'Next Week';

-- 20

CREATE TABLE `hr`.`users` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(20) NOT NULL,
  `pass_word` VARCHAR(20) NOT NULL,
  `fullname` VARCHAR(45) NOT NULL,
  `lastlogintime` datetime NOT NULL,
  PRIMARY KEY (`user_id`));
  
  DELIMITER $$
CREATE TRIGGER fill_full_name 
    BEFORE INSERT ON users
    FOR EACH ROW 
BEGIN
    INSERT INTO users (fullname) values (new.fullname);
END$$
DELIMITER ;



insert into hr.users (user_id, pass_word, fullname, lastlogintime)
values (1,  '6969','Bari Labradora', now());

-- insert into hr.users (user_id, username, pass_word, fullname, lastlogintime)
-- values (1, 'sdsv', '6969','Bari Labradora', now());
-- select *  from hr.users


-- 21
create view todaylogins
as
select * from users
where date_sub(curdate(), interval 1 day)<=lastlogintime;

-- select * from todaylogins

-- 22
CREATE TABLE `hr`.`groups` (
  `group_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `groupName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`group_id`),
  UNIQUE INDEX `groupName_UNIQUE` (`groupName` ASC));