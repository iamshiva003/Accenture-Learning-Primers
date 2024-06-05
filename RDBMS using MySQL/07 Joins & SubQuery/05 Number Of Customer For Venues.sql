-- The manager likes to display all the names of venues that may or may not be enquired by any customer. Write a query to display the venue name and the number of customers in each venue. 
-- Give an alias name to the number of customers as 'No_Of_Customers'.
-- Sort the results based on the venue name in ascending order.
-- (Hint: Retrieve records from the Venue_Master and Enquiry_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    v.venue_name,
    COUNT(e.cust_id) AS No_Of_Customers
FROM
    Venue_Master v
    LEFT JOIN Enquiry_Master e ON e.venue_id = v.venue_id
GROUP BY
    v.venue_name
ORDER BY
    v.venue_name;