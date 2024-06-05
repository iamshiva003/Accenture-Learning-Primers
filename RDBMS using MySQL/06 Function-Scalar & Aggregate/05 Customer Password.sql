-- Write a query to display the first name and password of all the customers with 'gmail' accounts. The password must contain the first three characters of the customer's first name, followed by the 5th and 6th digits of the customer's phone number. Give an alias name to the customer's first name as 'user_name' and the customer's password as 'password'.
-- Sort the results based on the user_name in ascending order.
-- (Hint: Retrieve records from Customer_Master. Data is case sensitive.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    c_first_name AS user_name,
    CONCAT (
        SUBSTRING(c_first_name, 1, 3),
        SUBSTRING(phoneno, 5, 2)
    ) AS password
FROM
    Customer_Master
WHERE
    email LIKE '%gmail.com'
ORDER BY
    user_name;