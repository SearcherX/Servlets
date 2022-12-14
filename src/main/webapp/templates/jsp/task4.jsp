<%--
  Created by IntelliJ IDEA.
  User: Searcher
  Date: 20.09.2022
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Task4</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/templates/css/style.css">
</head>
<body>
<h2>Text analysis</h2>
<form action="${pageContext.request.contextPath}/task4-servlet" method="post">
    Введите текст:<input type="text" name="txt" value="${txt}">
    <button>Submit</button>
    <div class="result-container">
        <div>
            <div>
                <span>Количество гласных =</span>
                <input type="text" name="vowelsNumber" disabled
                       value="${vowelsNumber}">
                Список:
                <select>
                    <c:forEach var="item" items="${sessionScope.vowels}">
                        <option><c:out value="${item}"/></option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <span>Количество согласных =</span>
                <input type="text" name="consonantsNumber" disabled
                       value="${consonantsNumber}">
                Список:
                <select>
                    <c:forEach var="item" items="${sessionScope.consonants}">
                        <option><c:out value="${item}"/></option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <span>Количество знаков =</span>
                <input type="text" name="punctuationMarksNumber" disabled
                       value="${punctuationMarksNumber}">
                Список:
                <select>
                    <c:forEach var="item" items="${sessionScope.punctuationMarks}">
                        <option><c:out value="${item}"/></option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </div>
</form>
<jsp:include page="footer.jsp"/>
</body>
</html>
