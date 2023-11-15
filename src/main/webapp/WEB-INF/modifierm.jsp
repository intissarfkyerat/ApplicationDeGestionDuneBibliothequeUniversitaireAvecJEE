<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    <%@page import="org.eclipse.bean.Personne" %>
     <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Member</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style4.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
<style>
<style>
span{
  color: #F5B041;
}
</style>
</head>
<body>
<div class="bg-img">
         <nav>
         <div class="logo">
        <a href="Home.jsp">LIB<span>RARY.</span></a>
         </div>
         </nav>
         <div class="content">
            <header>Update Member</header>
            <form  method="post" action="modifierm">
            <% Personne personne=(Personne)request.getAttribute("personne"); %>
               <div class="field">
               <span></span>
                  <input type="number"  name="id" size="45" value="${ personne.id}" />
               </div>
               <div class="field">
               <span></span>
                  <input type="text"  name="nom" size="45" value="${ personne.nom}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text"  name="prenom" size="45" value="${ personne.prenom}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text"  name="mail" size="45" value="${ personne.mail}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text"  name="profil" size="45" value="${ personne.profile}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="password"  name="pwd" size="45" value="${ personne.pwd }" />
               </div>
               
               <div class="field">
                  <input type="submit" value="Update Member" name="action">
               </div>
            </form>
            <div class="signup">
            <c:url value="/consulterm" var="l1"/>
            Do you want to go <a href="${ l1 }">back?</a>
            </div>
            
         </div>
      </div>
     

</body>
</html>