<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
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
        <h1>Add Customer</h1><br><br>
         <c:set var="result" value="${result}" />
         <c:if test="${result!=null}">
           ${result}
         </c:if>
        <form action="addCustomer" method="post">
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
        </table><br>
        <input type="submit" value="Add" >
        <input type="reset" value="Reset">
        </form>
        <form action="/CustomerManager" method="get"><input type="submit" value="Back"></form>
        </div>
        
</body>
</html>