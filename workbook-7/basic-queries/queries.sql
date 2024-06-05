/*SELECT table_name 
FROM information_schema.Tables 
WHERE table_schema = 'northwind'*/


/*SELECT ProductID, ProductName, UnitPrice
FROM products; */




/*SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice ASC;*/




/*SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice <= 7.50;*/




/*SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;*/




/*SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;*/




/*SELECT ProductID, ProductName, UnitsInStock, UnitsOnBackOrder
FROM Products
WHERE UnitsInStock = 0 AND UnitsOnBackOrder >= 1
ORDER BY ProductName ASC;
*/



/*SELECT ProductName, ProductID
FROM Products
WHERE ProductID IN (1, 3, 5);*/




/*SELECT *
FROM Categories;
SELECT CategoryID
FROM Categories
WHERE CategoryName = 'Seafood';*/




/*SELECT Products.ProductName
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Categories.CategoryName = 'Seafood';*/




/*SELECT FirstName, LastName
From employees;*/




/*SELECT FirstName, LastName, Title
FROM employees
WHERE Title LIKE '%manager%';*/






/*SELECT DISTINCT Title
FROM employees;*/







/*SELECT FirstName, LastName, Salary
FROM employees
WHERE Salary BETWEEN 2000 AND 2500;*/






/*SELECT *
FROM Suppliers;*/







/*SELECT products.ProductName
FROM suppliers
JOIN products ON suppliers.SupplierID = products.SupplierID
WHERE suppliers.CompanyName = 'Tokyo Traders';*/
























