-- Write a query to display the enquiry id, customer id , venue id, month name of event starting date with the alias name as month_name, and the number of days the event has been enquired about the venue with the alias name as no_of_days for the enquiries made in the month of December.
-- Sort the records based on the no_of_days in descending order.    
-- (Hint: Retrieve records from the Enquiry_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    enquiry_id,
    cust_id,
    venue_id,
    DATE_FORMAT (start_date, '%M') AS month_name,
    DATEDIFF (end_date, start_date) + 1 AS no_of_days
FROM
    Enquiry_Master
WHERE
    MONTH (start_date) = 12
ORDER BY
    no_of_days DESC;