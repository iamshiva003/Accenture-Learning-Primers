-- The event manager wants to find the maximum seating capacity for each event with wifi access. Write a query to display the event id and maximum seating capacity for all events. Give an alias name to the maximum seating capacity as 'maximum_seating_capacity'. 
-- Sort the results based on the maximum_seating_capacity in descending order.
-- (Hint: Retrieve records from the Venue Master.  Wifi = "Yes" or "No.")
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    event_id,
    MAX(capacity) AS maximum_seating_capacity
FROM
    Venue_Master
WHERE
    wifi = 'Yes'
GROUP BY
    event_id
ORDER BY
    maximum_seating_capacity DESC;