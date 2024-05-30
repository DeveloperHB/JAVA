use db3;
create table tbl1
(  a  int primary key,  
   b  int,
   c int );
   
-- 인덱스 상태 확인   
show index from  tbl1;  
    
create table tbl2
(
 a int primary key, -- 클러스터 인덱스
 b int unique,      -- 보조 인덱스
 c int unique,
 d int);
 
 show index from tbl2;
 
 create table tbl3
 (
   a int unique,
   b int unique,
   c int unique,
   d int);
   
 show index from tbl3;  
 
 create table tbl4 
 (
   a int unique NOT NULL,   -- 클러스터형 인덱스로 지정되어 자동 정렬
   b int unique,
   c int unique,
   d int );
   
show index from tbl4;  

--  unique NOT NULL , primary key 모두 지정
create table tbl5
(
    a int unique NOT NULL,
    b int unique,
    c int unique,
    d int primary key );
show index from tbl5;   

create database if not exists testdb;
use testdb;
Drop table If exists usertbl;
create table usertbl
( userID char(8) NOT NULL primary key,
  name varchar(10) NOT NULL,
  birthYear int NOT NULL,
  addr nchar(2) NOT NULL );
  
-- nchar(2) 지정 : 한글이든 영문이든 무조건 2글자만 저장함 
show tables;

insert into usertbl values('LSG', '이승기', 1987, '서울');
insert into usertbl values('KBS', '김범수', 1979, '경남');
insert into usertbl values('KKH', '김경호', 1971, '전남');
insert into usertbl values('JYP', '조용필', 1950, '경기');
insert into usertbl values('SSK', '성시경', 1979, '서울');
Select * from usertbl;

show index from usertbl;  

-- userID 열의 primary key 제거, name 열을 primary key 로 변경 지정
Alter table usertbl Drop primary key;
Alter table usertbl ADD constraint pk_name primary key(name);
show index from usertbl;
select * from usertbl;

-- 인덱스가 없는 테이블 생성
create database if not exists testdb;
use testdb;
drop table if exists clustertbl;
create table clustertbl
( userID char(8),
  name varchar(10)
  );
show tables;  
insert into  clustertbl values('LSG', '이승기');
insert into  clustertbl values('KBS', '김범수'); 
insert into  clustertbl values('KKH', '김경호');
insert into  clustertbl values('JYP', '조용필');
insert into  clustertbl values('SSH', '성시경');
insert into  clustertbl values('LJB', '임재범');
insert into  clustertbl values('YJS', '윤종신');
insert into  clustertbl values('EJW', '은지원');
insert into  clustertbl values('JKW', '조관우');
 
 select * from clustertbl;
 
 -- 클러스터형 인덱스를 구성(userID를 primary key 지정함)
 Alter Table clustertbl ADD constraint PK_clustertbl_userID
        primary key(userID);
 
create table secondarytbl
( userID char(8),
  name varchar(10)
  );
insert into  secondarytbl values('LSG', '이승기');
insert into  secondarytbl values('KBS', '김범수'); 
insert into  secondarytbl values('KKH', '김경호');
insert into  secondarytbl values('JYP', '조용필');
insert into  secondarytbl values('SSH', '성시경');
insert into  secondarytbl values('LJB', '임재범');
insert into  secondarytbl values('YJS', '윤종신');
insert into  secondarytbl values('EJW', '은지원');
insert into  secondarytbl values('JKW', '조관우'); 

select * from secondarytbl; 

-- 보조 인덱스로 구성
Alter Table secondarytbl ADD constraint UK_secondarytbl_userID
     unique(userID);

-- 클러스터 인덱스 구성된 테이블에 새로운 데이터 입력
Insert into clustertbl values('FNT', '푸니타');
Insert into clustertbl values('KAI', '카아이');

select * from clustertbl;

-- 보조 인덱스로 구성된 테이블에 새로운 데이터 입력
Insert into secondarytbl values('FNT', '푸니타');
Insert into secondarytbl values('KAI', '카아이');

select * from secondarytbl;

show tables;
analyze table clustertbl;
show index from clustertbl; 

-- 인덱스는 열단위로 생성
-- where 절에서 사용되는 열에 인덱스를 만들어야 함
-- join 에 자주 사용되는 열에는 인덱스를 생성해 주는 것이 좋음
-- 클러스터형 인덱스는 테이블당 하나만 생성가능
-- 사용하지 않는 인덱스는 제거(공간확보 차원)



