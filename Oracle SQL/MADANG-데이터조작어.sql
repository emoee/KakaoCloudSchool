SELECT BOOKNAME, PRICE FROM BOOK;
SELECT PRICE, BOOKNAME FROM BOOK;
SELECT * FROM BOOK;

SELECT DISTINCT PUBLISHER FROM BOOK; -- 중복 제거 DISTINCT ?

 -- 문법적으로 where(조건)은 옵션이다. FROM까지만 필수!
SELECT * FROM BOOK WHERE PRICE < 20000;  -- WHERE은 TRUE 값을 만들어내는 조건이다. SELECT은 TRUE 값만 출력한다.
-- ?: SELECT은 출력명령이다. 따라서 FROM 먼저 실행해서 대상 지정하고, WHERE절의 조건을 적용해서 SELECT 출력한다.

-- WHERE 절에서 조건으로 사용 가능한 술어
-- 범위: BETWEEN 은 오라클에서 제공하는 명령이다. 왼쪽, 오른쪽 모두 포함한다. BETWEEN 100 AND 200은 100과 200 포함이다.
-- 집합: IN, NOT IN. IN의 경우 포함관계 조건중 하나면 TRUE면 된다. NOT IN은 조건이 모두 NOT이어야된다. 
-- 패턴: LIKE는 문자열을 대상으로 원하는 문자 찾고자할 때 사용한다. 문자열만 가능하다. 와일드문자(*,?)와 사용하면 좋다.
-- NULL
-- AND, OR은 이항 연산자다. 두개씩 비교한다. NOT

SELECT * FROM BOOK WHERE PRICE BETWEEN 10000 AND 20000;
SELECT * FROM BOOK WHERE PRICE >= 10000 AND PRICE <= 20000; -- BETWEEN은 AND를 사용할 수 있다.

SELECT * FROM BOOK WHERE PUBLISHER IN ('굿스포츠','대한미디어'); -- 둘중 하나만 TRUE면 출력된다.
SELECT * FROM BOOK WHERE PUBLISHER NOT IN ('굿스포츠', '대한미디어'); -- 둘다 아니어야 출력된다.

SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE BOOKNAME LIKE '%축구%'; 
-- %는 문자를 나타내는 것이다. 어딘가야 '축구'단어가 있으면 TRUE이다. %없이 축구만 입력하면 다른 문자없이 '축구'인 경우만 TRUE이다.
-- 와일드 문자: +, %, [], [^], _ 등등이 있다. LIKE와 함께 사용한다.
SELECT * FROM BOOK WHERE BOOKNAME LIKE '_구%'; -- 문자열 첫글자가 아무거나 가능하다. %는 위치 상관없지만 _ 위치가 상관있다. 두 번째 위치에 ‘구’가 들어가는 문자열이 검색된다.

SELECT * FROM BOOK ORDER BY BOOKNAME; -- ORDER BY는 출력 대상자의 순서를 변경한다.
