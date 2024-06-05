-- The event manager wants to find the customer's enquiries for events that start and end at weekends in the venues. Write a query to display the enquiry id and customer id of all enquiries.
-- Sort the results based on the customer id in ascending order.
-- (Hint: Retrieve records from the Enquiry_Master. Weekends are 'Saturday' and 'Sunday'.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    enquiry_id,
    cust_id
FROM
    Enquiry_Master
WHERE
    DAYOFWEEK (start_date) IN (1, 7)
    AND DAYOFWEEK (end_date) IN (1, 7)
ORDER BY
    cust_id;