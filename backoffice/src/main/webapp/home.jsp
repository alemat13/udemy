<%-- 
    Document   : home
    Created on : 28 oct. 2021, 21:16:12
    Author     : alema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="js/application.js"></script>
        <title>Online Store</title>
    </head>
    <body>
        <h1>OnlineStore - Gestion de la boutique</h1>
        <c:if test="${not empty user}">Bonjour ${user} <a href="logout">(se déconnecter)</a></br></c:if>
            <a href="add-work-form.html">Ajouter une oeuvre au catalogue</a><br>
            <a href="#" id="show-catalog">Afficher le catalogue</a>
            <div id="catalog"></div>
    </body>
</html>
