<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Manager</title>
<style>
.div1{
text-align:center;
}
.div2{
text-align:center;
}
.div3{
text-align:center;
}
.table{
margin-left: auto;
margin-right: auto;
}
</style>
</head>
<body>

<div class="div1"><h1>Customer Manager</h1><br>
         <form action="/searchCustomer">
         <input type="number" name="id" placeholder="Enter Customer ID" required="required">
         <input type="submit" value="search">
         </form><br>
         <c:set var="customer" value="${customer}" />
         <c:if test="${customer!=null}">
           <table border="1" class="table">
        <tr>
        <th>Id</th>
        <th>Name</th>
        <th>E-mail</th>
        <th>Address</th>
        </tr>
        <tr>
        <td>${customer.getId()}</td>
        <td>${customer.getName()}</td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getAddress()}</td>
        </tr>
           </table>
           </c:if>
 </div><br>
 <div class="div2">
    <a href="/AddCustomer.jsp"><h2>New Customer</h2></a>
 </div><br>
 <div class="div3">
 <table border="1" class="table">
 <tr>
 <th> ID</th>
 <th> Name</th>
 <th> E-mail</th>
 <th> Address</th>
 <th> Action</th>
 </tr>
 <c:forEach var="list" items="${result }" >
 <tr>
 <td>${list.getId()}</td>
 <td>${list.getName()}</td>
 <td>${list.getEmail()}</td>
 <td>${list.getAddress()}</td>
 <td><a href="/EditCustomer.jsp?id=${list.getId()}">Edit</a> <a href="/deleteCustomer/${list.getId()}">Delete</a></td>
 </tr>
 </c:forEach>
 </table>
 </div>
        
</body>
</html>