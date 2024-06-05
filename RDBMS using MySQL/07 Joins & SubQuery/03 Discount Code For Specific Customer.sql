-- The event manager decides to give a discount code to specific customers. Write a query to display the unique details of customer's first name and discount code for all the customers who live in 'Los Angeles' or 'Boston', where their total booking amount is more than 50000. The discount code consists of the first three letters of the customer's first name, followed by the first three digits of their phone number. Give an alias name to the discount code as 'Discount_Code'.
--  Sort the results based on the customer's first name in ascending order.
-- (Hint:  Retrieve records from the Customer_Master, Enquiry_Master and Booking_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT DISTINCT
    c.c_first_name,
    CONCAT (
        SUBSTR (c.c_first_name, 1, 3),
        SUBSTR (c.phoneno, 1, 3)
    ) AS Discount_Code
FROM
    Customer_master c
    JOIN Enquiry_Master e ON c.cust_id = e.cust_id
    JOIN Booking_Master b ON e.enquiry_id = b.enquiry_id
WHERE
    c.city IN ('Los Angeles', 'Boston')
    AND b.total_amount > 50000
ORDER BY
    c.c_first_name;