use ese4;	
grant delete on testtable to 'aditya'@'localhost';
revoke insert on testtable from 'aditya'@'localhost';
insert into testtable values
	(5), (7);