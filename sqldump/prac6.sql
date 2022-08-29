use sakila;

-- date and time functions
-- SELECT NOW(); -- displays the current time and date
-- SELECT CURDATE(); -- displays the current date
-- SELECT CURTIME(); -- displays the current tme
-- SELECT DATEDIFF('2017-01-13','2017-01-03') AS DateDiff; -- displays difference between two datetime
-- SELECT DATE_FORMAT(CURDATE(), '%D'); -- formats a given datetime to the specified format
-- SELECT DATE_ADD(NOW(), INTERVAL 1 YEAR) AS AYearLater; -- adds month/days/year/time to a given datetime 
-- SELECT date(now());  -- selects date from a given datetime
-- SELECT EXTRACT(SECOND from CURTIME());

-- numeric functions

-- SELECT Abs(-243.5) AS AbsNum; -- returns the absoulte value of a number
-- SELECT ACOS(0.25); -- Returns the arc cosine of a number 
-- SELECT ASIN(0.25); -- Returns the arcs sin of a number 
-- SELECT ATAN(2.5); -- Returns the arc tan of a number
-- SELECT(PI()); -- Returns the pi value upto 6 decimal
-- SELECT(POW(2,3)); -- It returns m raised to the nth power.
-- SELECT(RAND()); -- It returns a random number.
-- SELECT(SQRT(9)); -- It returns the square root of a number.


-- STRING FUNCTIONS

-- SELECT ASCII('A'); -- Returns numeric value of left-most character
-- SELECT CHAR_LENGTH("ABCD"); -- Returns the length of a string (in characters)
-- SELECT CONCAT("Apple", " is a fruit."); -- Adds two or more expressions together
-- SELECT LCASE("ADITYA"); -- Converts a string to lower-case
-- SELECT LOCATE("Ko", "Kolkata"); -- Returns the position of the first occurrence of a substring in a string
-- SELECT REVERSE("Aditya"); -- Reverses a string and returns the result
-- SELECT RIGHT("Aditya", 3); -- Extracts a number of characters from a string (starting from right)
-- SELECT STRCMP("Aditya", "Adity"); -- Compares two strings


-- Conversion Functions

SELECT CONVERT("2022-08-27", DATE);-- It converts the value into DATE datatype that responsible for the date portion only.
SELECT CONVERT('2022-08-27 23:59:59', datetime); -- It converts the value into the DATETIME data type that responsible for the date and time portion both
SELECT CONVERT('23:59:59', time); -- - It converts the value into a TIME data type that responsible for the time portion only.
SELECT CONVERT('apple', char); -- It converts a value to the CHAR data type, which has a fixed-length string.
SELECT CONVERT(67453, signed); -- It converts a value to SIGNED datatype, which has signed 64-bit integer.
SELECT CONVERT(67453, UNSIGNED); -- It converts a value to the UNSIGNED datatype, which has unsigned 64-bit integer.
SELECT CONVERT(8934, decimal); -- It converts a value to the DECIMAL data type, which has a decimal string.
SELECT CONVERT(5, binary); -- It converts a value to the BINARY data type, which has a binary string.
