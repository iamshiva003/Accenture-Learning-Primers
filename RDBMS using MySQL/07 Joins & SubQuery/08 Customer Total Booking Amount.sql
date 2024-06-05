-- Write a query to display the customer's first name and the total booking amount paid by each booked customer whose total booking amount is greater than the average total amount of all booked customers. Give an alias name as 'total_booking_amount' for the total booking amount.
-- Sort the results based on the customer's first name in ascending order.
-- (Hint: Retrieve records from the Customer_Master, Enquiry_Master and Booking_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

select
    c.c_first_name,
    sum(b.total_amount) as total_booking_amount
from
    Customer_Master c
    join Enquiry_Master e on c.cust_id = e.cust_id
    join Booking_Master b on e.enquiry_id = b.enquiry_id
group by
    c.cust_id,
    c.c_first_name
having
    sum(b.total_amount) > (
        select
            avg(total_amount)
        from
            Booking_Master
    )
order by
    c.c_first_name;