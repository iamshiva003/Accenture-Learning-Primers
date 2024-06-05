-- Write a query to display the mode of payment and the minimum total amount of all the bookings paid using 'Cash' or 'Online' payment. Give an alias name for the minimum total amount for the method of payment as 'MINIMUM_TOTAL_AMOUNT'.
-- Sort the results based on the MINIMUM_TOTAL_AMOUNT in ascending order.
-- (Hint: Retrieve records from the Booking_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    mode_of_pay,
    MIN(total_amount) AS MINIMUM_TOTAL_AMOUNT
FROM
    Booking_Master
WHERE
    mode_of_pay IN ('Cash', 'Online')
GROUP BY
    mode_of_pay
ORDER BY
    MINIMUM_TOTAL_AMOUNT;