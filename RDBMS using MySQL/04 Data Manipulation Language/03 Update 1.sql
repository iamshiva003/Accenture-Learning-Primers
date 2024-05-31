-- Write a query to update the street as 'No.21,Abbey Road' and city as 'Denver' for the customer whose first name is 'Emma'.
-- (Hint: Data is case sensitive.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

UPDATE Customer_Master
SET
    Street = 'No.21,Abbey Road',
    City = 'Denver'
WHERE
    C_first_name = 'Emma';