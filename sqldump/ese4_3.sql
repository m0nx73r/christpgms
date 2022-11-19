use ese4;
set autocommit = 0;
delete from emp;
insert into emp values
	(2, "Anish"),
    (3, "Arin");
    
select * from emp;
savepoint s1;
insert into emp values(4, "Vipin");
select * from emp;
rollback to s1;
select * from emp;