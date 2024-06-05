-- Write a query to display the customer's first name, city and venue id of all the customers who live in the same city and enquired about the same venue.
-- (Hint:  Retrieve records from the Customer_Master and  Enquiry_Master.)

select
    c1.c_first_name,
    c2.c_first_name,
    c1.city,
    e1.venue_id
from
    Customer_Master c1,
    Customer_Master c2,
    Enquiry_Master e1,
    Enquiry_Master e2
where
    c1.city = c2.city
    and c1.cust_id != c2.cust_id
    and c2.cust_id != c1.cust_id
    and c1.cust_id = e1.cust_id
    and c2.cust_id = e2.cust_id
    and e1.venue_id = e2.venue_id;