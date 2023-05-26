mysql> alter table employee_payroll add PhoneNumber int(11) after Gender;
Query OK, 0 rows affected, 1 warning (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 1

mysql> select * from employee_payroll;
+----+-------+-----------+------------+--------+-------------+
| Id | Name  | Salary    | StartDate  | Gender | PhoneNumber |
+----+-------+-----------+------------+--------+-------------+
|  1 | Ravi  | 30000.000 | 2020-03-10 | Male   |        NULL |
|  2 | Hari  | 50000.000 | 2020-01-10 | Male   |        NULL |
|  3 | Sai   | 40000.000 | 2020-02-11 | Male   |        NULL |
|  4 | Pooja | 56000.000 | 2020-06-10 | Female |        NULL |
|  5 | Leela | 40500.000 | 2020-05-11 | Female |        NULL |
+----+-------+-----------+------------+--------+-------------+
5 rows in set (0.00 sec)

mysql> alter table employee_payroll add Address varchar(50)  after PhoneNumber;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from employee_payroll;
+----+-------+-----------+------------+--------+-------------+---------+
| Id | Name  | Salary    | StartDate  | Gender | PhoneNumber | Address |
+----+-------+-----------+------------+--------+-------------+---------+
|  1 | Ravi  | 30000.000 | 2020-03-10 | Male   |        NULL | NULL    |
|  2 | Hari  | 50000.000 | 2020-01-10 | Male   |        NULL | NULL    |
|  3 | Sai   | 40000.000 | 2020-02-11 | Male   |        NULL | NULL    |
|  4 | Pooja | 56000.000 | 2020-06-10 | Female |        NULL | NULL    |
|  5 | Leela | 40500.000 | 2020-05-11 | Female |        NULL | NULL    |
+----+-------+-----------+------------+--------+-------------+---------+
5 rows in set (0.00 sec)

mysql> alter table employee_payroll
    -> alter Address SET DEFAULT 'address' ;
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from employee_payroll;
+----+-------+-----------+------------+--------+-------------+---------+
| Id | Name  | Salary    | StartDate  | Gender | PhoneNumber | Address |
+----+-------+-----------+------------+--------+-------------+---------+
|  1 | Ravi  | 30000.000 | 2020-03-10 | Male   |        NULL | NULL    |
|  2 | Hari  | 50000.000 | 2020-01-10 | Male   |        NULL | NULL    |
|  3 | Sai   | 40000.000 | 2020-02-11 | Male   |        NULL | NULL    |
|  4 | Pooja | 56000.000 | 2020-06-10 | Female |        NULL | NULL    |
|  5 | Leela | 40500.000 | 2020-05-11 | Female |        NULL | NULL    |
+----+-------+-----------+------------+--------+-------------+---------+
5 rows in set (0.00 sec)

mysql>  insert into employee_payroll(Name,Salary,StartDate,Gender,PhoneNumber,Address) values('Neeraj',70000,'2020-07-10','Male',945456789,'Surya Colony');
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee_payroll;
+----+--------+-----------+------------+--------+-------------+--------------+
| Id | Name   | Salary    | StartDate  | Gender | PhoneNumber | Address      |
+----+--------+-----------+------------+--------+-------------+--------------+
|  1 | Ravi   | 30000.000 | 2020-03-10 | Male   |        NULL | NULL
|
|  2 | Hari   | 50000.000 | 2020-01-10 | Male   |        NULL | NULL
|
|  3 | Sai    | 40000.000 | 2020-02-11 | Male   |        NULL | NULL
|
|  4 | Pooja  | 56000.000 | 2020-06-10 | Female |        NULL | NULL
|
|  5 | Leela  | 40500.000 | 2020-05-11 | Female |        NULL | NULL
|
|  6 | Neeraj | 70000.000 | 2020-07-10 | Male   |   945456789 | Surya Colony |
+----+--------+-----------+------------+--------+-------------+--------------+
6 rows in set (0.00 sec)

mysql> alter table employee_payroll add Department varchar(50) not Null  after Address;

mysql> select * from employee_payroll;
+----+--------+-----------+------------+--------+-------------+----------------+------------
|Id | Name   | Salary    | StartDate  | Gender | PhoneNumber | Address        |Department  |
+----+--------+-----------+------------+--------+-------------+----------------+------------+
|1 | Ravi   | 30000.000 | 2020-03-10 | Male   |   897654567 | Hari colony    |            |
|2 | Hari   | 50000.000 | 2020-01-10 | Male   |   897654987 | Krishna colony |            |
|3 | Sai    | 40000.000 | 2020-02-11 | Male   |   897234567 | Sri Colony     |            |
|4 | Pooja  | 56000.000 | 2020-06-10 | Female |   897654127 | Chandu colony  |            |
|5 | Leela  | 40500.000 | 2020-05-11 | Female |   901654127 | Prasad colony  |            |
|6 | Neeraj | 70000.000 | 2020-07-10 | Male   |   945456789 | Surya Colony   |            |
+----+--------+-----------+------------+--------+-------------+----------------+------------+
6 rows in set (0.00 sec)
