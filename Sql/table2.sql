create DATABASE DB3;

use DB3;

create table customer (
id int primary key,
name varchar(20),
age int,
grade varchar(10),
job varchar(10),
tel varchar(20)
);


desc customer;

Alter Table customer ADD addr varchar(30);


Alter Table customer Modify age varchar(3);

Show Tables;

insert
into customer(id,name, age,grade,job,tel,addr)
values (2,'임자바','38','gold','교사','010-5617-2771','서울시 관악구');

insert
into customer
values (200,'강자바','28','platinum','의사','010-5215-2266','서울시 강남구');

insert
into customer(id,name, age,grade,job,tel, addr)
values (511,'길동이','33','blonze','학생','010-2556-2221' ,'서울시 마포구');

insert
into customer(id,name,age,grade,job,tel,addr)
values (611,'제돌이','35','silver','자영업','010-5577-3332','서울시 동작구');

SELECT * FROM customer WHERE id = 500;


insert customer(id,name,age,grade,job,tel,addr)
values(255,'제승이','39','gold','프로그래머','010-5521-2221','서울시 성북구');

insert customer(id,name,age,grade,job,tel,addr)
values(333,'임삿갓','37','diamond','ceo','010-2233-7788','서울시 광진구');
  
select * from customer;
select name, job from customer;
select job from customer;
select distinct job from customer;
select grade from customer;
select distinct grade from customer;
select all grade from customer;

select name as 이름, age as 나이
from customer;

select name as 이름, id * 100 as 월급 from customer;

select *
from customer
order by age ASC;

select *
from customer
order by age desc;

select * from customer where name ='김자바';

select * from customer where grade = 'platinum';

select * from customer where addr = '서울시 강남구';

select * from customer where name like '김%';

select * from customer where name like '%바';


select * from customer where addr like '&강남구%';

select * from customer where age > 30 and job='교사';

select * from customer where age >=30 or job='회사원';

select * from customer where age is null;

select * from customer where tel like '010%';
select * from customer where job='ceo' or job='회사원';

select * from customer where job in ('ceo','회사원','자영업');

alter table  customer modify age int;
desc customer;
select * from customer;
select * from customer where age>30 order by age asc;

-- customer 테이블에서 이름, 나이, 등급 검색==>나이를 내림차순 정렬.
select * from customer where age>30 order by age desc;

create table product (
제품번호 int primary key auto_increment,
제품명 varchar(20),
재고량 int,
단가 int,
제조업체 varchar(20)
);

desc product;

Alter table product change 재고량age 재고량 int;

insert
into product
values (10,'짜파게티',3300,4500,'국민푸드');
delete from product where 제품명 = '고기만두';
update product set  제품명 = '' where 제품번호 = '10';
update product set 제조업체 = '한빛제과' where 제품번호 = 8;
update product set 제품번호 = 제품번호-7 where 제품번호>=10;
select count(id) as 고객수 from customer;
update product set 단가= 8000 where 제품명 = '사과파이';

select*from product;
/*1	그냥만두	5000	4500	대한식품
2	그냥만두	5000	4500	대한식품
3	그냥만두	5000	4500	대한식품
4	그냥만두	5000	4500	대한식품
5	그냥만두	5000	4500	대한식품
6	매운쫄면	2500	5500	민국푸드
7	쿵떡파이	3600	2600	한빛제과
8	abc초콜릿	2500	3000	빛더미제과
9	땡초라면	2200	3000	중국식품
10	뚱뚱우동	2200	4000	국민푸드
11	쌉쌀비스킷	1000	1500	별빛푸드*/
show tables;

-- product에서 제품명, 단가 검색 ==> 단가를 가격으로 변경alter
select 제품명, 단가 as 가격 from product;
select 재고량age as 재고량 from product;

-- product에서 제품명, 단가 검색하되==> 단가 + 500 더해 '조정단가' 변경alter
select 제품명, 단가+500 as 조정단가 from product;

-- 한빛제과가 제조한 제품의 제품명, 재고량, 단가 검색
select 제품명, 단가, 제조업체 from product where 제조업체 = '한빛제과';

create table order1 (
주문번호 varchar(5) primary key,
주문고객 varchar(20),
주문제품 varchar(5),
수량 int,
배송지 varchar(30),
주문일자 date
);

desc order1;
insert into order1 values('p01','apple','p03',10,'서울시 마포구',20240101);
select*from order1;

insert into order1 values('o02','pineapple','p04',11,'서울시 광진구',20240101);

insert into order1 values('o03','grape','p05',12,'서울시 강남구',20240101);

insert into order1 values('o04','peach','p06',14,'서울시 성북구',20240101);

insert into order1 values('o05','orange','p07',15,'서울시 송파구',20240101);

insert into order1 values('o06','mango','p08',16,'인천시 계양구',20240101);

insert into order1 values('o07','watermelon','p09',17,'경기도 성남시',20240101);

select*from order1 where 주문고객 = 'orange' and 수량 >=15;

select*from order1 where 주문고객 = 'pineapple' or 수량>=10;

show tables;

select * from product;

-- 단가 2천원 이상 ~ 3천원 이하 조건 
select*from product where 단가 >=2000 and 단가 <=3000
order by 단가 asc;

select*from order1;
-- 수량10개이상인 주문검색 ==> 기준으로 오름차순,
-- 동일제품은 수량을 기준으로 내림차순 정렬
select*from order1 where 수량>=10 order by 주문제품 asc, 수량 desc;   


select*from product where 제조업체 = '빛더미제과';

select sum(재고량) as 재고량합계 from product where '빛더미제과';

select * from customer;

select count(id) as 고객수 from customer;

select count(age) as 고객수 from customer;

show tables;

select count(distinct 제조업체) as 제조업체수 from product;

select * from product where 제조업체 = '한빛제과' 
union select * from product where 제조업체 ='빛더미제과';

				
