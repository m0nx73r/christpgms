use ese3;

create table employee(
	emp_id int not null auto_increment,
    fname varchar(255),
    lname varchar(255),
    age int,
    department varchar(255),
    experience int,
    check(age<60),
    primary key (emp_id)
);

insert into employee values
	(NULL, "Aditya", "Kumar", 20, "CS", 2),
    (NULL, "Arin", "Sharma", 20, "CS", 3),
    (NULL, "Adhiraj", "Singh", 55, "CS", 8),
    (NULL, "Anmol", "Kashyap", 30, "CS", 6),
    (NULL, "Abin", "Saji", 52, "CS", 9);


select * from employee where fname like "A____";
create view ese3_view as select * from employee where experience>5;
select * from ese3_view;

