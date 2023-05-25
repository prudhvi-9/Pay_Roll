+----+------+-----------+------------+
| Id | Name | Salary    | StartDate  |
+----+------+-----------+------------+
|  1 | Ravi | 30000.000 | 2020-03-10 |
|  2 | Hari | 50000.000 | 2020-01-10 |
|  3 | Sai  | 40000.000 | 2020-02-11 |
+----+------+-----------+------------+
3 rows in set (0.00 sec)


mysql> select startdate from employee_payroll where STARTDATE between CAST('2020-01-10' as DATE) and DATE(NOW());
+------------+
| startdate  |
+------------+
| 2020-03-10 |
| 2020-01-10 |
| 2020-02-11 |
+------------+
3 rows in set (0.01 sec)