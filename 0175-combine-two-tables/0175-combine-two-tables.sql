# Write your MySQL query statement below
-- SELECT firstName,lastName,city,state FROM Person 
-- LEFT JOIN Address
-- ON Person.personId=Address.personId;


SELECT p.firstName,
p.lastName,
a.city,
a.state
FROM Person as p
LEFT JOIN Address as a
ON p.personId=a.personID;