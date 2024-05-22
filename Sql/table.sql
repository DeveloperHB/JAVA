CREATE database DB1;

use DB1;

CREATE table table1(id int primary key, name varchar(20), age int, tel varchar(20), addr varchar(20));

desc table1;
Alter table table1 ADD addr varchar(30);
Alter table table1 Modify age varchar(5);
desc table1;

show tables;

alter table table1 Drop addr;
desc table1;

alter table table1 add addr varchar(30);
alter table table1 add grade varchar(30);
alter table table1 add job varchar(30);

use sakila;
desc actor;
desc address;
use db1;

insert
into table1(id,name,age,tel,addr)
values(100,'홍길동','30','010-1234-5678','서울시 구로구');

select *from table1;
insert
into table1 (id,name,age,tel,addr)
values (1,'홍길순','25','010-2251-2521','서울시 강남구');

select*from info;
select id, name from table1;

rename table table1 to newtable;
show tables;

alter Table newtable rename ntable1;
show tables;

select * from ntable1;

use DB2;
show tables;

drop table table1;
show tables;