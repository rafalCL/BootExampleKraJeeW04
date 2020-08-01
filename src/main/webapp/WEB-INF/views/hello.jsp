<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <%@include file="jspf/cssStyleImport.jspf"%>

    <title>Hello</title>
</head>
<body>
<p class="yellow"><spring:message code="hello.welcome"/> ${name}!</p>
</body>
</html>
