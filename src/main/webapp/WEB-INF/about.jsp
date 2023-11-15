<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style2.css">
<script src="https://kit.fontawesome.com/dbed6b6114.js" ></script>
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
<section>
            <div class = "image">
               <img src="images/bib.jpg">
            </div>

            <div class = "content">
                <h2>About Us</h2>
                <span><!-- line here --></span>
                <p>Consciente de l’importance de faciliter, à la commu­nauté universitaire, l’accès aux ressources et services documentaires nécessaires à l’enseignement et à la recherche, l’UIT s’est dotée, au cœur de son campus, d’une bibliothèque universitaire centrale.
Construite sur une superficie de plus de cinq mille mètres carrés (5000 m2) sur quatre niveaux, cette structure joue également un rôle primordial de dévelop­ pement social et culturel non seulement dans la vie de
l’UIT mais également dans celle de la ville. Elle constitue un lieu de travail, d’études, de recherches, de rencontres, d’ouverture, de culture et de convivialité.</p>
               
                <ul class = "icons">
                    <li>
                        <i class = "fa fa-twitter"></i>
                    </li>
                    <li>
                        <i class = "fa fa-facebook"></i>
                    </li>
                </ul>
            </div>
        </section><br><br>
</div>
</body>
</html>