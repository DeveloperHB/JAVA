use db3;
show tables;

select abs(-78), abs(78);
select round(4.875, 2);
select*from customer;

select id, name, replace(grade, 'gold', '골드') as 등급
from customer;

select id, name, replace(job, '학생', '졸업생') as 직업 from customer;

select name, char_length(name) as 문자수, length(name) as 바이트수
from customer;

select substr(name, 1,1) as 성, count(*) as 인원 
from customer
group by substr(name, 1,1);

select adddate('2024-05-25', interval -5 day) as before5;
select adddate('2024-05-25', interval -200 day) as before200;
select adddate('2024-05-25', interval 5 day) as after5;
select adddate('2024-05-25', interval 300 day) as after300;

select*from order1; 
select 주문번호,주문일자, adddate(주문일자, interval 10 day) as 확정일자 from order1;
select 주문번호,주문일자, adddate(주문일자, interval 30 day) as 확정일자 from order1;
select 주문번호,주문일자, adddate(주문일자, interval -20 day) as 확정일자 from order1;

select 주문고객, 주문제품, date_format(주문일자, '%Y/%m/%d') as 주문일 from order1;
select 주문고객, 주문제품, date_format(주문일자, '%Y/%m/%d') as 주문일 from order1;

select str_to_date('20240101','%Y/%m/%d')as 날자형변환;

select 주문고객, 주문제품, date_format(주문일, '%y/%m,%d') as 주문일 from order1 where 주문일 = str_to_date('20240505', '%y%m%d');
alter table order1 add 주문일 varchar(30);
update order1 set 주문일 = 20240505;
select*from order1;
alter table order1 drop 주문일;
select sysdate(), date_format(sysdate(),'%y/%m/%d %W %H:%i:%s') as  sysdate_1;

select*from customer;
select*from customer where grade is null;
select*from customer where grade is not null;
select*from customer where tel is null;
select name, ifnull(tel,'연락처없음') as 전화번호 from customer;

set @seq:=0;
select (@seq:=@seq+1) as 순번, name, job
from customer where @seq < 5;

select * from customer where job = '회사원';

create view v1_customer as select*from customer where job = '회사원';
select*from v1_customer;
select*from customer;
select*from customer where grade= 'gold';
create view v2_customer as select*from customer where grade = 'gold';
select*from v2_customer;
show tables;
insert into v2_customer values(500, '유재석', 40, 'gold', '연예인', '010-2420-5005', '서울시 강남구'); 
create view v3_customer as select*from customer where age = '40';
select*from v3_customer;
insert into v1_customer values(222, '감자밭', 33, 'gold', '회사원', '010-1155-2251', '서울시 강서구');
insert into v1_customer values(888, '유환주', 31, 'gold', '학생','010-1122-2211','서울시 강서구');
insert into v4_customer values(444,'나건웅',31,'platinum','학생','010-2223-2221','서울시 강남구');
create or replace view v1_customer as select * from customer where job = '학생';
select*from v1_customer;
select*from v4_customer;

select product2.제품명,고객.name, order1.주문고객, order1.수량 from 고객, order1, product2 where 고객.name = '유환주' and 고객.id = order1.주문고객 and product2.제품번호= order1.주문제품; 

show tables;
select*from order1;
select*from product2;
select*from v3_고op;

drop view v3_고_op;

select id, name, age, grade from customer where grade = 'vip';
create view 우수고객 as select id, name, age, grade from customer where grade ='vip' with check option;
create view 미비고객 as select id, name, age, grade, job, tel, addr from customer where grade = 'silver' with check option;
show tables;
insert into 우수고객 values(1000,'이동진',31,'vip');
insert into 미비고객 values(1001,'김태립',25,'silver','학생','010-2211-2222','서울시 구로구');
select*from 미비고객;
select*from customer;
update 우수고객 set age= 100 where name = '이동진';
update 우수고객 set age= 150 where name = '김자바';
update 우수고객 set age= 200 where name like '이%';
select*from 우수고객;
delete from 우수고객 where name like '이%';
select lpad('database', 20, '#'), rpad('database',20,'*');
select left('sql 완전정복', 3), right('sql 완전정복',4), substr('sql 완전정복', 2, 5), substr('sql 완전정복', 2);

select concat('sql 완전정복','database'), concat_ws('-','sql 완전정복','database');
select concat_ws('/', '2024','05','23');

select substring_index('서울시 동작구 흑석로',' ',2);
select substring_index('서울시 동작구 흑석로',' ',-2);

select*from customer order by name asc limit 3;
select*from 고객 where savem between 1000 and 4000;

select repeat('*',10);
select reverse('헬로우 자바');

select*from 고객;
select avg(savem) from 고객;
select job, count(*) as 인원수 , avg(savem) as 평균적립금
from 고객 group by job with rollup;
show tables;
select*from product1;

select name, job from 고객 where id in(select 주문고객 from order1 where 배송지 like '서울시%');
select savem, id, name from 고객 where grade like 'silver';
select name, job, savem from 고객 where savem > any (select savem from 고객 where job = '대학생');
select * from 고객;

insert into 고객(id,name,grade) values('pear1', '변사또', 'VIP') on duplicate key update name='이몽룡';
show tables;
create table ncustomer as select * from customer;
select * from ncustomer;

insert into ncustomer(id,name) values(330,'홍길순');

insert into customer(id, name) select id, name from ncustomer where name = '홍길순';
select id, name from ncustomer where name='홍길순';

create table 수강(
 수강번호 int primary key auto_increment,
 수강년도 char(4) not null,
 수강학기 varchar(20) not null check(수강학기 in('1학기','2학기','여름학기')),
 학번 char(5) not null,
 과목번호 char(5) not null,
 성적 Numeric (3,2) check(성적 between 0 and 4.5),
 foreign key (학번) references 학생(학번),
 foreign key(과목번호) references 과목(과목번호));