show tables;

use db3;

create table 고객 (
id int primary key auto_increment,
name varchar(20),
age int,
grade varchar(10),
job varchar(10),
savem int);

desc 고객;

insert
into 고객 
values ('apple','정소화',25,'VIP','간호사',2500);
insert
into 고객 
values ('Durian','김하나',19,'blonze','고등학생',2700);
insert
into 고객 
values ('fruit','강두나',22,'Ion','대학생',2500);
insert
into 고객 
values ('grape','나건웅',31,'VIP','개발자',3500);
insert
into 고객 
values ('strawberry','유환주',31,'diamond','개발자',8500);
insert
into 고객 
values ('pineapple','정대화','27','diamond','의사',2800);
insert
into 고객 
values ('banana','최소화',35,'platinum','간호조무사',3500);
insert
into 고객 
values ('lemon','정소수',45,'gold','물리치료사',5500);
insert
into 고객 
values ('carrot','정만화','37','diamond','의사',4000);
insert
into 고객 
values ('mango','오소화',55,'silver','병원장',7500);

select*from 고객;
show tables;
select*from product;
select*from order1;

select 주문제품, sum(수량) as 총주문수량
from order1
group by 주문제품;

-- product 테이블에서 제조업체별로 제조한 제품의 개수, 단가가 가장 비싼 검색
select 제조업체, count(*) as 제품수, max(단가) as 최고가
from product
group by 제조업체;

-- product 테이블에서 제품을 3개이상 제조한 제조업체
select 제조업체, count(*) as 제품수, max(단가) as 최고가
from product
group by 제조업체 having count(*) >= 3;

-- group by: 특정 속성의 값이 같은 튜플데이터를 모아 그룹을 만들고 그룹별 검색함
-- Having: 그룹에 대한 조건 작성

select * from order1;

select 주문제품, 주문고객, sum(수량) as 총주문수량
from order1
group by 주문제품;

select 주문고객, sum(수량) as 총주문수량
from order1
group by 주문고객;


select*from product;
select*from 고객;
select*from order1;

select product.제품명
from고객, product, order1
where 고객.name = '정소화' and 고객.id=order1.주문고객
and product.제품번호=order1.주문제품;

select order1.주문제품, order1.주문일자
from 고객 inner join order1 on 고객.id = order1.주문고객
where 고객.age >= 25;

select 고객.name, order1.주문제품, order1.주문일자
from 고객 left outer join order1 on 고객.id = order1.주문고객;

select 고객.name, order1.주문제품, order1.주문일자
from order1 right Outer join 고객 on order1.주문고객 = 고객.id;

select 제품명, 단가 
from product
where 제조업체 = (select 제조업체 
			    from product
                where 제품명 = '쿵떡파이');
                
select 제품명, 단가
from product
where 제조업체 = '한빛제과';

select name, savem
from 고객
where savem = (select max(savem) from 고객 );

select name, savem
from 고객
where savem = 5000;

select 제품명, 제조업체
from product
where 제품번호 In(select 주문제품 from order1 where 주문고객 = 'banana');

select 제품명, 제조업체
from product
where 제품번호 In ('p01','p04','p06');

select 제품명, 제조업체
from product
where 제품번호 Not in (select 주문제품 from order1 where 주문고객 = 'banana');
select*from product;
select*from order1;
select*from 고객;

select 제품명, 단가, 제조업체
from product
where 단가 > All (select 단가 from product where 제조업체 = '대한식품' );

select name
from 고객 
where exists (select * from order1 where 주문일자 = '2024-01-01' and order1.주문고객 = 고객.id ) ;

select * from customer;

update customer
set age = 23
where id = 50;

update customer
set grade='VIP', tel='010-2123-2224',addr='서울시 노원구'
where id = 400;
commit;
use db3;

update product set  제품명 = '뚱뚱우동' where 제품번호 = '10';
update product set 단가=단가 *10;

select*from product;
SHOW GRANTS FOR CURRENT_USER;

start transaction;

create table norder1 as select * from order1;
create table nproduct as select * from product;
select*from norder1;
select*from 고객;

delete
from norder1
where 주문번호='o02';

delete from product where 제품명 = '그냥만두';
delete from norder1 where 주문고객 in (select id from 고객 where name = '정소수');
drop table norder1;
use db3;
show tables;
drop table norder1;
drop table nproduct;

select job, count(job) as 총인원 from 고객 group by job;

