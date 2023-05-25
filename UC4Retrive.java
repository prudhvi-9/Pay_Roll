mysql> insert into employee_payroll(Name,Salary,StartDate)values('Hari',50000,'2020-01-10'),('Sai',40000,'2020-02-11');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from employee_payroll;
+----+------+-----------+------------+
| Id | Name | Salary    | StartDate  |
+----+------+-----------+------------+
|  1 | Ravi | 30000.000 | 2020-03-10 |
|  2 | Hari | 50000.000 | 2020-01-10 |
|  3 | Sai  | 40000.000 | 2020-02-11 |
+----+------+-----------+------------+
3 rows in set (0.00 sec)