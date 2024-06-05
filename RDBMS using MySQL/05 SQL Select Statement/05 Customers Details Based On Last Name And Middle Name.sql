-- Write a query to display the first name, phone number and gender of all the customers whose last name or middle name is not available. 
-- Sort the results based on the phone number in ascending order.
-- (Hint:  Retrieve records from the Customer_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    C_first_name,
    Phoneno,
    Gender
FROM
    Customer_Master
WHERE
    C_last_name IS NULL
    OR C_middle_name IS NULL
ORDER BY
    Phoneno;