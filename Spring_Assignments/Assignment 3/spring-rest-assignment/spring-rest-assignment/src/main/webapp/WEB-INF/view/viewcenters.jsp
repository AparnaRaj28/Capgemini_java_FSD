<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
     <th>Center id</th>
     <th>Center Address</th>
      <th>Center pincode</th>
      <th>Center district</th>
      <th>Center state</th>
</tr>
<c:forEach items="${centerList}" var="center">
<tr>
     <!--  <td>${center.getCenter_id()}</td>-->
     <td>${center.center_id}</td>
     <td>${center.getCenter_address()}</td>
      <td>${center.getCenter_pincode()}</td>
      <td>${center.getCenter_district()}</td>
      <td>${center.getCenter_state()}</td>
</tr>  
</c:forEach>
</table>
</body>
</html>