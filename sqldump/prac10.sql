use sakila;

-- question 1
create view actor_view as select first_name, last_name from actor;
select * from actor_view;

-- question 2
update actor_view set last_name = "DAVID" where first_name = "ED";
select * from actor_view;

-- question 3
create view actor_view2 as select actor_id, first_name, last_name from actor where first_name like "%E%" with check option;
select * from actor_view2;

-- question 4
drop view actor_view, actor_view2;