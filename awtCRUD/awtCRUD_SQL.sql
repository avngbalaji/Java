create database dbjoes;
use dbjoes;
create table users(
	ID int primary key auto_increment,
    NAME varchar(50),
    AGE int,
    CITY varchar(50)
);
select * from users;
insert into users (NAME,AGE,CITY) values ('Ram',25,'Salem');