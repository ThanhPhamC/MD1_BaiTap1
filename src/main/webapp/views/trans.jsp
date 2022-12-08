<%--
  Created by IntelliJ IDEA.
  User: phamthanh
  Date: 08/12/2022
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/TransferController/result" method="post">
<select name="money" >
    <option value="1">usd</option>
    <option value="2">vnd</option>
</select>
<input type="text" name="quantity" placeholder="input your quantity">
    <input type="submit">
</form>
<p>Resutl : ${resultView}</p>
</body>
</html>
