/*cities that won't start with vowels
^ starts with
[...] containing this characters
. any sigle characters 
* Zero or more instances of preceding element
*/

SELECT DISTINCT CITY FROM STATION
WHERE CITY NOT REGEXP "^[aeiou].*"

