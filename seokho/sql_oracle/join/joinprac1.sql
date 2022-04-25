select e.ename �̸�, e.job ����, e.sal ����, d.loc �μ���ġ
from emp e JOIN dept d
on e.deptno = d.deptno
where e.job= 'SALESMAN';

--ANSI ���� 9i���� ���� ����
SELECT e.ename, d.loc
from emp e JOIN dept d
on e.deptno = d.deptno;
-- ���� ���̺� ���� ANSI
SELECT e.ename, d.loc, s.grade
FROM emp e 
JOIN dept d ON e.deptno = d.deptno
JOIN salgrade s ON e.sal between s.losal and s.hisal;

--���� ���̺��� �����͸� ����(USING)
--WHERE�� ��� USING���� ����ؼ� ����
-- USING���� �ݵ�� ��ȣ ����ؾ���!
SELECT e.ename, e.job, e.sal, d.loc
FROM emp e JOIN dept d
USING (deptno)
WHERE e.job = 'SALESMAN';
--���� ���̺� ���� (USING)
SELECT e.ename, d.loc, s.grade
FROM emp e
JOIN dept d USING (deptno)
JOIN salgrade s ON e.sal between s.losal and s.hisal;
    
-- ���� ������ ���� �ʴ� NATURAL JOIN
-- �����̺� �����ϴ� ���� �÷��� ���� �Ͻ������� ������ �����Ѵ�.
-- �������� ��� �� �� ������� �Ǵ� �÷��� ��Ī�� �ָ� �ȵȴ�. 
SELECT e.ename, e.job, e.sal, d.loc
FROM emp e natural join dept d
where e.job = 'SALESMAN';

-- RIGHT OUTER JOIN ������ ������ ����(ANSI)
SELECT e.ename, e.job, e.sal, d.loc
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;
-- RIGHT OUTER JOIN (����Ŭ)
SELECT e.ename, d.loc
FROM emp e, dept d
WHERE e.deptno (+) = d.deptno;

--RIGHT OUTER JOIN (USING)
SELECT e.ename, d.loc
FROM emp e RIGHT OUTER JOIN dept d
USING (deptno);

--FULL OUTER JOIN (ANSI)
SELECT e.ename, e.job, e.sal, d.loc
FROM emp e FULL OUTER JOIN dept d
ON (e.deptno = d.deptno);

--FULL OUTER JOIN (����Ŭ�� �Ұ���)
SELECT e.ename, d.loc
FROM emp e, dept d
WHERE e.deptno (+) = d.deptno (+);

--FULL OUTER JOIN (UNION)
SELECT e.ename, e.job, e.sal, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON (e.deptno = d.deptno)
UNION
SELECT e.ename, e.job, e.sal, d.loc
FROM emp e RIGHT OUTER JOIN dept d
ON (e.deptno = d.deptno);

--UNION ALL ���� ��������� ���Ʒ��� �ϳ��� ����ϴ� ���
-- TO_NUMBER: deptno�� ���� Ÿ���̱� ������ �����ϰ� ����
-- ���� ������ �ۼ��� ���ǻ���
-- UNION ALL ���� ������ �Ʒ��� ������ �÷���, ������Ÿ���� �����ؾ���.
-- ����� ��µǴ� �÷����� ���� ������ �÷������� ��µ˴ϴ�.
-- ORDER BY���� ���� �Ʒ��� ����
SELECT deptno, sum(sal)
FROM emp
GROUP BY deptno
UNION ALL
SELECT TO_NUMBER(null) , sum(sal)
FROM emp;

