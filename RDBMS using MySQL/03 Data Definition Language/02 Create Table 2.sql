-- Refer to the below schema and write a query to create the Venue_Master table with the constraints mentioned.
-- Note: Assume that Event_Master table is already created.
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

CREATE TABLE Venue_Master (
    Venue_Id VARCHAR(10) PRIMARY KEY,
    Event_Id VARCHAR(10),
    Venue_name VARCHAR(30),
    Location VARCHAR(50),
    Venue_Cost INT,
    Food VARCHAR(10),
    Capacity INT,
    Wifi VARCHAR(10),
    Description VARCHAR(50),
    FOREIGN KEY (Event_Id) REFERENCES Event_Master(Event_Id)
);