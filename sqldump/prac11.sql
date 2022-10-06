use sakila;
create index idx_id on actor(actor_id);
create index idx_name on actor(first_name, last_name);