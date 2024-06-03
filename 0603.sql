use testdb;
select*from buytbl;

-- 중간합계 , 총합계를 구하기
select num, groupname, Sum(price * amount) As '비용'
from buytbl
group by groupName, num
with rollup; -- groupName(분류별) 합계와 총합을 함께 구하기 

-- 테이블 구조 복사하기(employees 구조 복사)
create table nemp like employees;

desc nemp;
use testdb;
create table nemp like employees.employees;

desc nemp;
select*from nemp;

-- 구조가 같은 경우 데이터만 복사하기
select*from employees.employees where first_name Like 'A%'
and last_name like 'g%';

-- nemp 에 insert
insert into nemp select*from employees.employees where first_name like 'A%' and last_name like'A%';

select*from nemp;

-- last_name 의 길이가 5글자인 필드만 골라서 원하는 '김 | 홍 | ... '으로 Update함
update nemp
set last_name='홍'
where last_name like'____';

select*from nemp;

create table pivotTest
(uName char(3),
season char(2),
amount int);
select*from pivotTest;

insert into pivotTest values
('김범수','겨울',10),('김경호','여름',15),('윤종신','가을',25),('임재범','봄',30),('김광석','겨울',40),('허각','봄',5),
('김범수','여름',35),('김경호','가을',50);

select uName,
SUM(IF(season='봄', amount, 0)) as 봄,
SUM(IF(season='여름', amount, 0)) as 여름,
SUM(IF(season='가을', amount, 0)) as 가을,
SUM(IF(season='겨울', amount, 0)) as 겨울,
sum(amount) As 합계 
from pivotTest
Group by uName;

select*from usertbl;
select Json_Object( 'name', name, 'height', height) As 'JSON 값'
from usertbl
where height >= 180; 

desc usertbl;

SET @json='{"usertbl" :
[
  {"name":"임재범","height":182},
  {"name":"이승기","height":182},
  {"name":"김경호","height":186}
  ]
  }';
  
  select json_valid(@json) as json_valid;
  select json_search(@json, 'one', '이승기') as json_search;
  select json_extract(@json, '$.usertbl[1].name') as json_extract;
  select json_insert(@json, '$.usertbl[0].mDate', '2008-08-08')as json_insert;
  select json_insert(@json, '$.usertbl[1].mDate', '2024-06-03')as json_insert;
  select json_replace(@json, '$.usertbl[0].name','홍길동')as json_replace;
  select json_remove(@json, '$.usertbl[0]')as json_remove;
  
  use testdb;
  select*from usertbl;
  
  -- 일반 고객 호출하는 프로시저 작성
  drop procedure if exists uproc1;
  delimiter $$
  create procedure uproc1(in usergrade char(10),in userHeight int)
  begin 
     select*from usertbl where grade = usergrade and height = userHeight;
     end $$
     delimiter ;
     call uproc1('일반고객','175');
     call uproc1('유령고객','178');

-- usertbl에서 birthYear의 합을 커서를 이용 
 drop procedure if exists cursorProc;
 delimiter $$
 create procedure cursorProc()
 begin 
  declare userBirthYear int;
  declare cnt int default 0;
  declare totalBirthYear int default 0;
  
  declare endOfRow boolean default false; -- 행의 끝 여부 (기본값:false)
  declare userCursor cursor for -- 커서 선언
  select BirthYear from usertbl;
declare continue handler -- 행의 끝이면 endOfRow 변수에 true 대입
	for not found set endOfRow = true;
 
 open userCursor; -- 커서 열기
 cursor_loop: loop
   fetch userCursor into userBirthYear; -- 고객 height 1개를 대입
     if endOfRow then leave cursor_loop; end if; -- 더 이상 읽을 행이 없으면 Loop를 종료
     set cnt = cnt +1;
     set totalBirthYear = totalBirthYear + userBirthYear;
    end loop cursor_loop;
select concat('평균 ==>',  (totalBirthYear/cnt)) as '출생년도 평균', concat(' 합계 ==>',(totalBirthyear)) as '출생년도 합계';
close userCursor;
end $$ 
delimiter ;

call cursorProc();

-- 트리거 (방아쇠를 당기면 자동으로 총알이 나가듯이 테이블에 무슨 일이 생기면 자동으로 실행)
-- 테이블에 생기는 이벤트는 : Insert, update, Delete 
-- 테이블에 부착되는 프로그램 코드 
-- 직접 실행은 불가--> 테이블에 이벤트가 일어나야 자동실행함 

create table if not exists samtbl (id int, name varchar(10));
insert into samtbl values(1, '조인성');
insert into samtbl values(2, '현빈');
insert into samtbl values(3, '원빈');
insert into samtbl values(4, '혜빈');

