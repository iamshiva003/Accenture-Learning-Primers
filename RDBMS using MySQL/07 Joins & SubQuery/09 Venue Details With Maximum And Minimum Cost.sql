-- Write a query that displays the IDs, names, and locations of all the venues, with the maximum cost and minimum cost, respectively.
-- Sort the results based on the venue cost in ascending order.
-- (Hint: Retrieve records from the Venue_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

select
    v.venue_id,
    v.venue_name,
    v.location
from
    Venue_Master v
where
    v.venue_cost = (
        select
            max(venue_cost)
        from
            Venue_Master
    )
    or v.venue_cost = (
        select
            min(venue_cost)
        from
            Venue_Master
    )
order by
    v.venue_cost;