<%--
  Created by IntelliJ IDEA.
  User: lihaiyang
  Date: 16/1/26
  Time: 下午2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的音乐</title>
</head>
<body>
<c:forEach items="${musics}" var="m">
    <tr>
        <td>${m.id}</td>
        <td>${m.name}</td>
        <td>${m.author}</td>
        <td>${m.url}</td>
    </tr>
</c:forEach>

</body>
</html>
