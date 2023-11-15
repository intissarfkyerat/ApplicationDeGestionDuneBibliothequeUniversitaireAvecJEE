<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
     <%@page import="org.eclipse.bean.Loans" %>
     <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Loans</title>
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
            <header>Update Loans</header>
            <form  method="post" action="modifierl">
            <% Loans loan=(Loans)request.getAttribute("loan"); %>
               <div class="field">
               <span></span>
                  <input type="text" name="id"  size="45" value="${ loan.id}" />
               </div>
               <div class="field">
               <span></span>
                  <input type="text" name="codel"  size="45" value="${ loan.codel}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" name="codead" size="45" value="${ loan.codead}"  />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" name="datel"  size="45" value="${ loan.datel}" />
               </div>
               <div class="field">
                  <span></span>
                  <input type="text"  name="dateb"  size="45" value="${ loan.dateb}" />
               </div>
               
                
               <div class="field">
                  <input type="submit" value="Update Loans" name="action">
               </div>
            </form>
            <div class="signup">
            <c:url value="/consulterl" var="l1"/>
            Do you want to go <a href="${ l1 }">back?</a>
            </div>
            
         </div>
      </div>
     
</body>
</html>