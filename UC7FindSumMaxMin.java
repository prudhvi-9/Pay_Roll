mysql> select * from employee_payroll;
+----+-------+-----------+------------+--------+
| Id | Name  | Salary    | StartDate  | Gender |
+----+-------+-----------+------------+--------+
|  1 | Ravi  | 30000.000 | 2020-03-10 | Male   |
|  2 | Hari  | 50000.000 | 2020-01-10 | Male   |
|  3 | Sai   | 40000.000 | 2020-02-11 | Male   |
|  4 | Pooja | 56000.000 | 2020-06-10 | Female |
|  5 | Leela | 40500.000 | 2020-05-11 | Female |
+----+-------+-----------+------------+--------+
5 rows in set (0.00 sec)

mysql> select SUM(Salary) from employee_payroll where Gender ='Female' GROUP by Gender;
+-------------+
| SUM(Salary) |
+-------------+
|   96500.000 |
+-------------+
1 row in set (0.01 sec)

mysql> select AVG(Salary) from employee_payroll where Gender ='Male' GROUP by Gender;
+---------------+
| AVG(Salary)   |
+---------------+
| 40000.0000000 |
+---------------+
1 row in set (0.00 sec)

mysql> select count from employee_payroll ;
ERROR 1054 (42S22): Unknown column 'count' in 'field list'
mysql> select count(*) from employee_payroll;
+----------+
| count(*) |
+----------+
|        5 |
+----------+
1 row in set (0.01 sec)

mysql> select count(Salary) from employee_payroll;
+---------------+
| count(Salary) |
+---------------+
|             5 |
+---------------+
1 row in set (0.00 sec)

mysql> select min(Salary) from employee_payroll;
+-------------+
| min(Salary) |
+-------------+
|   30000.000 |
+-------------+
1 row in set (0.01 sec)

mysql> select max(Salary) from employee_payroll;
+-------------+
| max(Salary) |
+-------------+
|   56000.000 |
+-------------+
1 row in set (0.00 sec)

mysql> select MIN(Salary) from employee_payroll where Gender ='Male' GROUP by Gender;
+-------------+
| MIN(Salary) |
+-------------+
|   30000.000 |
+-------------+
1 row in set (0.00 sec)

mysql> select Max(Salary) from employee_payroll where Gender ='Male' GROUP by Gender;
+-------------+
| Max(Salary) |
+-------------+
|   50000.000 |
+-------------+
1 row in set (0.00 sec)

mysql> select Count(Salary) from employee_payroll where Gender ='Male' GROUP by Gender;
+---------------+
| Count(Salary) |
+---------------+
|             3 |
+---------------+
1 row in set (0.00 sec)