<%--
  Created by IntelliJ IDEA.
  User: Moonlight
  Date: 07-09-2021
  Time: 19:20
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of Products</title>
</head>

<body>

<table border="1">
    <th>name</th>
    <th>price</th>
    <th>sku</th>
    <g:each in="${allProducts}" var="thisProduct">
        <tr>
            <td>${thisProduct.name}</td>
            <td>${thisProduct.price}</td>
            <td>${thisProduct.sku}</td>
        </tr>
    </g:each>
</table>
</body>
</html>