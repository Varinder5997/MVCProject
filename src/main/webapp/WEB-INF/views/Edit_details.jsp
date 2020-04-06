<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Edit Patient Details</title>
</head>
<body>
	<div align="center">
		<h1>Edit Product</h1>
		<br />
		<form:form action="/save" method="POST" modelAttribute="hospital">
			<table border="0" cellpadding="10">
				<tr>
					<td>Patient ID:</td>
					<td><form:input path="patientId"  readonly="true" /></td>
				</tr>
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
>
