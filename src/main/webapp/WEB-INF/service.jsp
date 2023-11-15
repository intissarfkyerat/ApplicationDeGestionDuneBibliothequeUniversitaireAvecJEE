<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style3.css" />
<style>
span{
  color: #F5B041;
}
</style>
</head>
<body>
<div class="w3-sidebar w3-light w3-bar-block" style="width:160px">
        <h3 class="w3-bar-item">LIB<span>RARY.</span></h3>
        <a href="Home.jsp" class="w3-bar-item w3-button">Home</a>
        <c:url value="/about" var="l2" />
        <a href="${ l2 }" class="w3-bar-item w3-button">About</a>
        <c:url value="/services" var="l3" />
        <a href="${ l3 }" class="w3-bar-item w3-button">Services</a>
        <c:url value="/contact" var="l4" />
        <a href="${ l4 }" class="w3-bar-item w3-button">Contact</a>
        <c:url value="/login" var="l5" />
        <a href="${ l5 }" class="w3-bar-item w3-button">Log in</a>
        <c:url value="/sign" var="l6" />
        <a href="${ l6 }" class="w3-bar-item w3-button">Sing up</a>
</div>
<div style="margin-left:15%">
<div class="u1">OUR SERVICES</div>
       <div class="cont">
        <div class="card1">
        <div><i class="bi bi-book-half" style="font-size:50px;"></i><br><span class="p1">Espace de consultation</span>
        <p class="p2">Espace de consultation des ouvrages et de lecture</p></div>
        </div>
       
        <div class="card1">
        <div><i class="bi bi-file-plus" style="font-size:50px;"></i><br><span class="p1">Exposition</span>
       <p class="p2">Espace d’exposition</p></div>
      </div>
   

     <div class="card1">
      <div><i class="bi bi-file-plus" style="font-size:50px;"></i><br><span class="p1">Média</span>
     <p class="p2">Espace multimedia / médiathèque</p></div>
    </div>

    <div class="card1">
        <div><i class="bi bi-file-plus" style="font-size:50px;"></i><br><span class="p1">Echange</span>
        <p class="p2">Espace de rencontres et d’échanges</p></div>
        </div>
       
        <div class="card1">
        <div><i class="bi bi-file-plus" style="font-size:50px;"></i><br><span class="p1">Enfants</span>
       <p class="p2">Espace enfants</p></div>
      </div>
   
     <div class="card1">
      <div><i class="bi bi-file-plus" style="font-size:50px;"></i><br><span class="p1">Conférences</span>
     <p class="p2">Salle de conférences</p></div>
    </div>
</div>
</div>
</body>
</html>