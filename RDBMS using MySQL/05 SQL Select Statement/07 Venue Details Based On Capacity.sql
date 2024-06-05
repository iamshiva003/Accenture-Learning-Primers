-- Write a query to display the id, name, cost and location of all the venues where the venue's capacity ranges from 1000 to 20000. 
-- Sort the results based on the venue name in ascending order.
-- (Hint:  Retrieve records from the Venue_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    Venue_id,
    Venue_name,
    Venue_Cost,
    Location
FROM
    Venue_Master
WHERE
    Capacity BETWEEN 1000 AND 20000
ORDER BY
    Venue_name;