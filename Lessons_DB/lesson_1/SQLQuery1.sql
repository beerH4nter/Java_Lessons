--SELECT DISTINCT Izd FROM books
--ORDER BY Izd

--SELECT * FROM books
--WHERE Themes LIKE('%����������������%')
--AND (Izd LIKE('�����') 
--OR Izd LIKE('BHV%'))

--SELECT * FROM books
--WHERE Pages BETWEEN 200 AND 600

--SELECT * FROM books
--WHERE Izd LIKE('[B-O]%')
--ORDER BY Izd

--SELECT * FROM books
--WHERE (Themes LIKE('%����������������%') OR Themes LIKE('%���� ������%'))
--AND NOT Izd IN('�����','�����')

--SELECT DISTINCT Izd FROM books
--WHERE Izd LIKE('%�%�%')

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
