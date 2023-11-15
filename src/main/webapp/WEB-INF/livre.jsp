<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Management</title>
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
   
        
        <c:url value="/ajouterb" var="l2" />
        <li><a href="${ l2 }">Add Book</a></li>
         <c:url value="/consulterb" var="l5" />
        <li><a href="${ l5 }">Consult Book</a></li>
        <c:url value="/consulterpb" var="l7" />
        <li><a href="${ l7 }">Consult Popular books</a></li>
        <c:url value="/consulterbm" var="l8" />
        <li><a href="${ l8 }">Consult the book the least borrowed</a></li>
      </ul>
      <div class="buttons">
        <c:url value="/index" var="l6" />
        <a href="${ l6 }" class="login">Back</a>
      </div>
    </nav>
    <div class="content">
      <h2>Hello,<br>It's Book<span>Management</span> </h2>
      <p><br></p>
    </div>
    <div class="link">
    </div>
  </div>
</body>
</html>