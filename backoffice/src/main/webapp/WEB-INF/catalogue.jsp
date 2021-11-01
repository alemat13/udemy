<%-- 
    Document   : catalogue
    Created on : 28 oct. 2021, 21:59:54
    Author     : alema
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul>
    <c:forEach items="${catalog}" var="w">
        <li><b>${w.mainArtist.name}</b> - ${w.title} (${w.release})</li>
    </c:forEach>
</ul>