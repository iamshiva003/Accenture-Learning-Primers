-- Write a query that displays the customer id, first name, city, and phone number of customers who have not enquired about any venues.
-- Sort the results based on the customer's first name in ascending order.
-- (Hint: Retrieve records from the Customer_Master and Enquiry_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

select
    c.cust_id,
    c.c_first_name,
    c.city,
    c.phoneno
from
    Customer_Master c
    left join Enquiry_Master e on c.cust_id = e.cust_id
where
    e.cust_id is null
order by
    c_first_name;