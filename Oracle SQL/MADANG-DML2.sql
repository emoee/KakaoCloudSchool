-- ORDER BY
SELECT * FROM BOOK ORDER BY PRICE DESC, PUBLISHER ASC; -- �⺻�� ��������(���� ����)�̴�. DESC ��������, ASE ��������
-- ���⼭�� ������ �������� ���������� �ϰ��� ���ǻ� �������� ���������Ѵ�. 

-- ���� �Լ� : ǥ�� SQL���� �Լ��� ���õ� ���(����� ���� X)�� ����. ��, ���� �Լ�(�̹� ������� �Լ�=�����Լ�)�� �����ȴ�. SELECT �� �ڿ��� ��� �����ϴ�.
-- ���� �Լ��� ��Į�� ���·� �����ȴ�. ������ ���� ���� �޾Ƽ� �ϳ���, ���� ��°��� �����Ѵ�.
SELECT SUM(SALEPRICE) FROM ORDERS;
SELECT SUM(SALEPRICE) AS �Ѹ��� FROM ORDERS; -- AS Ű���带 ����� �� �̸��� �ο��� �� �ִ�. ���⸦ ����Ѵٸ� ""�� ����Ѵ�.

SELECT SUM(SALEPRICE) AS �Ѹ���, BOOKID FROM ORDERS;  
-- �����Լ��� 0����, ��Į�� ���� ���̰�, BOOKID �� 1�����̱� ������ ������ ����. ������ ���� �ʾƼ� ������ �� ���̴�. ���� �޼���: ORA-00937: not a single-group group function
SELECT SUM(SALEPRICE) AS TOTAL, AVG(SALEPRICE) AS AVERAGE, MIN(SALEPRICE) AS MINIMUM, MAX(SALEPRICE) AS MAXIMUM FROM ORDERS; -- �����Լ������� ������ �±� ������ ������ ������ �ʴ´�.
 
 SELECT CUSTID, COUNT(*) AS ��������, SUM(SALEPRICE) AS �Ѿ� FROM ORDERS GROUP BY CUSTID; 
 -- CUSTID�� �������� ������� ���;��ϱ⶧���� SELECT���� �� �տ� ������Ѵ�.
 
 SELECT CUSTID, COUNT(*) AS �������� FROM ORDERS WHERE SALEPRICE >= 8000 GROUP BY CUSTID HAVING COUNT(*) >=2; -- GROUP BY�� ������ �ʿ��ϴٸ� HAVING�� ���� �ȴ�. HAVING���� �����Լ��� ����� �˻������� �����ϸ� �ȴ�.
