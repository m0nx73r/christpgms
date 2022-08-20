create database student;
use student;

create table info(
  name varchar(255),
  regnum int,
  phonenum int,
  address varchar(255)
);

create table attendence(
  regnum int,
  name varchar(255),
  hoursAbsent int,
  hoursPresent int
);

drop table attendence;

alter table info add mail varchar(255);
alter table info rename to studentInfo;
desc studentInfo;