mysql> insert into employee_payroll(Name,Salary,StartDate)values('Ravi',30000,'2020-03-10');
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee_payroll;
+----+------+-----------+------------+
| Id | Name | Salary    | StartDate  |
+----+------+-----------+------------+
|  1 | Ravi | 30000.000 | 2020-03-10 |
+----+------+-----------+------------+
1 row in set (0.00 sec)