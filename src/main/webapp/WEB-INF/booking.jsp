<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    <%@page import="org.eclipse.bean.Livre" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking a Book</title>
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
            <header>Booking a Book</header>
            <form  method="post" action="booking">
            <% Livre l= (Livre)request.getAttribute("l"); %>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="Codead book" name="code" size="45" value="${ livre.code}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="TitLe " name="titre" size="45" value="${ livre.titre }" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="Languge" name="langue" size="45" value="${livre.langue}"  />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="Author" name="auteur" size="45" value="${livre.auteur}" />
               </div>
               <div class="field space">
                  <span></span>
                  <input type="text"  required placeholder="Price" name="prix" size="45" value="${livre.prix}" />
               </div>
               <div class="field">
                  <input type="submit" value="Booking Book" name="action">
               </div>
            </form>
            <div class="signup">
            <c:url value="/search" var="l1"/>
            Do you want to go <a href="${ l1 }">back?</a>
            </div>
            
         </div>
      </div>
     
</body>
</html>