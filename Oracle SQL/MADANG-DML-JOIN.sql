-- JOIN 
-- ���� �����̴�. �ΰ��� ���̺��� �ջ��ϴ� ���̴�. 
SELECT * FROM CUSTOMER, ORDERS; -- ��� Ʃ���� ������ �����ش�. ���� 5��, �ֹ��� 10���̸� 50���� ���� ��µȴ�. 
-- �������� ���Ἲ�� �������� ���ϱ� ������ JOIN ������ ���� �����Ѵ�.
-- ������ �ۼ����������� �ܼ��� īƼ�� ���δ�Ʈ (cartesian product)�� ����ȴ�.

SELECT * FROM CUSTOMER, ORDERS 
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID 
ORDER BY CUSTOMER.CUSTID; -- ���� �⺻Ű�� �ܷ�Ű�� ������ �ۼ��Ѵ�.

SELECT NAME, SALEPRICE 
FROM CUSTOMER, ORDERS 
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID 
ORDER BY CUSTOMER.CUSTID;

SELECT NAME, SUM(SALEPRICE) 
FROM CUSTOMER, ORDERS 
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID 
GROUP BY CUSTOMER.NAME -- GROUP BY�� �ۼ��ϸ� SELECT���� �ش� ���� �����Լ��� �ۼ��� �� �ִ�.
ORDER BY CUSTOMER.NAME;

SELECT CUSTOMER.NAME, BOOK.BOOKNAME
FROM CUSTOMER, BOOK, ORDERS
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID
    AND ORDERS.BOOKID = BOOK.BOOKID;

SELECT CUSTOMER.NAME, BOOK.BOOKNAME
FROM CUSTOMER, ORDERS, BOOK
WHERE CUSTOMER.CUSTID = ORDERS.CUSTID
    AND ORDERS.BOOKID = BOOK.BOOKID
    AND BOOK.PRICE = 20000;

-- �ܺ� ����: ���ʿ� �����Ͱ� �ְ�, ���ʿ� �����Ͱ� ���� ���, �ִ� ���� �������� ������ ��� ����ϴ� ���̴�. ���ǿ� �ȸ¾Ƶ� ����� �� �ִ�.
SELECT CUSTOMER.NAME, SALEPRICE
FROM CUSTOMER LEFT OUTER JOIN ORDERS -- ����� �Ǵ� ���̺� �� �ۼ�
    ON CUSTOMER.CUSTID = ORDERS.CUSTID; -- ON �ڿ� ���� ���� ���.
