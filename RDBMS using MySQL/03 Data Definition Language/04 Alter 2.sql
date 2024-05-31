-- Write a query to add a constraint foreign key to the Enquiry Id column in the Booking_Master table.
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

ALTER TABLE
    Booking_Master
ADD
    CONSTRAINT FOREIGN KEY (Enquiry_Id) REFERENCES Enquiry_Master(Enquiry_Id);