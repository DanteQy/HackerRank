/*Select all the cities that ends with vowels*/
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP "^.*[aeiou]$"
