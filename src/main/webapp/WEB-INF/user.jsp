<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
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
       
        <c:url value="/search" var="l3" />
        <li><a href="${ l3 }">Search a Book</a></li>
        
      </ul>
      <div class="buttons">
        <a href="Home.jsp" class="login">Log out</a>
      </div>
    </nav>
    <div class="content">
      <h2>Hello, Member <br>It's Lib<span>RARY Management</span><br></h2>
      <p><br></p>
    </div>
  </div>
</body>
</html>