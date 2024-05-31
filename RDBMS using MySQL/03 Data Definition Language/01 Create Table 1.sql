-- Refer to the below schema and write a query to create the Customer_Master table with the constraints mentioned.

CREATE TABLE Customer_Master (
    Cust_Id varchar(10) PRIMARY KEY,
    C_first_name varchar(30),
    C_middle_name varchar(30),
    C_last_name varchar(30),
    Gender varchar(10),
    Street varchar(30),
    City varchar(30),
    Phoneno varchar(20),
    Email varchar(30)
);