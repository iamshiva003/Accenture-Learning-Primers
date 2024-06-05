-- Write a query to display the customer's first name, venue id, start date and end date of all enquiries.
-- Sort the results based on the customer's first name in ascending order.
-- (Hint: Retrieve records from the Customer_Master and Enquiry_Master.)
-- Explanation for writing a query:
-- Step 1:Select the columns that are mentioned in the description.
-- As per the description you have to select the columns such as customer first name, venue id, start date and end date.
-- select c_first_name,venue_id,start_date,end_date
-- Step 2: : Once the columns are selected you have to choose the tables from which the columns are selected.
-- The columns customer first name, venue id, start date and end date are the attributes of customer_master and enquiry_master tables.
-- select c_first_name,venue_id,start_date,end_date from customer_master,enquiry_master
-- Step 3:If you are selecting attributes from more than one table then you have to join the tables with proper on condition.
-- select c_first_name,venue_id,start_date,end_date
-- from customer_master c join enquiry_master e on c.cust_id=e.cust_id
-- Step 4:Sort the records as mentioned in the description.
-- As per the description sort the records based on the c_first_name in ascending order.
-- select c_first_name,venue_id,start_date,end_date
-- from customer_master c join enquiry_master e on c.cust_id=e.cust_id order by c_first_name
-- Step 5:Finally, terminate the query with a proper termination character.
-- select c_first_name,venue_id,start_date,end_date from customer_master c join enquiry_master e on c.cust_id=e.cust_id
-- order by c_first_name;
-- Save this query in your editor and then click 'Compile & Run' button to check for compilation errors. If no errors are found, then click on 'Evaluate' button.
-- (Note: Use ';' to terminate your query before compilation and evaluation.)

SELECT
    c_first_name,
    venue_id,
    start_date,
    end_date
FROM
    Customer_Master c
    JOIN Enquiry_Master e ON c.cust_id = e.cust_id
ORDER BY
    c_first_name ASC;