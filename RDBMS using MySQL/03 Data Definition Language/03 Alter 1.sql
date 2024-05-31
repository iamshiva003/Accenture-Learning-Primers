-- Write a query to add a not null constraint to the wifi column in the Venue_Master table.
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

ALTER TABLE
    Venue_Master
MODIFY
    Wifi VARCHAR(10) NOT NULL;