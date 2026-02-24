# Write your MySQL query statement below
SELECT M.employee_id, M.name, COUNT(E.reports_to) AS 'reports_count', ROUND(AVG(E.age)) as 'average_age'
FROM Employees E, Employees M
WHERE E.reports_to = M.employee_id
GROUP BY E.reports_to
HAVING COUNT(E.reports_to) >= 1
ORDER BY employee_id;
