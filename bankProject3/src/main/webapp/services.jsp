<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<center><h1><b>${bank.getName()}</b></h1></center>

<%int i=1; %>>

<table border="2">
<tr>
<th>S.No.</th>
<th>SERVICE</th>
</tr>
<c:forEach var="list" items="${bank.getService()}">
<tr>
  <td><%=i %></td>
  <td>${list}</td>
 </tr>
 <%i++; %>>
 </c:forEach>    
 </table>
 

</body>
</html>