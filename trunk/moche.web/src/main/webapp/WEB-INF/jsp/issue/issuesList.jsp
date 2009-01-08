<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Lista błędów</title>
    </head>
    <body>
        <display:table id="issue" name="${issuesList}" class="dataTable">
            <display:column title="Lp." class="rowNumber" headerClass="rowNumber">
                <c:out value="${issue_rowNum}"/>
            </display:column>
            <display:column title="IssueID">
                <c:out value="${issue.issueId}"/>
            </display:column>
            <display:column title="Podsumowanie">
                <c:out value="${issue.summary}"/>
            </display:column>
            <display:column title="Data utworzenia">
                <c:out value="${issue.createDate}"/>
            </display:column>
        </display:table>
    </body>
</html>
