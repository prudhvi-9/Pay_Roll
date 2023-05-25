mysql> alter table employee_payroll
    -> ADD Gender varchar(20);
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from employee_payroll;
+----+------+-----------+------------+--------+
| Id | Name | Salary    | StartDate  | Gender |
+----+------+-----------+------------+--------+
|  1 | Ravi | 30000.000 | 2020-03-10 | NULL   |
|  2 | Hari | 50000.000 | 2020-01-10 | NULL   |
|  3 | Sai  | 40000.000 | 2020-02-11 | NULL   |
+----+------+-----------+------------+--------+
3 rows in set (0.00 sec)

mysql> Update employee_payroll set Gender ='Male' where name='Hari';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employee_payroll;
+----+------+-----------+------------+--------+
| Id | Name | Salary    | StartDate  | Gender |
+----+------+-----------+------------+--------+
|  1 | Ravi | 30000.000 | 2020-03-10 | NULL   |
|  2 | Hari | 50000.000 | 2020-01-10 | Male   |
|  3 | Sai  | 40000.000 | 2020-02-11 | NULL   |
+----+------+-----------+------------+--------+
3 rows in set (0.00 sec)



mysql> Update employee_payroll set Gender ='Male' where name='Sai' or name='Ravi';
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select * from employee_payroll;
+----+------+-----------+------------+--------+
| Id | Name | Salary    | StartDate  | Gender |
+----+------+-----------+------------+--------+
|  1 | Ravi | 30000.000 | 2020-03-10 | Male   |
|  2 | Hari | 50000.000 | 2020-01-10 | Male   |
|  3 | Sai  | 40000.000 | 2020-02-11 | Male   |
+----+------+-----------+------------+--------+
3 rows in set (0.00 sec)