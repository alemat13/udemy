<%-- 
    Document   : work-details.jsp
    Created on : 29 oct. 2021, 13:29:35
    Author     : alema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Détail de l'oeuvre</title>
    </head>
    <body>
        <form method="post" action="addToCart">
            <h1>${work.title}</h1>
            <p>${work.mainArtist.name}</p>
            <p>Genre : ${work.genre}</p>
            <p>Release : ${work.release}</p>
            <p>Summary : ${work.summary}</p>
            <input type="hidden" name="id" value="${work.id}">
            <input type="submit" value="Ajouter au caddie">
        </form>
    </body>
</html>
