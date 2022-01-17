<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Customer</title>
<style>
.div{
text-align:center;
}
.table{
margin-left: auto;
margin-right: auto;
}
</style>
</head>
<body>
<div class="div">
<h1>Edit Customer</h1><br><br>
        <form action="/editCustomer">
           <table border="1" class="table">
        <tr>
        <th>Name</th>
        <th>E-mail</th>
        <th>Address</th>
        </tr>
        <tr>
        <td><input type="text" name="name" required="required"></td>
        <td><input type="email" name="email" required="required"></td>
        <td><input type="text" name="address" required="required"></td>
        </tr>
           </table>
           <input type="hidden" name="id" value="<%=request.getParameter("id") %>" >
           <input type="submit" value="Edit">
           </form>
            <form action="/CustomerManager" method="get"><input type="submit" value="Back"></form>
           </div>
           
</body>
</html>