<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/templates/css/style.css">
</head>
<body>
<h2>Home work:</h2>
<ul>
    <li><a href="quote-servlet">Task N1. Linus Torvalds quote</a></li>
    <li><a href="task2-servlet">Task N2-3. Calculate max, min, avg</a></li>
    <li><a href="task4-servlet">Task N4. Text analysis</a></li>
    <li><a href="calculator-servlet">Task N5. Calculator</a></li>
</ul>
<jsp:include page="templates/jsp/footer.jsp"/>
</body>
</html>