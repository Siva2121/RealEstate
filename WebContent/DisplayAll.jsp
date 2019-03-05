<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <table>
  <thead>
  <tr>
  <th>flatNumber</th>
  <th>area</th>
  <th>district</th>
  <th>length</th>
  <th>ownerName</th>
  <th>amount</th>
  <th>contactNumber</th>
  </tr>
  </thead>
  <tbody>
 <tr>
   <c:forEach var="estate" items ="${realestate}">
  <td>${estate.flatNumber}</td>
  <td>${estate.area} </td>
  <td>${estate.district}</td>
  <td>${estate.length}</td>
  <td>${estate.ownerName}</td>
  <td>${estate.amount}</td>
  <td>${estate.contactNumber}</td> 
 <tr>
  </c:forEach>
  </tbody>
  </table>
<br><a href="Home.jsp">HOME</a>
</body>
</html>