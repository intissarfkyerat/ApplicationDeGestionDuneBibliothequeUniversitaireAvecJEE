<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Management</title>
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
   
        
        <c:url value="/ajouterm" var="l2" />
        <li><a href="${ l2 }">Add Member</a></li>
         <c:url value="/consulterm" var="l5" />
        <li><a href="${ l5 }">Consult Member</a></li>
      </ul>
      <div class="buttons">
        <c:url value="/index" var="l6" />
        <a href="${ l6 }" class="login">Back</a>
      </div>
    </nav>
    <div class="content">
      <h2>Hello,<br>It's Member<span>Management</span> </h2>
      <p><br></p>
    </div>
    <div class="link">
    </div>
  </div>
</body>
</html>