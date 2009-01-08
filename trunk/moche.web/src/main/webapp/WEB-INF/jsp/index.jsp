<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Moche</title>
    </head>
    <body>
        <div id="header">
            Tutaj miejsce na logo aplikacji/firmy itp...
        </div>
        <div id="pageContent">
            <div id="indexLeft">
                informacje jakies, staty czy cos...
            </div>
            <div id="indexCenter">
                <div id="news">
                    <c:forEach var="item" items="${news}">
                        <div class="newsItem">
                            <span>Data: 21 listopada 2008</span>
                            <span>Tytul niusa</span>
                            <span>
                                Zajawka Zajawka Zajawka Zajawka Zajawka Zajawka
                                Zajawka Zajawka Zajawka Zajawka Zajawka Zajawka
                                Zajawka Zajawka Zajawka Zajawka Zajawka Zajawka
                            </span>
                            <span class="itemLink"><a href="#">Więcej...</a></span>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <div id="indexRight">
                <form action="" method="post">
                    <fieldset>
                        <label for="login">Login:</label>
                        <input type="text" id="login" name="login" size="25"/><br/>
                        <label for="password">Hasło:</label>
                        <input type="password" id="password" name="password" size="25"/><br/>
                        <input type="submit" value="Zaloguj">
                    </fieldset>
                </form>
            </div>
        </div>
        <div id="footer">
            2008 &copy; Copyright by jjcreation.com. | <a href="#">Link 1</a> | <a href="#">Link 2</a>
        </div>
    </body>
</html>
