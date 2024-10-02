--SELECT * FROM books
--WHERE Pressrun = 1
--ORDER BY Name

--SELECT * FROM books
--WHERE Izd NOT LIKE('BHV%')
--AND Name LIKE('%Visual%')

--SELECT * FROM books
--WHERE (Themes LIKE('%программирование%')
--OR Category LIKE('%Web-дизайн%'))
--AND (Izd LIKE('BHV%')
--OR Izd = 'Бином')

--SELECT * FROM books
--WHERE Name LIKE('%руководство')
--OR Name LIKE('%справочник%')

--SELECT * FROM books
--WHERE Name LIKE('[A-Z]%')

--SELECT * FROM books
--WHERE Name LIKE('%[а-я]')

--SELECT * FROM books
--WHERE Izd LIKE('___')

--SELECT * FROM books
--WHERE (Name NOT LIKE('%Delphi%')
--AND Name NOT LIKE('%Pascal%'))
--AND Category NOT IN('Pascal','Delphi')--так много условый потому что в одной книге было название "Турбо паскаль"
--в общем, что бы наверняка

--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('TCP/IP', NULL, '2005-01-01', 'Сети', 'Питер','3-е издание', 1)
--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('C++ базовый курс', 620, '2005-01-01', 'Программирование', 'Вильямс','3-е издание', 2)
--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('Flash MX 2004', NULL, '2006-01-01', 'Web-дизайн', 'Кертис','Самоучитель', 1)
--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('C/C++', 464, '2005-01-01', 'Программирование', 'Питер','Учебник для вузов', 2)

--UPDATE books
--SET Izd = 'Вильямс'
--WHERE Izd = 'Кертис'

--UPDATE books
--SET Pressrun = 5
--WHERE Name = 'Flash MX 2004'

--UPDATE books
--SET Themes = '3D-графика'
--WHERE Name LIKE('%3D%')

--DELETE FROM books
--WHERE Izd LIKE('Д%')

--SELECT * FROM books
--WHERE Pages = NULL

DELETE FROM books
WHERE Date < '2000-01-01'
AND Izd != 'Питер'
