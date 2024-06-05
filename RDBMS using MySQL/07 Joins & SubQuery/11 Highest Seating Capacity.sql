-- Write a query to display the category, venue name and capacity of the events that have the highest seating capacity for each category.
-- (Hint: Use correlated subquery.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    e.category,
    v.venue_name,
    v.capacity
FROM
    Venue_Master v
    JOIN Event_Master e ON v.event_id = e.event_id
WHERE
    v.capacity = (
        SELECT
            MAX(v2.capacity)
        FROM
            Venue_Master v2
            JOIN Event_Master e2 ON v2.event_id = e2.event_id
        WHERE
            e2.category = e.category
    );