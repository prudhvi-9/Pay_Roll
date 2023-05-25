mysql> create table employee_payroll(Id INT AUTO_INCREMENT PRIMARY KEY,Name varchar(20),Salary DECIMAL(10,3),StartDate DATE);
Query OK, 0 rows affected (0.11 sec)

mysql> show tables;
+---------------------------+
| Tables_in_payroll_service |
+---------------------------+
| employee_payroll          |
+---------------------------+
1 row in set (0.02 sec)

mysql> desc employee_payroll;
+-----------+---------------+------+-----+---------+----------------+
| Field     | Type          | Null | Key | Default | Extra          |
+-----------+---------------+------+-----+---------+----------------+
| Id        | int           | NO   | PRI | NULL    | auto_increment |
| Name      | varchar(20)   | YES  |     | NULL    |                |
| Salary    | decimal(10,3) | YES  |     | NULL    |                |
| StartDate | date          | YES  |     | NULL    |                |
+-----------+---------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)