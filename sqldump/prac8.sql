create database prac8;
use prac8;

create table supplier(
	supplier_id int,
    supplier_name varchar(255)
);

create table orders(
	order_id int,
    supplier_id int,
	order_date date
);

insert into supplier values
	(10000, "IBM"),
    (10001, "Hewlett Packard"),
    (10002, "Microsoft"),
    (10003, "NVIDIA");
    
insert into orders values
	(500125, 10000, "2013-05-12"),
    (500126, 10001, "2013-05-13"),
    (500127, 10004, "2013-05-14");

select * from supplier natural join orders;
