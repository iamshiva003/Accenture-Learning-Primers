-- Write a query to display the location and average cost for each location that has a venue seating capacity of more than 1000. Give an alias name as 'Avg_cost' for the average cost for each location. The average cost should be in two decimal places.
-- Sort the results based on the location in ascending order. 
-- (Hint: Retrieve records from the  Venue_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    location,
    ROUND(AVG(venue_cost), 2) AS Avg_cost
FROM
    Venue_Master
WHERE
    capacity > 1000
GROUP BY
    location
ORDER BY
    location;