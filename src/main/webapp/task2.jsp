<%--
  Created by IntelliJ IDEA.
  User: Searcher
  Date: 20.09.2022
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task2-3</title>
    <link rel="stylesheet" href="style.css">
    <script src="input-validation.js"></script>
</head>
<body>
<h1>Task2-3</h1>
<form action="task2-servlet" method="post">
    <input type="text" name="number1" class="input-number" value="${number1}">
    <input type="text" name="number2" class="input-number" value="${number2}">
    <input type="text" name="number3" class="input-number" value="${number3}">
    <button>Submit</button>
    <div class="result-container">
        <div>
            <div>min=<input type="text" name="min" disabled value="${min}"></div>
            <div>max=<input type="text" name="max" disabled value="${max}"></div>
            <div>avg=<input type="text" name="avg" disabled value="${avg}"></div>
        </div>
    </div>
</form>
</body>
</html>
