use testdb;
select*from usertbl;
alter table usertbl add height smallint;

update usertbl
set height = 185
where height is null;
select*from usertbl;

set sql_safe_updates = 0;

update usertbl
set height  = 175
where name like '김%';

-- 스토어드 프로시저 작성
drop procedure if exists userProc1;

delimiter $$
create procedure userProc1(in username varchar(10))
begin
  select*from usertbl where name  = username;


end $$
delimiter ;

call userproc1('성시경');
call userproc1('조용필');
call userproc1('김범수');

drop procedure if exists userProc2;
delimiter $$
create procedure userproc2(
 in userBirth int,
 in userHeight int)
 begin
 select*from usertbl where birthYear > userBirth and height > userheight;
 end $$
 delimiter ;
 
 call userProc2(1970, 178);
 
 drop procedure if exists userProc3;
 delimiter $$
 create procedure userProc3(in txtValue char(10), out outValue int)
 begin
 insert into testtbl values(null,txtValue);
 select max(id) into outValue from testtbl;
 end$$
 delimiter ;
 
 create table if not exists testtbl(
 id int auto_increment primary key,
 txt char(10));
 
 call userproc3('사',@myValue);
 
 select*from testtbl;
 select concat('현재 입력된 id 값 ==>', @myValue);
 
 drop procedure if exists ifelseProc;
 delimiter $$
 create procedure ifelseProc ( in userName varchar(10) )
 begin
   declare bYear int; -- 변수 선언 
   select birthYear into bYear from usertbl
    where name = userName;
   If( bYear >= 1980) then
   select 'Yong 하시네요';
   Else 
   select 'old 하시네요';
   end If;
 end $$
 delimiter ;
 
 call ifelseProc('이승기');
 call ifelseProc('성시경');
 select * from usertbl;
 
 -- usertbl 에서 birthYear 띠를 출력 , case 
 drop procedure if exists caseProc;
 delimiter $$
 create procedure caseProc(
  in userName Varchar(10) )
  begin
  declare bYear int;
  declare tti varchar(3);
  select birthYear into bYear from usertbl where name = userName;
  
  case 
  when (bYear%12 = 0) then set tti = '신';
  when (bYear%12 = 1) then set tti = '유';
  when (bYear%12 = 2) then set tti = '술';
  when (bYear%12 = 3) then set tti = '해';
  when (bYear%12 = 4) then set tti = '자';
  when (bYear%12 = 5) then set tti = '축';
  when (bYear%12 = 6) then set tti = '인';
  when (bYear%12 = 7) then set tti = '묘';
  when (bYear%12 = 8) then set tti = '진';
  when (bYear%12 = 9) then set tti = '사'; 
  when (bYear%12 = 10) then set tti = '오';
  else set tti = '미';
  end case;
  select concat ( userName, '의 띠 ===>', tti);
  end $$
  delimiter ;
  insert into usertbl value ('LHB','임현배',1987,'서울',178);
  select*from usertbl;
  desc usertbl;
 call caseProc('성시경');
 call caseProc('조용필');
 call caseProc('이승기');
 call caseProc('임현배');
 
 drop procedure if exists errorProc;
 delimiter $$
 create procedure errorProc()
 begin
  declare continue handler for 1146 select '테이블이 없어요ㅜ' as 메시지;
  select * from noTable; -- noTable 은 없음 
  end $$
  delimiter ;
    
  -- declare continue handler for 오류조건 처리할문장;
  call errorProc();
  
  drop procedure if exists errorProc1;
  delimiter $$
  create procedure errorProc1()
  begin
  declare continue handler for sqlexception
   show errors; -- 오류 메시지를 보여줌
   select '오류가 발생했어요. 작업은 취소시켰습니다.' as 메시지;
   rollback; -- 오류 발생시 작업을 롤백시킴
   end;
   insert into usertbl values('LSG','이승기',1987,'서울',185);
   -- 중복되는 아이디이므로 오류 발생함
   END $$
   delimiter ;
   call errorProc1();
   select*from usertbl;
   
   prepare myQuery from 'select * From usertbl where name = "이승기"';
   -- prepare : SQL문을 실행하지는 않고 미리 준비만 해놓음
   
   execute myQuery;
   -- execute: 준비한 쿼리문 실행
  
  deallocate prepare myQuery;
  -- 실행 후에는 deallocate prepare 로 문장 해제 
  
  drop table if exists guguTBL;
  create table guguTBL (txt varchar(100)); -- 구구단 저장용 테이블
  
  drop procedure if exists whileProc;
  delimiter $$
  create procedure whileProc()
  begin
   declare str varchar(100); -- 각 단을 문자열로 저장
   declare i int; -- 구구단 앞자리 
   declare k int; -- 구구단 뒷자리 
   set i = 2;  -- 2단부터 계산함
   
   while (i<10) Do -- 바깥 반복문, 2단 ~ 9단까지 
   set str = ''; -- 각단의 결과를 저장할 문자열 초기화 
   set k = 1; -- 구구단 뒷자리는 항상 1~9까지 
   While (k<10) Do
   set str = concat(str, ' ', i,'x',k,'=',i*k); -- 문자열 만들기 
   set k = k+1;  -- 뒷자리 1씩 증가 
   end while;
   insert into guguTBL values(str); -- 각 단의 결과를 테이블에 입력
   set i = i+1; -- 앞자리 1씩 증가 
   END WHILE;
   end $$
   delimiter ;
 call whileProc();
 select*from guguTBL;
 
 drop procedure if exists errorProc;
 delimiter $$
 create procedure errorProc()
 begin
  declare i int; -- 1씩 증가하는 값
  declare hap int; -- 합계 (정수형), 오버플로우 발생시킬 예정 
  declare saveHap int; -- 합계 (정수형), 오버플로우 직전의 값을 저장 
  
  declare exit handler for 1264 -- int 형 오버플로우가 발생하면 이부분 수행 
  begin
   select concat('int 오버플로우 직전의 합계 -->', saveHap);
   select concat('1+2+3+4+ ...+', i,'오버플로우', saveHap);
   end;
   
   set i = 1; -- 1부터 증가
   set hap = 0; -- 합계를 누적 

 while(true)Do -- 무한 루프
 set saveHap = hap; -- 오버플로우 직전의 합계를 지정함 
 set hap = hap + i; -- 오버플로우가 나면 위의 begin end 문 수행 
 set i = i + 1;
 end while;
 end $$ 
 delimiter ;
 
 call errorProc();
 
 -- 현재 저장된 프로시저의 이름 및 내용 확인
 -- information_Schema 데이터베이스의 Routines 테이블을 조회하면
 -- 내용 확인 가능함
 select routine_name, routine_definition From  information_Schema.routines
 where routine_schema = 'testdb' and routine_type = 'PROCEDURE';
 
 call userProc1('성시경');
 call userProc1('이승기');
 
 -- 파라미터를 확인하려면 Information_Schema 데이터베이스의 Routines 테이블을 조회
 select parameter_mode, parameter_name, dtd_identifier
 from information_schema.parameters
 where specific_name = 'userProc3';
 
 -- 스토어드 프로시저의 내용 확인 방법
 show create PROCEDURE testdb.userProc3;
 
 set global log_bin_trust_function_creators=1;
 
 -- 2개의 숫자의 합계를 계산하는 스토어드 함수 
 drop function if exists userFunc;
 delimiter $$
 create function userFunc(value1 int, value2 int) 
 returns int 

 begin
   return value1+ value2;
   
 end $$
 delimiter ;
 
 select userFunc(100,200) ;
 
