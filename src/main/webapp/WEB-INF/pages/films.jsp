<%--
  Created by IntelliJ IDEA.
  User: Tatiana
  Date: 22.02.2021
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FILMS</title>
</head>
<body>

<h2>Films</h2>
<table>

    <tr>
        <th>id</th>
        <th>title</th>
        <th>year</th>
        <th>genre</th>
        <th>action</th>
    </tr>

        <c:forEach var="film" items="${filmsList}">
            <tr>
            <td>${film.id}</td>
            <td>${film.title}</td>
            <td>${film.year}</td>
            <td>${film.genre}</td>
                <td>
                    <a href="/edit/${film.id}">edit</a>
                    <a href="/delete/${film.id}">delete</a>
                </td>
    </tr>
    </c:forEach>
</table>

<h2><a href="/edit">edit page</a></h2>
</body>
</html>
