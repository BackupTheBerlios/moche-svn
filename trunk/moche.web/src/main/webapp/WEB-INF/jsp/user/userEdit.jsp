<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edycja</h1>
        <form:form commandName="user">
            <fieldset>
                <legend>User data</legend>
                <label for="email">Email</label>
                <form:input path="email" id="email"/><br/>
                <label for="description">Description</label>
                <form:input path="description" id="description"/><br/>
                <input type="submit" value="Save Changes" />
            </fieldset>
        </form:form>
    </body>
</html>
