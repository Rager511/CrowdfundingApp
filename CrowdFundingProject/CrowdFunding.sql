create database crowdfunding;
use crowdfunding;
create table administrationRegister(
id int primary key,
name varchar (100),
email varchar (200),
password varchar (200)
);

create table funding(
id int,
projectname varchar (200),
ngo varchar (200),
ass varchar (200),
rasing varchar (200),
status varchar (200),
amount1 varchar (200),
project varchar (200)
);
select * from funding;



