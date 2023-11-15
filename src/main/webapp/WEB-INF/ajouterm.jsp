<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Member</title>
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
            <header>Add Member</header>
            <form  method="post" action="ajouterm">
               <div class="field">
               <span></span>
                  <input type="text" required placeholder="First Name" name="nom">
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="Last Name" name="prenom">
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="Email" name="mail">
               </div>
               <div class="field">
                  <span></span>
                  <input type="text" required placeholder="Teacher Or Student" name="profil">
               </div>
               <div class="field">
                  <span></span>
                  <input type="password" required placeholder="Password" name="pwd">
               </div>
               
               <div class="field">
                  <input type="submit" value="Add Member" name="action">
               </div>
            </form>
            <div class="signup">
            <c:url value="/member" var="l1"/>
            Do you want to go <a href="${ l1 }">back?</a>
            </div>
            
         </div>
      </div>
     
</body>
</html>