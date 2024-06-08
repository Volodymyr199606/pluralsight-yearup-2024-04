/*SELECT P.ProductID, P.ProductName, P.UnitPrice, C.CategoryName
FROM products P
INNER JOIN categories C ON P.CategoryID = C.CategoryID
ORDER BY P.ProductName;*/





/*SELECT P.ProductID, P.ProductName, P.UnitPrice, S.SupplierID
FROM Products P
INNER JOIN suppliers S ON P.SupplierID = S.SupplierID
WHERE P.UnitPrice > 75
ORDER BY P.ProductName;*/



/*SELECT P.ProductID, P.ProductName, P.UnitPrice, C.CategoryName as CategoryName, S.ContactName as SupplierName
FROM products P
INNER JOIN categories C ON P.CategoryID = C.CategoryID
INNER JOIN suppliers S ON P.SupplierID = S.SupplierID
ORDER BY P.ProductName;*/









/*SELECT P.ProductName, C.CategoryName as CategoryName
FROM Products P
INNER JOIN Categories C ON P.CategoryID = C.CategoryID
WHERE P.UnitPrice = (SELECT MAX(UnitPrice) FROM Products);*/







/*SELECT O.OrderID, O.ShipName, O.ShipAddress, S.CompanyName as ShippingCompanyName
FROM Orders O
INNER JOIN Shippers S ON O.ShipVia = S.ShipperID
WHERE O.ShipCountry = 'Germany';*/








/*SELECT O.OrderID, O.OrderDate, O.ShipName, O.ShipAddress
FROM Orders O
INNER JOIN `order details` OD ON O.OrderID = OD.OrderID
INNER JOIN Products P ON OD.ProductID = P.ProductID
WHERE P.ProductName = 'Sasquatch Ale';*/










