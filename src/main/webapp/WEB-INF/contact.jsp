<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style1.css" />
<style>
span{
  color: #F5B041;
}
</style>
<script src="https://kit.fontawesome.com/64d58efce2.js">
</script>
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
 <div class="container">
      
      <div class="form">
        <div class="contact-info">
          <h3 class="title">Contact us</h3>
          <p class="text">
            
          </p>

          <div class="info">
            <div class="information">
             
              <p></p>
            </div>
            <div class="information">
              
              <p></p>
            </div>
            <div class="information">
              
              <p>Adresse : B.P 242, Kénitra - Maroc<br>
                 Kénitra<br>
                 Maroc<br>
                 Tél: 05 37 32 92 00<br>
               </p>
            </div>
          </div>

          <div class="social-media">
            <p>Connect with us :</p>
            <div class="social-icons">
              <a href="https://web.facebook.com/IbnTofail.University/?_rdc=1&_rdr">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="https://twitter.com/univibntofail">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#">
                <i class="fab fa-instagram"></i>
              </a>
              
            </div><br>
          </div>
        </div>

        <div class="contact-form">
          <span class="circle one"></span>
          <span class="circle two"></span>

          <form method="post" action="contact" >
            <h3 class="title">Contact us</h3>
            <div class="input-container">
              <input type="text" name="name" class="input" />
              <label for="">Username</label>
              <span>Username</span>
            </div>
            <div class="input-container">
              <input type="email" name="email" class="input" />
              <label for="">Email</label>
              <span>Email</span>
            </div>
            <div class="input-container">
              <input type="tel" name="phone" class="input" />
              <label for="">Phone</label>
              <span>Phone</span>
            </div>
            <div class="input-container textarea">
              <textarea name="message" class="input"></textarea>
              <label for="">Message</label>
              <span>Message</span>
            </div>
            <input type="submit" value="Send" class="btn" />
          </form>
        </div>
      </div>
    </div>
</div>
    <script src="script.js"></script>

</body>
</html>