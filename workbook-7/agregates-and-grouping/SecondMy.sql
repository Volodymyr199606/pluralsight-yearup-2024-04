use northwind;

/*SELECT COUNT(*) FROM Suppliers;*/


/*SELECT SUM(salary) FROM Employees;*/


/*SELECT MIN(UnitPrice) FROM Products;*/



/*SELECT AVG(UnitPrice) FROM Products;*/



/*SELECT MAX(UnitPrice) FROM Products;*/




/*DESCRIBE products;
SELECT SupplierID, COUNT(ProductID)
FROM Products
GROUP BY SupplierID;*/





/*SELECT SupplierID, CategoryID, AVG(UnitPrice) 
FROM Products 
GROUP BY SupplierID, CategoryID;*/





/*SELECT SupplierID, COUNT(ProductName)
FROM Products
GROUP BY SupplierID
HAVING COUNT(SupplierID) >= 5; */










/*SELECT ProductID, ProductName, UnitPrice * UnitsOnOrder AS inventory_value
FROM Products
ORDER BY inventory_value DESC, ProductName ASC;*/




