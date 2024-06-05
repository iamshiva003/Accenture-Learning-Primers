-- Write a query to display the first name, gender and phone number of all the customers. 
-- Sort the results based on the customer's first name in ascending order.
-- (Hint: Retrieve records from the Customer_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)
-- Explanation for writing a query:
-- Step 1:Select the columns that are mentioned in the description.
-- As per the description you have to select the columns such as c_first_name,gender and Phoneno.
-- select c_first_name,gender,Phoneno 
-- Step 2: Once the columns are selected you have to choose the tables from which the columns are selected.
-- The  c_first_name,gender and Phoneno are the attributes of Customer_master table.
-- select c_first_name,gender,Phoneno from Customer_master 
-- Step 3:Sort the records as mentioned in the description.
-- As per the description sort the records based on the c_first_name in ascending order.
-- select c_first_name,gender,Phoneno from Customer_master order by c_first_name
-- Step 4:Finally, terminate the query with proper termination character.
-- select c_first_name,gender,Phoneno from Customer_master order by c_first_name;
-- Save this query in your editor and then click 'Compile & Run' button to check for compilation errors. If no errors are found, then click on 'Evaluate' button.


SELECT
    C_first_name,
    Gender,
    Phoneno
FROM
    Customer_Master
ORDER BY
    C_first_name;