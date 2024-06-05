-- Write a query to count the number of enquiries made by each customer, if and only if the count is more than 1. Give an alias name to the number of enquiries as ENQUIRY_COUNT. 
-- Sort the records based on the count in descending order.
-- (Hint: Retrieve records from the Enquiry_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    COUNT(enquiry_id) AS ENQUIRY_COUNT
FROM
    Enquiry_Master
GROUP BY
    cust_id
HAVING
    COUNT(enquiry_id) > 1
ORDER BY
    ENQUIRY_COUNT DESC;