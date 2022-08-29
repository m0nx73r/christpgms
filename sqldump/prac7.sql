create database prac7;
use prac7;

create table emp_info(
	emp_id int,
    emp_name varchar(255),
    emp_salary float,
    emp_status varchar(255)
);

insert into employee values
	(1, "Onkar", 100000, "Confirmed"),
    (2, "Admin", 300000, "Probation"),
    (3, "Rohit", 400000, "Confirmed"),
    (4, "John", 100000, "Notice"),
    (5, "Simran", 50000, "Notice"),
    (6, "Jasmine", 150000, "Confirmed"),
    (7, "Riya", 180000, "Probation");


SELECT * FROM emp_info GROUP BY emp_status;
SELECT emp_name, count(emp_status) FROM emp_info GROUP BY emp_name;
SELECT emp_name, (emp_salary * 12) as CTC FROM emp_info GROUP BY emp_name;
SELECT emp_name, (emp_salary * 12) as CTC FROM emp_info WHERE emp_status = 'Confirmed' GROUP BY emp_name;
SELECT emp_id, emp_name, (emp_salary * 12) as CTC FROM emp_info WHERE emp_status = 'Confirmed' or (emp_status = 'Notice' and emp_name = 'Simran') GROUP BY emp_salary HAVING emp_salary > 100000;
