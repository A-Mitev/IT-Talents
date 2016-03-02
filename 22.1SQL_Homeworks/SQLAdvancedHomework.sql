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
  `lastlogintime` datetime NULL,
  PRIMARY KEY (`user_id`));
  
  DELIMITER $$
CREATE TRIGGER fill_full_name 
    BEFORE INSERT ON users
    FOR EACH ROW 
BEGIN
    INSERT INTO users (fullname) values (new.fullname);
END$$
DELIMITER ;



insert into hr.users (user_id, username, pass_word, fullname, lastlogintime, group_id)
values (1, 'Bari', '6969','Bari Labradora', now(), 1);

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
  `group_id` INT(15) NOT NULL AUTO_INCREMENT,
  `groupName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`group_id`),
  UNIQUE INDEX `groupName_UNIQUE` (`groupName` ASC));
  
-- 23
alter table hr.users add(group_id int(15));	

insert into hr.users (username, pass_word, fullname, lastlogintime, group_id) values ('Nexus', 'alabala', 'Google', now(),2);
update hr.users set group_id = 2 where user_id = 1;

alter table hr.users
add constraint fk_groups
foreign key (group_id)
references groups(group_id);

-- 24
insert into hr.groups(group_id, groupName) values (1,'Dogs');
insert into hr.groups(group_id, groupName) values (2,'Mobifones');
insert into hr.groups(group_id, groupName) values (3,'LandLines');

insert into hr.users (user_id, username, pass_word, fullname, lastlogintime, group_id)
values (null, 'Nexus6P', '6969','Alphabet', now(), 3);

insert into hr.users (user_id, username, pass_word, fullname, lastlogintime, group_id)
values (null, '6S', '1212','Alphabet', now(), 2);

-- 25
insert into users(user_id, username, pass_word,fullname)
select null, email, ' ', concat(first_name, ' ', last_name)
from hr.employees;

-- 26
-- ok - 10 times

-- 27
update users 
set pass_word = null
where lastlogintime<='2006-03-10' and user_id > 500; -- tuk malko promenih che ne mi davashe zaradi safe update opciqta

-- 28

delete from hr.users
where pass_word = null;

-- 29
select username from users
where username like 's%';

-- 30
create table workhours(
employee_id int(11) unsigned key auto_increment,
`date` datetime not null,
task varchar(50) not null,
hours int(10) not null,
comment text(200)
);

-- 31
ALTER TABLE workhours
ADD CONSTRAINT fk_employee
FOREIGN KEY (employee_id)
REFERENCES hr.employees(employee_id);

-- 32

select * from workhours;

insert into workhours values(10,now(), 'Nauchi OOP', 24, 'Ako li ne otivash dunerdjiq');
insert into workhours values(105,now(), 'Vzemi nauchi nishkite', 16, 'Bez izvineniq');
insert into workhours values(109,now(), 'Ne zakusnqvaj poveche za lekcii', 8, 'Nauchi kolekcii');
insert into workhours values(110,now(), 'Napishi domashnoto', 3, 'I sledvashtoto sushto');
insert into workhours values(101,now(), 'Oburni vnimanie na zenata', 12, 'Izberi si koq ot vsichki e naj-prioritetna :) ');

-- 33
select avg(w.hours) as 'Avg. Working Hours', c.country_name
from hr.countries c
join hr.locations l
on l.country_id=c.country_id
join hr.departments d
on d.location_id=l.location_id
join hr.employees e
on d.department_id=e.department_id
join workhours w
on w.employee_id=e.employee_id
group by country_name;

-- 34
select d.department_name
from hr.departments d
join hr.employees e
on e.department_id=d.department_id
join workhours w
on w.employee_id=e.employee_id
-- Definition and Usage The DATE_SUB() function subtracts a specified time interval from a date.
where date_sub(curdate(), interval 1 week)<=w.date and w.hours > 8;

-- 35

-- UPDATE `hr`.`workhours` SET `hours`='75' WHERE `employee_id`='101';

select concat(e.first_name, ' ', e.last_name) as Name, d.department_name, c.country_name
from hr.countries c
join hr.locations l
on l.country_id=c.country_id
join hr.departments d
on d.location_id=l.location_id
join hr.employees e
on d.department_id=e.department_id
join workhours w
on w.employee_id=e.employee_id
where w.hours > 74



