<%--
  Created by IntelliJ IDEA.
  User: Searcher
  Date: 20.09.2022
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/templates/css/style.css">
    <script src="${pageContext.request.contextPath}/templates/scripts/input-validation.js"></script>
</head>
<body>
<h2>Calculator</h2>
<form action="${pageContext.request.contextPath}/calculator-servlet" method="post">
    <input type="text" name="number1" class="input-number" value="${number1}">
    <select name="select-operation">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="text" name="number2" class="input-number" value="${number2}">
    =
    <input type="text" name="result" disabled value="${result}">
    <button>Calculate</button>
    <script>
        document.querySelector("option[value='${op}']").selected = true;
    </script>
</form>
<jsp:include page="footer.jsp"/>
</body>
</html>
