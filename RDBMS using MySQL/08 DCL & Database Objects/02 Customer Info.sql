-- Create a view as Customer_Info that contains the customer's first name, phone number, city, and total amount for customers whose total amount is less than 60000.
-- Sort the results based on the customer's first name in ascending order.
--  (Note: Use ';' to terminate your query before compilation and evaluation. The column name should be written as in the schema diagram and an alias name should be written as in the description.)

create view
    Customer_info as (
        select
            C.C_first_name,
            C.Phoneno,
            C.City,
            B.Total_amount
        from
            Customer_Master C,
            Enquiry_Master E,
            Booking_Master B
        where
            C.Cust_Id = E.Cust_Id
            and E.Enquiry_Id = B.Enquiry_Id
            and B.Total_amount < 60000
        order by
            C_first_name
    );