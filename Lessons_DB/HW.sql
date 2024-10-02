--CREATE PROCEDURE ShowEmployeesInfo
--AS
--BEGIN 
--	SELECT * FROM Employees
--END

--CREATE PROCEDURE ShowClientsInfo
--AS
--BEGIN 
--	SELECT * FROM Clients
--END


--CREATE PROCEDURE ShowSalesInfo
--AS
--BEGIN 
--	SELECT * FROM Sales
--END

--CREATE PROCEDURE ShowSalesInfoByDate(@Date DATE)
--AS
--BEGIN 
--	SELECT * FROM Sales s
--	WHERE s.Date = @Date;
--END;

--EXECUTE ShowSalesInfoByDate @Date = '2021-03-11'


--CREATE PROCEDURE ShowSalesInfoByDateBetween(@StartDate DATE, @EndDate DATE)
--AS
--BEGIN 
--	SELECT * FROM Sales s
--	WHERE s.Date BETWEEN @StartDate AND @EndDate;
--END;

--EXECUTE ShowSalesInfoByDateBetween @StartDate = '2019-01-31', @EndDate = '2021-03-11'


--CREATE PROCEDURE ShowSalesInfoByEmployee(@Name NVARCHAR(50))
--AS
--BEGIN 
--	SELECT * FROM Sales s
--	JOIN Employees e ON e.Id = s.EmployeeId
--	WHERE e.FullName = @Name;
--END;

--EXECUTE ShowSalesInfoByEmployee @Name = 'Cara Durrance'


--CREATE PROCEDURE ShowAverageCostByYear(@Year INT)
--AS
--BEGIN 
--	SELECT AVG(p.Cost) AS AverageSaleCost FROM Products p
--	JOIN Storage st ON st.ProductId = p.Id
--	JOIN Sales s ON s.StorageId = st.Id
--	WHERE YEAR(s.Date) = @Year;
--END;

--EXECUTE ShowAverageCostByYear @Year = 2021

--CREATE PROCEDURE ShowProductInfoByType(@Type NVARCHAR(50))
--AS
--BEGIN 
--	SELECT * FROM Products p
--	JOIN Type t ON t.Id = p.TypeId
--	WHERE t.Name = @Type;
--END;

--EXECUTE ShowProductInfoByType @Type = 'Clothing'


--CREATE PROCEDURE ShowTopThreeMostOldClients
--AS
--BEGIN 
--	SELECT TOP 3 * FROM Clients
--	WHERE DateSubcribe IS NOT NULL
--	ORDER BY DateSubcribe ASC
--END;

--EXECUTE ShowTopThreeMostOldClients


--CREATE PROCEDURE ShowBestEmployee
--AS
--BEGIN 
--	SELECT TOP 1 e.Id, e.FullName, e.EmploymentDate, e.Gender, e.PositionId, e.Salary, SUM(p.Cost) AS SumOfSales FROM Employees e
--	JOIN Sales s ON e.Id = s.EmployeeId
--	JOIN Storage st ON s.StorageId = st.Id
--	JOIN Products p ON p.Id = st.ProductId
--	GROUP BY e.Id, e.FullName, e.EmploymentDate, e.Gender, e.PositionId, e.Salary
--	ORDER BY SumOfSales DESC
--END;



--EXECUTE ShowBestEmployee


--CREATE FUNCTION ShowUniqueClients()
--RETURNS INT
--AS
--BEGIN
--	DECLARE @AmountOfUnique INT;
--	SELECT @AmountOfUnique = COUNT(DISTINCT c.Email)
--	FROM Clients c;
--	RETURN @AmountOfUnique;
--END;

--SELECT dbo.ShowUniqueClients() AS CountOfUniqueClients


--CREATE FUNCTION ShowAveragePriceByType(@ProductType NVARCHAR(50))
--RETURNS INT
--AS
--BEGIN
--	DECLARE @AveragePrice INT;

--	SELECT @AveragePrice = AVG(p.Cost) 
--	FROM Products p
--	JOIN Type t ON p.TypeId = t.Id
--	WHERE t.Name = @ProductType;
	
--	RETURN @AveragePrice;
--END;

--SELECT dbo.ShowAveragePriceByType('Clothing') AS AveragePrice


--CREATE FUNCTION ShowLastSaleInfo()
--RETURNS 
--@Result TABLE (
--Id INT,
--Quantity INT,
--Date DATE,
--EmployeeId INT,
--ClientId INT,
--StorageId INT
--)
--AS
--BEGIN
--	INSERT INTO @Result
--	SELECT TOP 1 * FROM Sales
--	ORDER BY Date DESC
--	RETURN
--END

--SELECT * FROM dbo.ShowLastSaleInfo()

--CREATE FUNCTION ShowFirstSaleInfo()
--RETURNS 
--@Result TABLE (
--Id INT,
--Quantity INT,
--Date DATE,
--EmployeeId INT,
--ClientId INT,
--StorageId INT
--)
--AS
--BEGIN
--	INSERT INTO @Result
--	SELECT TOP 1 * FROM Sales
--	ORDER BY Date ASC
--	RETURN
--END

--SELECT * FROM dbo.ShowFirstSaleInfo()

CREATE FUNCTION ShowProductInfoByTypeAndFabricator(
    @FabricatorName NVARCHAR(50), 
    @TypeName NVARCHAR(50)
)
RETURNS @Result TABLE (
    Id INT,
    Name NVARCHAR(50),
    PrimeCost MONEY,
    TypeId INT,
    FabricatorId INT,
    Cost MONEY
)
AS
BEGIN
    INSERT INTO @Result
    SELECT 
        p.Id,            
        p.Name,          
        p.PrimeCost,     
        p.TypeId,        
        p.FabricatorId, 
        p.Cost          
    FROM Products p
    JOIN Fabricator f ON f.Id = p.FabricatorId
    JOIN Type t ON t.Id = p.TypeId
    WHERE f.Name = @FabricatorName
      AND t.Name = @TypeName;
    
    RETURN;
END;

SELECT * FROM ShowProductInfoByTypeAndFabricator('Adidas', 'Clothing')

