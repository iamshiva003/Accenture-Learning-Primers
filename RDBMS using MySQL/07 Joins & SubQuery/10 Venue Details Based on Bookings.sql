-- Write a query to display the venue id, venue name, location and category of all venues that have the same number of bookings as the venue id 'V10' excluding the details of 'V10'. 
-- Sort the results based on the venue name in descending order.
-- (Hint: Data is case sensitive. Retrieve records from the Booking_Master, Enquiry_Master, Venue_Master and Event_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

select
    vm.venue_id,
    vm.venue_name,
    vm.location,
    em.category
from
    Venue_Master vm
    join Event_Master em ON vm.event_id = em.event_id
where
    vm.venue_id in (
        select
            venue_id
        from
            (
                select
                    e.venue_id,
                    count(b.booking_id) as BookingCount
                from
                    Enquiry_Master e
                    join Booking_Master b on e.enquiry_id = b.enquiry_id
                group by
                    e.venue_id
            ) as VenueBookings
        where
            BookingCount = (
                select
                    count(b.booking_id)
                from
                    Enquiry_Master e
                    join Booking_Master b on e.enquiry_id = b.enquiry_id
                where
                    e.venue_id = 'V10'
            )
            and venue_id <> 'V10'
    )
order by
    vm.venue_name desc;