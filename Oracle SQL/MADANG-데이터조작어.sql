SELECT BOOKNAME, PRICE FROM BOOK;
SELECT PRICE, BOOKNAME FROM BOOK;
SELECT * FROM BOOK;

SELECT DISTINCT PUBLISHER FROM BOOK; -- �ߺ� ���� DISTINCT ?

 -- ���������� where(����)�� �ɼ��̴�. FROM������ �ʼ�!
SELECT * FROM BOOK WHERE PRICE < 20000;  -- WHERE�� TRUE ���� ������ �����̴�. SELECT�� TRUE ���� ����Ѵ�.
-- ?: SELECT�� ��¸���̴�. ���� FROM ���� �����ؼ� ��� �����ϰ�, WHERE���� ������ �����ؼ� SELECT ����Ѵ�.

-- WHERE ������ �������� ��� ������ ����
-- ����: BETWEEN �� ����Ŭ���� �����ϴ� ����̴�. ����, ������ ��� �����Ѵ�. BETWEEN 100 AND 200�� 100�� 200 �����̴�.
-- ����: IN, NOT IN. IN�� ��� ���԰��� ������ �ϳ��� TRUE�� �ȴ�. NOT IN�� ������ ��� NOT�̾�ߵȴ�. 
-- ����: LIKE�� ���ڿ��� ������� ���ϴ� ���� ã������ �� ����Ѵ�. ���ڿ��� �����ϴ�. ���ϵ幮��(*,?)�� ����ϸ� ����.
-- NULL
-- AND, OR�� ���� �����ڴ�. �ΰ��� ���Ѵ�. NOT

SELECT * FROM BOOK WHERE PRICE BETWEEN 10000 AND 20000;
SELECT * FROM BOOK WHERE PRICE >= 10000 AND PRICE <= 20000; -- BETWEEN�� AND�� ����� �� �ִ�.

SELECT * FROM BOOK WHERE PUBLISHER IN ('�½�����','���ѹ̵��'); -- ���� �ϳ��� TRUE�� ��µȴ�.
SELECT * FROM BOOK WHERE PUBLISHER NOT IN ('�½�����', '���ѹ̵��'); -- �Ѵ� �ƴϾ�� ��µȴ�.

SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE BOOKNAME LIKE '%�౸%'; 
-- %�� ���ڸ� ��Ÿ���� ���̴�. ��򰡾� '�౸'�ܾ ������ TRUE�̴�. %���� �౸�� �Է��ϸ� �ٸ� ���ھ��� '�౸'�� ��츸 TRUE�̴�.
-- ���ϵ� ����: +, %, [], [^], _ ����� �ִ�. LIKE�� �Բ� ����Ѵ�.
SELECT * FROM BOOK WHERE BOOKNAME LIKE '_��%'; -- ���ڿ� ù���ڰ� �ƹ��ų� �����ϴ�. %�� ��ġ ��������� _ ��ġ�� ����ִ�. �� ��° ��ġ�� �������� ���� ���ڿ��� �˻��ȴ�.

SELECT * FROM BOOK ORDER BY BOOKNAME; -- ORDER BY�� ��� ������� ������ �����Ѵ�.
