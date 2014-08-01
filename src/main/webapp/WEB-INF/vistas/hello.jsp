<%@ include file="/WEB-INF/vistas/include.jsp" %>
<html>
    <head><title><ftm:message key="title"/></title></head>
    <body>
        <h1><ftm:message key="heading"/></h1>
        <p>ftm:message key="greeting"/> <c:out value="${modelo.now}"/></p>
        <h3>Productos</h3>
        <c:forEach items="${modelo.productos}" var="prod">
            <c:out value="${prod.descripcion}"/> <i>$<c:out value="${prod.precio}"/></i><br><br>
        </c:forEach>
    </body>
</html>