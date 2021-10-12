USE test_database;

CREATE TABLE salesman(
	salesman_id INT PRIMARY KEY,
	name NVARCHAR(40) NOT NULL,
	city NVARCHAR(20),
	commission FLOAT(1) NOT NULL
);

CREATE TABLE customer(
	customer_id INT PRIMARY KEY,
	cust_name NVARCHAR(40) NOT NULL,
	city NVARCHAR(20),
	grade INT,
	salesman_id INT, 
	FOREIGN KEY (salesman_id)  REFERENCES salesman (salesman_id)
);