-- samtbl 에 트리거 부착 
Drop trigger IF exists samTrg;
delimiter $$
create trigger samTrg -- 트리거의 이름을 지정함   
 after delete -- insert 후에 samTrg 가 작동하도록 지정함
 on samtbl -- 트리거를 부착할 테이블 이름 지정
 for each row -- 각 행마다 적용시킴
 begin
  set @msg = '영화배우가 삭제됨 '; -- 트리거 실행시 작동되는 코드들을 작성함 
 end $$
  delimiter ;   
  
  set @msg ='';
  select * from samtbl; 
  
  update samtbl set name = '박현빈' where id = 2;
  select @msg;
  
  insert into samtbl values(4, '혜빈');
  
  delete from samtbl where id = 3;
  select @msg;
  
  -- 새로운 트리거 생성
  Drop trigger if exists usertbl_InsertTrg11;
  delimiter $$
  create trigger usertbl1_InsertTrg11 -- 트리거의 이름을 지정함
  After insert -- 입력후에 작동하도록 지정함
  on usertbl
  for each row
  begin
  signal sqlstate '45000'
  set message_text = '데이터의 입력을 시도했습니다. 귀하의 정보가 서버에 기록되었습니다.'
  
  

  /* signal sqlstate '45000'
  사용자가 오류를 강제로 발생시키는 함수
  사용자가 정의한 오류 메시지가 출력됨
  사용자가 시도한 insert는 롤백
  */
  
  insert into usertbl values('123','일이삼',1977,'서울',179,'vip');
  -- 경고메시지가 출력 된 후에 insert 작업은 롤백이되고 usertbl에는 삽입되지 않음
  select*from usertbl;
  -- usertbl 을 그대로 복사
  create table usertbl11 as Select*from usertbl;
  -- 변경되기 전의 데이터를 저장할 테이블을 생성(backup_usertbl11)
  create table backup_usertbl11
  ( userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL,
    addr CHAR(2) NOT NULL,
    height SMALLINT,
    grade VARCHAR(5),
    modType CHAR(2),      -- 변경된 타입. '수정'OR'삭제'
    modDate DATE,         -- 변경된 날짜
    modUser VARCHAR(256)  -- 변경한 사용자
    );
    select*from usertbl11;
    -- update 발생시 작동하는 트리거 생성s
    Drop trigger if exists backUserTbl_UpdateTrg11;
    delimiter $$
    create trigger backUserTbl_UpdateTrg11 -- 트리거 이름 지정
    after update -- update 변경 후에 작동하도록 지정함
    on usertbl11 -- 트리거를 부착할 테이블 이름 지정함
    for each row
    begin
    insert into backup_usertbl11 values(OLD.userId, OLD.name, OLD.birthYear,
           OLD.addr, OLD.height, OLD.grade,'수정', curdate(), current_user());
    End $$
    delimiter ; 
    
    -- 삭제 발생시 작동하는 트리거 생성 
    Drop trigger if exists backUserTbl_DeleteTrg11;
    delimiter $$
    create trigger backUserTbl_DeleteTrg11 -- 트리거 이름 지정
    After delete -- 삭제(delete) 후에 작동하도록 지정함
    On usertbl11 -- 트리거를 부착할 테이블 이름 지정함
    for each row 
    begin
     insert into backup_usertbl11 values(OLD.userId, OLD.name, OLD.birthYear,
     OLD.addr, OLD.height, OLD.grade,'삭제',curdate(), current_user());
    end $$
    delimiter ;
    
    update usertbl11 set name = '김봉수' where userid = 'KBS';
    
  insert into usertbl11 values('JHB', '전혜빈',1988,'서울',168,'유령고객');
  
  delete from usertbl11 where userId = 'JHB';

    
    select * from usertbl11;
    select * from backUserTbl_DeleteTrg11;
    select * from backup_usertbl11;
    
    Update usertbl11 set addr = 'LA' where addr = '서울';
    Update usertbl11 set addr = '호주' where userid = 'KKH';
    
    delete from usertbl11 where name like '김%';
    
    truncate table usertbl11;
    
    -- before 트리거:  테이블에 변경이 가해지기 전에 작동함
	-- before insert 트리거를 부착해 놓으면 입력될 데이터 값을 미리 확인해서 문제가 있을 경울 다른 값으로 변경해 줌
    -- insert, UPDATE, DELETE 세가지 이벤트로 작동함
    Drop trigger if exists usserTbl_BeforeInserTrg11;
    DELIMITER $$
    create trigger userTbl_BeforeInserTrg11 -- 트리거 이름 지정
    before Insert -- 입력(Insert) 전에 작동하도록 지정함  
    on usertbl11 -- 트리거를 부착할 테이블 생성 
    for each row   
    begin 
       if new.birthYear < 1900 then 
       set new.birthYear = 0;
       elseif new.birthYear > year(curdate()) then
       set new.birthYear = year(curdate());
       end if;
       end $$
       delimiter ;
    select*from usertbl11;
    
    insert into usertbl11 values('ccc','씨씨',1877,'서울',181,'vip');
    
	insert into usertbl11 values('zzz','지지',1777,'경남',165,'vip');
    
    show triggers from testdb;
    
    drop trigger samtrg;