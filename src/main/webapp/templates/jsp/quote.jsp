<%--
  Created by IntelliJ IDEA.
  User: Searcher
  Date: 20.09.2022
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Linus Torvalds quote</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/templates/css/style.css">
</head>
<body>
<h2>Linus Torvalds quote</h2>
<div>
  <button>Show quote</button>
  <q class="hide">Bad programmers worry about the code. Good programmers
      worry about data structures and their relationships</q>
</div>
<script>
    document.querySelector("button").addEventListener('click', () => {
        document.querySelector("q").classList.toggle("hide")
    })
</script>
<jsp:include page="footer.jsp"/>
</body>
</html>
