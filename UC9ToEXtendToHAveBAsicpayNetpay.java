mysql> alter table employee_payroll add Deductions int(50)  after BasicPay;
Query OK, 0 rows affected, 1 warning (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 1

mysql> alter table employee_payroll add Taxable_Pay int(50)  after Deductions;
Query OK, 0 rows affected, 1 warning (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 1

mysql> alter table employee_payroll add Income_Tax int(50)  after Taxable_Pay;
Query OK, 0 rows affected, 1 warning (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 1

mysql> alter table employee_payroll add Net_Pay int(50)  after Income_Tax;
Query OK, 0 rows affected, 1 warning (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 1

mysql> select * from employee_payroll;
+----+--------+-----------+------------+--------+-------------+----------------+----------+------------+-------------+------------+---------+
| Id | Name   | Salary    | StartDate  | Gender | PhoneNumber | Address        | BasicPay | Deductions | Taxable_Pay | Income_Tax | Net_Pay |
+----+--------+-----------+------------+--------+-------------+----------------+----------+------------+-------------+------------+---------+
|  1 | Ravi   | 30000.000 | 2020-03-10 | Male   |   897654567 | Hari colony    |     NULL |       NULL |        NULL |       NULL |    NULL |
|  2 | Hari   | 50000.000 | 2020-01-10 | Male   |   897654987 | Krishna colony |     NULL |       NULL |        NULL |       NULL |    NULL |
|  3 | Sai    | 40000.000 | 2020-02-11 | Male   |   897234567 | Sri Colony     |     NULL |       NULL |        NULL |       NULL |    NULL |
|  4 | Pooja  | 56000.000 | 2020-06-10 | Female |   897654127 | Chandu colony  |     NULL |       NULL |        NULL |       NULL |    NULL |
|  5 | Leela  | 40500.000 | 2020-05-11 | Female |   901654127 | Prasad colony  |     NULL |       NULL |        NULL |       NULL |    NULL |
|  6 | Neeraj | 70000.000 | 2020-07-10 | Male   |   945456789 | Surya Colony   |     NULL |       NULL |        NULL |       NULL |    NULL |
+----+--------+-----------+------------+--------+-------------+----------------+----------+------------+-------------+------------+---------+
6 rows in set (0.00 sec)