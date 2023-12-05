<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Details</title>
    <style>
        /* Add any additional styles as needed */
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>All Submitted Details</h2>

    <%-- Display success message if available --%>
    <c:if test="${not empty successMessage}">
        <p style="color: green;">${successMessage}</p>
    </c:if>
    
    <table>
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

    <!-- Buttons to view different sets of data -->
    <button onclick="displayAllData()">Display All Data</button>
    <button onclick="displayProductDetails()">Display Product Details</button>
    <button onclick="displayAllInsertedData()">Display All Inserted Data</button>

    <!-- Button to view the entire table on a new page -->
    <form action="AllTableDetails.jsp" method="get" target="_blank">
        <input type="submit" value="View Entire Table">
    </form>

    <script>
        // Previous JavaScript functions remain unchanged
        // ...
    </script>
</body>
</html>
