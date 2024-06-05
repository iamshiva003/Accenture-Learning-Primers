-- Write a query to display the customer's first name and the position of 'm' in the first name of all the customers who are from 'Los Angeles' or 'Boston'. Give an alias name as 'position' for the position of 'm' in their first name. 
-- Sort the results based on the position in descending order and the first name in ascending order.
-- (Hint: Data is case sensitive. Retrieve records from the Customer_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)
-- Sample Data:
-- C_FIRST_NAME    CITY
-- Peter                        Boston
-- Cummins                Los Angeles
-- Liam                        Chicago
-- Russell                    New York
-- Adam                      Boston
-- Sample Output:
-- C_FIRST_NAME        position
-- Adam                         4
-- Cummins                   3
-- Peter                           0


SELECT
    c_first_name,
    LOCATE ('m', c_first_name) AS position
FROM
    Customer_Master
WHERE
    city IN ('Los Angeles', 'Boston')
ORDER BY
    position DESC,
    c_first_name ASC;