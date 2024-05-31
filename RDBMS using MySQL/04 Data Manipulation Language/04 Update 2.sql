-- Write a query to increase the venue's capacity by 10% for all the venues whose location is in 'San Antonio'.
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

UPDATE Venue_Master
SET
    Capacity = Capacity * 1.1
WHERE
    Location = 'San Antonio';