-- Write a query to display the enquiry id, customer id and event start date for all enquires made after the year 2015 . Give an alias name as 'Event_Date' for the event start date. 
-- Sort the results based on the Event_Date in ascending order and the customer id in ascending order.
-- The Event_Date should be in the following format.
-- Eg: MonthName,Year
--       April,2016
-- (Hint: Retrieve records from the Enquiry_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)
-- Sample Output:
-- enquiry_id	cust_id	Event_date
-- EN1001	       C015	April,2017
-- EN1002	        C001	April,2018

SELECT
    enquiry_id,
    cust_id,
    DATE_FORMAT (start_date, '%M,%Y') AS Event_Date
FROM
    Enquiry_Master
WHERE
    YEAR (start_date) > 2015
ORDER BY
    Event_Date ASC,
    cust_id ASC;