-- 출생연도를 입력하면 나이 출력되는 함수 작성 
drop function if exists getAgeFunc;
delimiter $$
create function getAgeFunc(bYear int)
 returns int
 begin
 declare age int;
 set age = year(curdate()) - bYear;
 return age;
 end $$ 
 delimiter ;
 
 select getAgeFunc(1987);
 
 select getAgeFunc(1987) into @age1987;
 select getAgeFunc(2000) into @age2000;
 
 select concat('1987년과 2000년의 나이차 ==> ' , (@age1987-@age2000)) as 나이차;
 
 select*from usertbl;
 select userID, name, getAgeFunc(birthYear) as 만나이 from usertbl;
 
 -- 커서를 이용해 고객의 평균키를 구하는 스토어드 프로시저 
 drop procedure if exists cursorProc;
 delimiter $$
 create procedure cursorProc()
 begin
   declare userHeight int; -- 고객의 키
   declare cnt int default 0; -- 고객의 인원 수 (= 읽은 행의 수)
   declare totalHeight int default 0; -- 키의 합계 
   
   declare endOfRow boolean Default False; -- 행의 끝 여부(기본 false)
   
   declare userCursor cursor for -- 커서 선언 
   select height from usertbl;
   
   declare continue handler  -- 투플데이터(행)의 끝이면 endOfRow 변수에 true 대입 
   for not found set endOfRow = true; 
   
   open userCursor; -- 커서 열기
   
   cursor_loop: LOOP
    fetch usercursor into userHeight; -- 고객 키 1개를 대입
    
    if endOfRow Then -- 더이상 읽을 행이 없으면 loop를 종료  
    leave cursor_loop;
    end if;
    
    set cnt = cnt + 1;
    set totalHeight = totalHeight + userHeight; 
    end loop cursor_loop;
    
    -- 고객 키의 평균을 출력함 
    select concat('고객 키의 평균 ==> ', (totalHeight/cnt)) as 평균;
    
    close userCursor; -- 커서 닫기 
    
    end $$
    delimiter ; 
  
  call cursorProc();
  
  desc usertbl;
  -- primary key 삭제 
  alter table usertbl drop primary key; 
  -- primary key 추가 
  alter table usertbl add primary key(userID);
  
  create table buytbl
  ( num int auto_increment not null primary key, -- 순번(PK) 
   userID char(8) not null, -- 아이디(FK) 
   prodName char(6) not null, -- 물품명 
   groupName char(4), -- 분류 
   price int not null, -- 단가 
   amount smallint not null, -- 수량 
   foreign key (userID) references usertbl(userID));
   
   insert into buytbl values(null,'kbs','운동화',null,30,2);
   insert into buytbl values(null, 'kbs','노트북','전사',1000,1);
   insert into buytbl values(null,'jyp','모니터','전자',200,1);
   insert into buytbl values(null,'kbs','청바지','의류',50,3);
   insert into buytbl values(null,'ssk','책','서적',15,5); 
   insert into buytbl values(null,'lsg','모니터','전자',200,5);
   insert into buytbl values(null,'kkh','운동화',null,30,2);
   
   select*from usertbl;
   select*from buytbl;
   
  select U.userid, sum(price*amount)
  from buytbl B right outer join usertbl U on B.userid = U.userid 
  group by U.userid, U.name;
  
  select*from usertbl;
  -- 구매총액 따라 회원등급 설정 
  Alter table usertbl ADD grade Varchar(5); -- 고객 등급 열 추가 

  drop procedure if exists gradeProc;
  delimiter $$ 
  create procedure gradeProc()
  begin 
   declare id varchar(10); -- 사용자 id를 저장할 변수 
   declare hap bigint; -- 총 구매액을 저장할 변수
   declare userGrade char(12); -- 고객 등급 변수 
   
   declare endOfRow boolean default false;
   
   declare userCuror cursor for -- 커서 선언 
   select U.userID, sum(price*amount) 
   from buytbl B right outer join usertbl U ON B.userID = U.userID
   group by U.userID, U.name; 
   
   declare continue handler for not found set endOfRow = TRUE; 
   
   open userCuror; -- 커서 열기
   grade_loop: loop 
    fetch userCuror into id, hap; -- 첫 행 값을 대입
    if endOfRow then 
    leave grade_loop; -- 마지막까지 읽었으면 grade_loop 탈출 
    end if; 
    
    case 
      when (hap >=1500) then set userGrade = '최우수고객';
      when (hap >=1000) then set userGrade = '우수고객'; 
      when (hap >= 1) then set userGrade = '일반고객';
      else set userGrade = '유령고객';
      end case; 
      
      update usertbl set grade = userGrade where userID = id; 
      end loop grade_loop; 
      
      close userCuror; -- 커서 닫기 
    
  end $$ 
  delimiter ;
  call gradeProc();
  select * from usertbl;
  
  