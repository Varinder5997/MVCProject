
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Add new Patient</title>
</head>
<body>

<%@page import ="com.mindtree.kalingahospital.entity.KalingaHospital" %>
    <div align="center">
        <h1>Add New Patient</h1>
        <br />
        <form:form action="/save" method="POST"  modelAttribute="hospital">
 			
            <table border="0" cellpadding="10">
				<tr>
					<td>Patient Name:</td>
					<td><form:input path="patientName" /></td>
				</tr>

				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>                            
            </table>
        </form:form>
    </div>
</body>
</html>