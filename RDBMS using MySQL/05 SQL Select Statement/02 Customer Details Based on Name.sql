-- Write a query to display the first name, last name, street and city of all the customers whose first name contains the second letter as 'm'. 
-- Sort the results based on the first name in ascending order.
-- (Hint: Data is case sensitive. Retrieve records from the Customer_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)
-- Explanation for writing a query:
-- Step 1:Select the columns that are mentioned in the description.
-- As per the description you have to select the columns such as c_first_name,c_last_name,street and City.
-- select C_first_name,c_last_name,street,City
-- Step 2: Once the columns are selected you have to choose the tables from which the columns are selected.
-- The c_first_name,c_last_name,street and City are the attributes of Customer_master table.
-- select C_first_name,c_last_name,street,City from Customer_master
-- Step 4:Next You'll have to check the conditions, if any.
-- You have to display the customer details whose name contains 'm' in the second position.
-- For Example : Amrita,Amir
-- select C_first_name,c_last_name,street,City from Customer_master where C_first_name like '_m%'
-- Step 5:Sort the records as mentioned in the description.
-- As per the description sort the records based on the c_first_name in ascending order.
-- select C_first_name,c_last_name,street,City from Customer_master where C_first_name like '_m%'
-- order by C_first_name
-- Step 6:Finaly terminate the query with proper termination character.
-- select C_first_name,c_last_name,street,City from Customer_master
-- where C_first_name like '_m%' order by C_first_name;
-- Save this query in your editor and then click 'Compile & Run' button to check for compilation error. If no errors are found then click on 'Evaluate' button.


SELECT
    C_first_name,
    C_last_name,
    Street,
    City
FROM
    Customer_Master
WHERE
    C_first_name LIKE '_m%'
ORDER BY
    C_first_name;