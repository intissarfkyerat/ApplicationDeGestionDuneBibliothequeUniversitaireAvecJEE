<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style4.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
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
            <header>Sing Up Form</header>
            <form  method="post" action="sign">
               <div class="field">
                  <span class="fa fa-user"></span>
                  <input type="text" required placeholder="First Name" name="nom">
               </div>
               <div class="field">
                  <span class="fa fa-user"></span>
                  <input type="text" required placeholder="Last Name" name="prenom">
               </div>
               <div class="field">
                  <span class="fa fa-user"></span>
                  <input type="text" required placeholder="Email" name="mail">
               </div>
               <div class="field">
                  <span class="fa fa-user"></span>
                  <input type="text" required placeholder="Teacher or Student" name="profile">
               </div>
               <div class="field space">
                  <span class="fa fa-lock"></span>
                  <input type="password" class="pass-key" required placeholder="Password" name="pwd">
                  <span class="show">SHOW</span>
               </div>
               
               <div class="field">
                  <input type="submit" value="SIGN UP">
               </div>
            </form>
            <div class="signup">
            Do you want to go <a href="Home.jsp">back?</a>
            </div>
            
         </div>
      </div>
      <script>
         const pass_field = document.querySelector('.pass-key');
         const showBtn = document.querySelector('.show');
         showBtn.addEventListener('click', function(){
          if(pass_field.type === "password"){
            pass_field.type = "text";
            showBtn.textContent = "HIDE";
            showBtn.style.color = "#F5B041";
          }else{
            pass_field.type = "password";
            showBtn.textContent = "SHOW";
            showBtn.style.color = "#F5B041";
          }
         });
      </script>


</body>
</html>