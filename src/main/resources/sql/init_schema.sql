drop table if exists users;

create table users
(
    user_id   SERIAL PRIMARY KEY,
    user_name TEXT NOT NULL ,
    user_surname TEXT NOT NULL
);
