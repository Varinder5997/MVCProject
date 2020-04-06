<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>

<style>

table{
border-collapse: collapse;

}</style>
</head>
<body>

<%@page import="java.util.ArrayList"%> 
<%@page import ="com.mindtree.kalingahospital.entity.KalingaHospital" %>
<%@page import="java.util.Iterator"%> 
<% ArrayList<KalingaHospital> listProducts = (ArrayList) request.getAttribute("listPatients"); %> 

<div align="center">
    <h1>Kalinga Hospital</h1>
    <a href="/new">Add New Patient</a>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Patient ID</th>
                <th>Patient Name</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <%
		Iterator<KalingaHospital> iterator = listProducts.iterator();  
	
		while(iterator.hasNext())  
		{
			KalingaHospital hospital = iterator.next(); 
		%>
				<tr><td><%=hospital.getPatientId()%></td>
                <td><%=hospital.getPatientName() %></td>
                <td>
                <a href="/edit/<%=hospital.getPatientId() %>  ">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="/delete/<%=hospital.getPatientId()%>">Delete</a>
                </td>
            </tr>
            <%
           	}

		%>
        </tbody>
    </table>
</div>   
</body>
</html>

