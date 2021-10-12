USE test_database;

SELECT name, cust_name, customer.city
    FROM salesman, customer WHERE salesman.city = customer.city;
 