<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello JSP</h1>
    <%
        System.out.println("hello world");
    %>
    <%=
        "hello"
    %>
<%--    <%!--%>
<%--       void show();--%>
<%--       String name = "zhangsan "--%>
<%--    %>--%>
<%--    c:if  :  完成逻辑判断,替换JAVA ifelse--%>
    <c:if test="true">
        <h1>Header</h1>
    </c:if>

</body>
</html>
