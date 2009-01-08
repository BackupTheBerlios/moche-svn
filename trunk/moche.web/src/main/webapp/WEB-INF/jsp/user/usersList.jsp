<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista uzytkownikow</h1>
        <display:table id="user" name="${usersList}" class="dataTable">
            <display:column title="Lp." class="rowNumber" headerClass="rowNumber">
                <c:out value="${user_rowNum}"/>
            </display:column>
            <display:column title="IssueID">
                <c:out value="${user.userId}"/>
            </display:column>
            <display:column title="Podsumowanie">
                <c:out value="${user.email}"/>
            </display:column>
            <display:column title="">
                <a href="<c:url value="/users/delete.html?userId=${user.userId}"/>">Delete</a>
            </display:column>
        </display:table>
    </body>
</html>
