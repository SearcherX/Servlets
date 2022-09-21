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
    <style>
        body {
            margin: 0;
            font-family: sans-serif;
            background-color: #fbf2e9;
        }

        div {
            padding: 1em;
            height: calc(100vh - 2em);
        }

        button {
            font-size: inherit;
        }

        q {
            display: block;
            margin-top: 1em;
        }

        .hide {
            display: none;
        }
    </style>
</head>
<body>
<h1>Linus Torvalds quote</h1>
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
</body>
</html>
