--OUTER JOIN
--QEUI JOIN�� ��µ��� �ʴ� ������ �� �� �ִ�.
--EQUI JOIN�� ���ʿ� �� �����ϴ� �����͸� ��µȴ�.
--RIGHT OUTER JOIN�� �����ʿ� �����ϴ� �����͸� ��� ����Ѵ�. (+) ��ȣ�� ������ �ʿ�
SELECT E.ename, D.loc
FROM emp E, dept D
WHERE E.deptno(+) = D.deptno;

--SELF JOIN
SELECT e.ename as ���, e.job as ����, m.ename as ������, m.job as ����
FROM emp e, emp m
WHERE e.mgr = m.empno and e.job = 'SALESMAN';
/
--ON�� ����
SELECT e.ename as �̸�, e.job as ����, e.sal as ����, d.loc as �μ���ġ
FROM emp e JOIN dept d
ON e.deptno = d.deptno
where e.job = 'SALESMAN';


