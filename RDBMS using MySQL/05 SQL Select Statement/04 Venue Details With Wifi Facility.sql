-- The customer wants to know the details of the venues with wifi facilities and locations other than 'New York' and 'Austin'.
-- Write a query to display the id, name, location, and cost of all the venues with wifi facilities and locations other than 'New York' and 'Austin'.
-- Sort the results based on the venue cost in ascending order.
-- (Hint: Data is case sensitive. Retrieve records from the Venue_Master. Wifi = 'Yes' or 'No'.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    Venue_Id,
    Venue_name,
    Location,
    Venue_Cost
FROM
    Venue_Master
WHERE
    Wifi = 'Yes'
    AND (
        Location != 'New York'
        AND Location != 'Austin'
    )
ORDER BY
    Venue_Cost;