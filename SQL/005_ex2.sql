USE test_database;

SELECT customer.cust_name, customer.city, salesman.name, salesman.commission
    FROM salesman JOIN customer
    ON customer.salesman_id = salesman.salesman_id AND salesman.commission > 0.12;