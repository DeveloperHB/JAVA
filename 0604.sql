drop database if exists triggerDB;
create database if not exists triggerDB;

use triggerDB;

create table ordertbl -- 구매 테이블 
(orderNo int auto_increment primary key, -- 구매 일련번호 
userID varchar(5), -- 구매한 회원아이디 
prodName varchar(5), -- 구매한 물건 
orderamount int ); -- 구매한 개수 

create table prodtbl -- 물품 테이블 
( prodname varchar(5), account Int ); -- 남은 물건수량 

create table deliverTbl -- 배송 테이블 
( deliverNo Int auto_increment primary key, -- 배송 일련번호 
prodName varchar(5), -- 배송할 물건 
account int); -- 배송할 물건개수 

show tables;

insert into prodtbl values('딸기', 100);
insert into prodtbl values('복숭아', 100);
insert into prodtbl values('사과', 100);
insert into prodtbl values('배', 100);
insert into prodtbl values('수박', 100);

select*from prodtbl;

-- 물품 테이블에서 개수를 감소시키는 트리거 작성 
drop trigger if exists orderTrg;
delimiter $$
create trigger orderTrg -- 트리거 이름
after insert on orderTbl -- 트리거를 부착할 테이블 이름 지정 
for each row 
begin 
  update prodTbl set account = account - new.orderamount where prodName = new.prodName;

end $$
delimiter ; 

-- 배송테이블에 새 배송 건을 입력하는 트리거 작성 
drop trigger if exists prodTrg;
delimiter $$
create trigger prodTrg -- 트리거 이름 지정
after update 
on prodTbl -- 트리거를 부착할 테이블 이름 지정 
for each row 
begin
 declare orderAmount int;
 -- 주문 개수 = ( 변경전의 개수 - 변경 후의 개수) 
 set orderAmount = old.account - new.account; 
 insert into deliverTbl(prodName, account) values(new.prodName, orderAmount);

end $$
delimiter ;

insert into orderTbl values (null, 'smith', '딸기', 10);
insert into orderTbl values (null, 'jhon', '복숭아', 20);
insert into orderTbl values (null, 'will', '배', 25);
insert into orderTbl values (null, 'david', '수박', 8);
insert into orderTbl values (10, '환Joo', '수박', 8);
insert into orderTbl values (11, '현bae', '사과', 7);

-- 중첩 트리거가 잘 동작하는지 세 태이블 확인 작업
select*from orderTbl; 
select*from prodTbl;
select*from deliverTbl;

-- insert 가 실패하도록 deliverTbl 테이블의 열이름 변경함 
alter table deliverTbl change prodName pName varchar(10);

-- deliverTbl 테이블의 열이름을 원래대로 다시 변경함 
alter table deliverTbl change pName prodName varchar(10);

desc deliverTbl;

insert into orderTbl values(null, 'page','딸기',11);
insert into orderTbl values(null, 'kham','복숭아',20);
insert into orderTbl values(9, 'alex','복숭아',20);
insert into orderTbl values(12, 'park','배',22);



