<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success</title>
</head>
<body>
    <h2>Data successfully added to the database!</h2>

    <!-- Button to view details -->
    <form action="viewDetails.jsp" method="get">
        <input type="submit" value="View Details">
    </form>

    <!-- Display a table with all submitted data -->
    <h3>All Submitted Data:</h3>
    <table border="1">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Product Cost</th>
                <th>Made In</th>
                <th>Company</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="product" items="${allProducts}">
                <tr>
                    <td>${product.product_id}</td>
                    <td>${product.product_name}</td>
                    <td>${product.product_cost}</td>
                    <td>${product.made_in}</td>
                    <td>${product.company}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
