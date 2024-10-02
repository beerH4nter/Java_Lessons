--SELECT DISTINCT Izd FROM books
--ORDER BY Izd

--SELECT * FROM books
--WHERE Themes LIKE('%программирование%')
--AND (Izd LIKE('Питер') 
--OR Izd LIKE('BHV%'))

--SELECT * FROM books
--WHERE Pages BETWEEN 200 AND 600

--SELECT * FROM books
--WHERE Izd LIKE('[B-O]%')
--ORDER BY Izd

--SELECT * FROM books
--WHERE (Themes LIKE('%программирование%') OR Themes LIKE('%базы данных%'))
--AND NOT Izd IN('Питер','Бином')

--SELECT DISTINCT Izd FROM books
--WHERE Izd LIKE('%а%а%')

--SELECT Izd, Name 
--FROM books
--ORDER BY Izd, Name DESC

--SELECT * FROM books
--WHERE Name LIKE('[0-9]%')

--SELECt * FROM books
--WHERE Name LIKE('%[0-9][0-9][0-9][0-9]')

SELECT * FROM books
WHERE Name LIKE('%[0-9]%[0-9]%') 
AND NOT Name LIKE('%[0-9]%[0-9]%[0-9]%')
