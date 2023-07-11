<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View Books</title>
        <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>>
                <form action="/loginprocess" method="post">
                    User Name:<input type="text" name="name"/><br/><br/>
                    Password:<input type="password" name="password"/><br/><br/>
                    <input type="submit" value="login"/>"
                </form>
    </body>
</html>