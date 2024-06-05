-- Create view as Boston_Customers which includes all the 'Boston' Customers details. 
-- (Note: Use ';' to terminate your query before compilation and evaluation.) 

CREATE VIEW
    Boston_Customers AS
SELECT
    *
FROM
    Customer_Master
WHERE
    city = 'Boston';