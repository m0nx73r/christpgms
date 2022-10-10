use sakila;
GRANT SELECT ON actor TO 'root'@'localhost';
REVOKE SELECT ON actor FROM 'root'@'localhost';
