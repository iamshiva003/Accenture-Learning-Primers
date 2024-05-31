-- Write a query to remove all the details of the enquiries that were made about venue id 'V04' if and only if the status is 'Available'.
-- (Hint: Data is case sensitive.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

DELETE FROM Enquiry_Master
WHERE
    Venue_Id = 'V04'
    AND Status = 'Available';