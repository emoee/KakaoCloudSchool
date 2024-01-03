SELECT
    TABLE_NAME,
    INDEX_NAME,
    COLUMN_NAME
FROM ALL_IND_COLUMNS
WHERE TABLE_NAME = 'EMP';

CREATE TABLE members (
    member_id NUMBER,
    first_name VARCHAR2(100) NOT NULL,
    last_name VARCHAR2(100) NOT NULL,
    gender CHAR(1) NOT NULL,
    email VARCHAR2(225) NOT NULL,
    dob DATE,
    PRIMARY KEY(member_id)
);

-- 주석 해제 후 실행
-- @C:\Users\user\Downloads\member_data_1000\member_data_1000.sql

--기본검색 테스트
--last_name이 'Harse'인지 1000번 조회
SELECT * FROM members
WHERE last_name = 'Harse';

-- 인덱스를 특정 열에 만들기
CREATE INDEX members_last_name_i
ON members(last_name);

--인덱스확인
SELECT
    TABLE_NAME,
    INDEX_NAME,
    COLUMN_NAME
FROM ALL_IND_COLUMNS
WHERE TABLE_NAME = 'MEMBERS'; --테이블명은 대문자!

DROP INDEX members_last_name_i;