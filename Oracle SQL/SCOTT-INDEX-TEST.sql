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

-- �ּ� ���� �� ����
-- @C:\Users\user\Downloads\member_data_1000\member_data_1000.sql

--�⺻�˻� �׽�Ʈ
--last_name�� 'Harse'���� 1000�� ��ȸ
SELECT * FROM members
WHERE last_name = 'Harse';

-- �ε����� Ư�� ���� �����
CREATE INDEX members_last_name_i
ON members(last_name);

--�ε���Ȯ��
SELECT
    TABLE_NAME,
    INDEX_NAME,
    COLUMN_NAME
FROM ALL_IND_COLUMNS
WHERE TABLE_NAME = 'MEMBERS'; --���̺���� �빮��!

DROP INDEX members_last_name_i;