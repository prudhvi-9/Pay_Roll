mysql> insert into employee_payroll(Name,Salary,StartDate,Gender,PhoneNumber,Address,Department,BasicPay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values('Terissa',40000,'2020-07-10','Female',945456789,'Surya Colony','Sales and Marketing',37000,7000,3000,3000,36000);
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee_payroll;
+----+---------+-----------+------------+--------+-------------+----------------+---------------------+----------+------------+-------------+------------+---------+
| Id | Name    | Salary    | StartDate  | Gender | PhoneNumber | Address        | Department          | BasicPay | Deductions | Taxable_Pay | Income_Tax | Net_Pay |
+----+---------+-----------+------------+--------+-------------+----------------+---------------------+----------+------------+-------------+------------+---------+
|  1 | Ravi    | 30000.000 | 2020-03-10 | Male   |   897654567 | Hari colony    | IT                  |    25000 |       3000 |        1000 |       1000 |   24000 |
|  2 | Hari    | 50000.000 | 2020-01-10 | Male   |   897654987 | Krishna colony | Hr                  |    37000 |       7000 |        3000 |       3000 |   36000 |
|  4 | Pooja   | 56000.000 | 2020-06-10 | Female |   897654127 | Chandu colony  | IT                  |    45000 |       5000 |        3000 |       3000 |   44000 |
|  5 | Leela   | 40500.000 | 2020-05-11 | Female |   901654127 | Prasad colony  | Tester              |    35000 |       3000 |        1000 |       1500 |   35000 |
|  7 | Terissa | 40000.000 | 2020-07-10 | Female |   945456789 | Surya Colony   | Sales and Marketing |    37000 |       7000 |        3000 |       3000 |   36000 |
+----+---------+-----------+------------+--------+-------------+----------------+---------------------+----------+------------+-------------+------------+---------+
5 rows in set (0.00 sec)


mysql> insert into employee_payroll(Name,Salary,StartDate,Gender,PhoneNumber,Address,Department,BasicPay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values('Terissa',40000,'2020-07-10','Female',945456789,'Surya Colony','Sales and Marketing',37000,7000,3000,3000,36000);
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee_payroll;
+----+---------+-----------+------------+--------+-------------+----------------+---------------------+----------+------------+-------------+------------+---------+
| Id | Name    | Salary    | StartDate  | Gender | PhoneNumber | Address        | Department          | BasicPay | Deductions | Taxable_Pay | Income_Tax | Net_Pay |
+----+---------+-----------+------------+--------+-------------+----------------+---------------------+----------+------------+-------------+------------+---------+
|  1 | Ravi    | 30000.000 | 2020-03-10 | Male   |   897654567 | Hari colony    | IT                  |    25000 |       3000 |        1000 |       1000 |   24000 |
|  2 | Hari    | 50000.000 | 2020-01-10 | Male   |   897654987 | Krishna colony | Hr                  |    37000 |       7000 |        3000 |       3000 |   36000 |
|  4 | Pooja   | 56000.000 | 2020-06-10 | Female |   897654127 | Chandu colony  | IT                  |    45000 |       5000 |        3000 |       3000 |   44000 |
|  5 | Leela   | 40500.000 | 2020-05-11 | Female |   901654127 | Prasad colony  | Tester              |    35000 |       3000 |        1000 |       1500 |   35000 |
|  7 | Terissa | 40000.000 | 2020-07-10 | Female |   945456789 | Surya Colony   | Sales and Marketing |    37000 |       7000 |        3000 |       3000 |   36000 |
|  8 | Terissa | 40000.000 | 2020-07-10 | Female |   945456789 | Surya Colony   | Sales and Marketing |    37000 |       7000 |        3000 |       3000 |   36000 |
+----+---------+-----------+------------+--------+-------------+----------------+---------------------+----------+------------+-------------+------------+---------+
6 rows in set (0.00 sec)

mysql> select * from employee_payroll where Name='Terissa';
+----+---------+-----------+------------+--------+-------------+--------------+---------------------+----------+------------+-------------+------------+---------+
| Id | Name    | Salary    | StartDate  | Gender | PhoneNumber | Address      | Department          | BasicPay | Deductions | Taxable_Pay | Income_Tax | Net_Pay |
+----+---------+-----------+------------+--------+-------------+--------------+---------------------+----------+------------+-------------+------------+---------+
|  7 | Terissa | 40000.000 | 2020-07-10 | Female |   945456789 | Surya Colony | Sales and Marketing |    37000 |       7000 |        3000 |       3000 |   36000 |
|  8 | Terissa | 40000.000 | 2020-07-10 | Female |   945456789 | Surya Colony | Sales and Marketing |    37000 |       7000 |        3000 |       3000 |   36000 |
+----+---------+-----------+------------+--------+-------------+--------------+---------------------+----------+------------+-------------+------------+---------+
2 rows in set (0.00 sec)