-- Write a query to display the venue name, venue cost and cost_category of all venues. Give an alias name as 'cost_category' for the venues based on their cost. 
-- A cost_category can be calculated based on the following details:
-- If the cost ranges from 50000 to 200000, then display 'Medium Cost'.
-- If the cost is less than 50000, then display 'Low Cost'.
-- If the cost is more than 200000,then display 'High Cost'.
-- Sort the results based on the capacity in descending order.
-- (Hint: Retrieve records from the Venue_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT venue_name, venue_cost,
    CASE
        WHEN venue_cost < 50000 THEN 'Low Cost'
        WHEN venue_cost BETWEEN 50000 AND 200000 THEN 'Medium Cost'
        WHEN venue_cost > 200000 THEN 'High Cost'
END AS cost_category
FROM Venue_Master
ORDER BY capacity DESC;