<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>LIB</title>
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
   
        <li><a href="Home.jsp">Home</a></li>
        <c:url value="/about" var="l2" />
        <li><a href="${ l2 }">About</a></li>
        <c:url value="/services" var="l3" />
        <li><a href="${ l3 }">Services</a></li>
        <c:url value="/contact" var="l4" />
        <li><a href="${ l4 }">Contact</a></li>
      </ul>
      <div class="buttons">
        <c:url value="/login" var="l5" />
        <a href="${ l5 }" class="login">Log in</a>
      </div>
    </nav>
    <div class="content">
      <h2>Hello,<br>It's Lib<span>RARY Management</span> </h2>
      <p><br></p>
    </div>
    <div class="link">
    <c:url value="/sign" var="l6" />
    <a href="${ l6 }" class="hire">Sing up</a>
    </div>
  </div>
</body>
</html>

    