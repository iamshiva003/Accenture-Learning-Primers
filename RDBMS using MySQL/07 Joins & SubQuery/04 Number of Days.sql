-- Write a query to display the customer id, booking id and number of days booked for an event by the customers. Give an alias name to number of days as  'Days'. Sort the results based on the customer id in descending order.
-- if and only if the number of days booked is more than 3 days.
-- Refer this example for calculating Days: 
--   cust_id  Start_Date     End_Date     Days
--   101      2017-04-06    2017-04-06        1
--   102      2019-05-06    2019-05-08        3
-- (Hint:  Retrieve records from the Enquiry_Master and Booking_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    e.cust_id,
    b.booking_id,
    DATEDIFF (e.end_date, e.start_date) + 1 AS Days
FROM
    Enquiry_Master e
    JOIN Booking_Master b ON e.enquiry_id = b.enquiry_id
WHERE
    DATEDIFF (e.end_date, e.start_date) + 1 > 3
ORDER BY
    e.cust_id DESC;