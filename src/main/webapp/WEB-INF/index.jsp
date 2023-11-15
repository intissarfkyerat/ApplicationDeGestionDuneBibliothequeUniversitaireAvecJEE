<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <nav>
      <div class="logo">
        <a href="Home.jsp">LIB<span>RARY.</span></a>
      </div>
      <ul>
       
        <c:url value="/livre" var="l3" />
        <li><a href="${ l3 }">Book</a></li>
        <c:url value="/loans" var="l4" />
        <li><a href="${ l4 }">Loans</a></li>
        <c:url value="/penalite" var="l5" />
        <li><a href="${ l5 }">Penalty</a></li>
        <c:url value="/member" var="l6" />
        <li><a href="${ l6 }">Member</a></li>
      </ul>
      <div class="buttons">
        <a href="Home.jsp" class="login">Log out</a>
      </div>
    </nav>
    <div class="content">
      <h2>Hello, Admin <br>It's Lib<span>RARY Management</span><br></h2>
      <p><br></p>
    </div>
  </div>
</body>
</html>