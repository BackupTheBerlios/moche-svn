<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Moche > Dashboard</title>
    </head>
    <body>
        <div id="header">
            Tutaj miejsce na logo aplikacji/firmy itp...
        </div>
        <div id="topMenu">
            <ul>
                <li><a href="/dashboard.html">Dashboard</a></li>
                <li><a href="/issuesList.html">Issues</a></li>
                <li><a href="/info.html">Informacje</a></li>
                <li><a href="/help.html">Pomoc</a></li>
            </ul>
            <form action="">
                <label for="bugId">Numer błędu</label>
                <input id="bugId" name="bugId" type="text" size="20"/>
                <input type="submit" value="przejdz"/>
            </form>
        </div>
        <div id="pageContent">
            <table>
                <c:forEach var="issue" items="${issues}">
                    <tr>
                        <td class="tit"><c:out value="${issue.issueId}"/></td>
                        <td><fmt:formatDate value="${issue.createDate}" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td class="bod"><c:out value="${issue.summary}" escapeXml="false"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div id="footer">
            2008 &copy; Copyright by jjcreation.com. | <a href="#">Link 1</a> | <a href="#">Link 2</a>
        </div>
    </body>
</html>
