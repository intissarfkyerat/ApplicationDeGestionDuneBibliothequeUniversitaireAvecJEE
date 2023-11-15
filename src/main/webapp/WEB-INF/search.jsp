<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
     <%@ page import="java.util.List" %>
       <%@ page import="org.eclipse.bean.Livre" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search a Book</title>
<link rel="icon" href="images/icon.jpg" type="image/x-icon">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link rel="stylesheet" href="style5 .css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
span{
  color: #F5B041;
}
img{
  height: 25px;
  width: 80px;
}
.topnav input[type=text] {
  float: right;
  padding: 6px;
  
  margin-top: 8px;
  margin-right: 16px;
  font-size: 17px;
}
@media screen and (max-width: 600px) {
  .topnav a, .topnav input[type=text] {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
.topnav input[type=text] {
    border: 1px solid #fff;
  }
</style>
</head>
<body>
<div class="w3-sidebar w3-light w3-bar-block" style="width:160px">
        <h3 class="w3-bar-item">LIB<span>RARY.</span></h3>
        <c:url value="/search" var="l2" />
        <a href="${ l2 }" class="w3-bar-item w3-button">Search a Book</a>
        <a href="Home.jsp" class="w3-bar-item w3-button">Log out</a>
</div>
<div style="margin-left:20%">
  <div>
    <form method="post" action="search" >
    <div class="topnav">
    <input type="text" placeholder="Search a book..." name="mc">
    </div>
    </form>
   </div> 
   <div class="container">
              <h2></h2>
              <p></p>            
              <table class="table">
              <thead>
              <tr>
              <th>Coded book</th>
              <th>Title</th>
              <th>language</th>
              <th>Author</th>
              <th>Price</th>
              <th>Booking Book</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach var="livre" items="${requestScope.livres}">
              <tr>
              <td>${ livre.code}</td>
              <td>${ livre.titre }</td>
              <td>${ livre.langue }</td>
              <td>${ livre.auteur }</td>
              <td>${ livre.prix }</td>
              <td><a href="booking?action=reserver&code=${livre.code}&titre=${livre.titre}&langue=${livre.langue}&auteur=${livre.auteur}&prix=${livre.prix}"><img src="images/téléchargement.png"></a></td>
              </tr>
              </c:forEach>
            </tbody>
            </table>
   </div>
</div>
</body>
</html>