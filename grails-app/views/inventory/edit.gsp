<%--
  Created by IntelliJ IDEA.
  User: Moonlight
  Date: 07-09-2021
  Time: 18:15
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Inventory</title>
</head>

<body>
<form>
    Product:<label>
    <input type="text" size="40" name="product" value="${product}" />
</label>

    <p>SKU: <label>
        <input type="text" name="sku" value="${sku}" />
    </label></p>
</form>
</body>
</html>