-- Write a query to display customer information by concatenating customers first name, city and phone number. Give an alias name to the customer information as 'customer_info'. If the gender is 'Male', then display 'his' or if the gender is 'Female', then display 'her' as shown in the sample output.
-- Sort the results based on the customer first name in descending order.
-- Sample Data:
-- c_first_name lives in city and her phone number is phoneno
-- c_first_name lives in city and his  phone number is phoneno 
-- Sample Output:
-- customer_info
-- Amelia lives in Boston and her phone number is 9235234538
-- Carlos lives in Los Angeles and his phone number is 923523453
-- (Hint: Data is case sensitive. Retreive records from the Customer_Master.)
-- (Note: Use ';' to terminate your query before compilation and evaluation.)


SELECT
    CONCAT (
        c_first_name,
        ' lives in ',
        city,
        ' and ',
        CASE
            WHEN gender = 'Male' THEN 'his'
            WHEN gender = 'Female' THEN 'her'
        END,
        ' phone number is ',
        phoneno
    ) AS customer_info
FROM
    Customer_Master
ORDER BY
    c_first_name DESC;