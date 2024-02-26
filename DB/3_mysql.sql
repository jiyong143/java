# 계정 생성시 비밀번호는 생략될 수 있지만, 보안을 위해서 비번을 설정해야 함
# 계정 생성  권한이 있는 사용자만 계정을 추가할 수 있다 
create user 'qwe' @localhost identified by 'qwe';
# qwe 계정으로 접속해서 계정을 추가 시도하면 
# create user 권한을 부여하면 계정을 생성할 수 있다. 
grant create user on *.* to 'qwe' @ localhost;
select* from mysql.user;
flush privileges;

# % 가 들어간 문자열을 검색할 때 %와 같이 기능이 있는 문자는 앞에 \를 추가해서 작성 
select * from 테이블명 where 속성 like '%\%%%';

# and와 or 연산자 중에서 우선순위가 and가 높다. 그래서 or 연산자를 먼저하려면 () 를 반드시 붙여야 함 
# 속성값이 null이 아닌 경우만 조회하는 쿼리 
select * from 테이블명 where 속성 is not null;

# 조건에 집계함수 결과를 이용하려면 having절에 조건을 추가해야 함 

select 테이블명.*, count(속성명2) as 개수 from 테이블명 
group by 속성명 
having 개수 >=5;

# row_number() over(order by 속성) : 검색 결과에 순서를 부여 

# row_number() 검색 결과를 이용하여 조건을 작업하려면 서브쿼리를 이용해야 한다 

select  * from 
(select 속성들 , row_number() over(order by 속성 ) as 순서 from 테이블명) as t
where 순서 > 3;

select * from A JOIN B USING(a);

SELECT row_number() over (ORDER BY SAL DESC) as ROWNUM, EMPNAME, SAL 
FROM EMP
WHERE ROWNUM <=3
ORDER BY SAL DESC;





