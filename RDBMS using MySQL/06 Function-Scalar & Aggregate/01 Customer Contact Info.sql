-- Write a query to display the customer id, customer first name and city of all the customers. If the city is not available, then display the phone number. If the phone number is not available, then display the email. Give an alias name to the city as 'CONTACT_INFO'. 
-- Sort the results based on the contact info in ascending order.
-- (Hint: Retrieve records from the Customer_Master table.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)
-- Explanation for writing a query:
-- Step 1:Select the columns that are mentioned in the description.
-- As per the description you have to select the columns such as customer id, first name and contact information.
-- City is the contact information; if city is not available, then phone number is displayed; if phone number is also not available, then email address is displayed.
-- select cust_id,c_first_name,coalesce(city,phoneno,email) contact_info
-- Step 2: Once the columns are selected you have to choose the tables from which the columns are selected.
-- The customer id, first name and contact information are the attributes of Customer_master table.
-- select cust_id,c_first_name,coalesce(city,phoneno,email) contact_info from customer_master
-- Step 3:Sort the records as mentioned in the description.
-- As per the description sort the records based on the contact_info in ascending order.
-- select cust_id,c_first_name,coalesce(city,phoneno,email) contact_info
--  from customer_master order by contact_info
-- Step 4:Finally, terminate the query with a proper termination character.
-- select cust_id,c_first_name,coalesce(city,phoneno,email) contact_info
--  from customer_master order by contact_info;
-- Save this query in your editor and then click 'Compile & Run' button to check for compilation errors. If no errors are found, then click on 'Evaluate' button.


SELECT
    cust_id,
    c_first_name,
    coalesce(city, phoneno, email) AS contact_info
FROM
    customer_master
ORDER BY
    contact_info;