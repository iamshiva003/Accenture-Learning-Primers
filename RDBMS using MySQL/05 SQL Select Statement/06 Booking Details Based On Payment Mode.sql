-- Write a query to display the booking id, enquiry id and total amount of all bookings paid by 'Cash' or 'Credit'. 
-- Sort the results based on the enquiry id in ascending order.
-- (Hint: Data is case sensitive. Retrieve records from the Booking_Master. )
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    Booking_Id,
    Enquiry_Id,
    Total_amount
FROM
    Booking_Master
WHERE
    Mode_of_Pay = 'Cash'
    OR Mode_of_Pay = 'Credit'
ORDER BY
    Enquiry_Id;