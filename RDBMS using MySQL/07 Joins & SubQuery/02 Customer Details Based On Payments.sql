-- Write a query to display the unique customer id, customer first name, phone number and email of all the customers who made a 'Online' payment.
-- Sort the results based on the customer id in ascending order.
-- (Hint: Data is case sensitive. Retrieve records from the Customer_Master, Enquiry_Master and Booking_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    c.cust_id,
    c.c_first_name,
    c.phoneno,
    c.email
FROM
    Customer_Master c
WHERE
    c.cust_id IN (
        SELECT
            e.cust_id
        FROM
            Enquiry_Master e
        WHERE
            e.enquiry_id IN (
                SELECT
                    b.enquiry_id
                FROM
                    Booking_Master b
                WHERE
                    b.mode_of_pay = 'Online'
            )
    )
ORDER BY
    c.cust_id;