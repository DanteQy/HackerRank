/*Select cities that starts and ends with vowels*/
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP "^[aeiou].*[aeiou]$"
