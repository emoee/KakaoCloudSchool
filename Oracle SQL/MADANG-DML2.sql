-- ORDER BY
SELECT * FROM BOOK ORDER BY PRICE DESC, PUBLISHER ASC; -- 기본은 오름차순(생략 가능)이다. DESC 내림차순, ASE 오름차순
-- 여기서는 가격을 기준으로 내림차순을 하고나서 출판사 기준으로 오름차순한다. 

-- 집계 함수 : 표준 SQL에는 함수에 관련된 기능(사용자 정의 X)은 없다. 단, 내장 함수(이미 만들어진 함수=집계함수)는 제공된다. SELECT 절 뒤에만 사용 가능하다.
-- 집계 함수는 스칼라 형태로 제공된다. 여러개 행의 값을 받아서 하나의, 단일 출력값을 생성한다.
SELECT SUM(SALEPRICE) FROM ORDERS;
SELECT SUM(SALEPRICE) AS 총매출 FROM ORDERS; -- AS 키워드를 사용해 열 이름을 부여할 수 있다. 띄어쓰기를 사용한다면 ""를 사용한다.

SELECT SUM(SALEPRICE) AS 총매출, BOOKID FROM ORDERS;  
-- 집계함수는 0차원, 스칼라 단일 값이고, BOOKID 는 1차원이기 때문에 오류가 난다. 구조가 맞지 않아서 오류가 난 것이다. 오류 메세지: ORA-00937: not a single-group group function
SELECT SUM(SALEPRICE) AS TOTAL, AVG(SALEPRICE) AS AVERAGE, MIN(SALEPRICE) AS MINIMUM, MAX(SALEPRICE) AS MAXIMUM FROM ORDERS; -- 집계함수끼리는 구조가 맞기 때문에 오류가 생기지 않는다.
 
 SELECT CUSTID, COUNT(*) AS 도서수량, SUM(SALEPRICE) AS 총액 FROM ORDERS GROUP BY CUSTID; 
 -- CUSTID를 기준으로 결과값이 나와야하기때문에 SELECT문에 맨 앞에 적어야한다.
 
 SELECT CUSTID, COUNT(*) AS 도서수량 FROM ORDERS WHERE SALEPRICE >= 8000 GROUP BY CUSTID HAVING COUNT(*) >=2; -- GROUP BY의 조건이 필요하다면 HAVING을 쓰면 된다. HAVING에는 집계함수를 사용해 검색조건을 설정하면 된다.
