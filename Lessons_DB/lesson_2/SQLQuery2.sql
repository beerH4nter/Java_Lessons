--SELECT * FROM books
--WHERE Pressrun = 1
--ORDER BY Name

--SELECT * FROM books
--WHERE Izd NOT LIKE('BHV%')
--AND Name LIKE('%Visual%')

--SELECT * FROM books
--WHERE (Themes LIKE('%����������������%')
--OR Category LIKE('%Web-������%'))
--AND (Izd LIKE('BHV%')
--OR Izd = '�����')

--SELECT * FROM books
--WHERE Name LIKE('%�����������')
--OR Name LIKE('%����������%')

--SELECT * FROM books
--WHERE Name LIKE('[A-Z]%')

--SELECT * FROM books
--WHERE Name LIKE('%[�-�]')

--SELECT * FROM books
--WHERE Izd LIKE('___')

--SELECT * FROM books
--WHERE (Name NOT LIKE('%Delphi%')
--AND Name NOT LIKE('%Pascal%'))
--AND Category NOT IN('Pascal','Delphi')--��� ����� ������� ������ ��� � ����� ����� ���� �������� "����� �������"
--� �����, ��� �� ���������

--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('TCP/IP', NULL, '2005-01-01', '����', '�����','3-� �������', 1)
--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('C++ ������� ����', 620, '2005-01-01', '����������������', '�������','3-� �������', 2)
--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('Flash MX 2004', NULL, '2006-01-01', 'Web-������', '������','�����������', 1)
--INSERT INTO books (Name, Pages, Date, Themes, Izd, Category, Pressrun)
--VALUES ('C/C++', 464, '2005-01-01', '����������������', '�����','������� ��� �����', 2)

--UPDATE books
--SET Izd = '�������'
--WHERE Izd = '������'

--UPDATE books
--SET Pressrun = 5
--WHERE Name = 'Flash MX 2004'

--UPDATE books
--SET Themes = '3D-�������'
--WHERE Name LIKE('%3D%')

--DELETE FROM books
--WHERE Izd LIKE('�%')

--SELECT * FROM books
--WHERE Pages = NULL

DELETE FROM books
WHERE Date < '2000-01-01'
AND Izd != '�����'
