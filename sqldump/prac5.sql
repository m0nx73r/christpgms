-- create database prac5;
-- use prac5;
-- create table emps(
-- 	employee_number int,
--     last_name varchar(255),
--     fname varchar(255),
--     hire_date date,
--     salary int,
--     comm int,
--     jobs varchar(255)
-- );

-- insert into emps values
-- 	(1001, "Smith", "Sahil", "1981-01-01", 62000, 70000, "President"),
--     (1002, "Anderson", "Jane", "1978-12-01", 57500, 50000, "Clerk"),
--     (1003, "Everset", "Smiju", "1984-03-02", 30000, 4000, "Manager"),
--     (1004, "Horvath", "Jack", "1980-01-11", 42000, 50000, "Accountant"),
--     (1005, "Johnson", "Jary", "1981-01-01", 58000, 20000, "Cashier");



-- use prac 5;

-- create table customers(
-- 	eno int,
--     fname varchar(255),
--     city varchar(255),
--     country varchar(255),
--     grade int
-- );

-- insert into customers values
-- 	(1001, "Sahil", "Sydney", "Australia", 3),
--     (1002, "Jane", "London", "UK", 2),
--     (1003, "Smiju", "New York", "USA", 1),
--     (1004, "Jack", "Bangalore", "India", 2),
--     (1005, "Jary", "Brisbane", "Australia", 3),
--     (1006, "Homles", "New York", "USA", 4),
--     (1007, "Michael", "Banglore", "India", 1),
--     (1008, "Albert", "New Delhi", "India", 2),
--     (1009, "Robert", "Toronto", "Canada", 2),
--     (1010, "Christina", "Sydney", "Australia", 1),
--     (1011, "Smith", "London", "UK", 2),
--     (1012, "Anderson", "New York", "USA", 1),
--     (1013, "Everest", "Chennai", "India", 4),
--     (1014, "Horvarth", "Brisbane", "Australia", 4),
--     (1015, "Johnson", "Chennai", "India", 3);

-- select * from customers;

use prac5;
select * from customers where grade<>1 and eno<>1003 and country<>"India";