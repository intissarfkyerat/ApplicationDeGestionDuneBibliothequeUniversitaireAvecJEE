<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
     <%@ page import="java.util.List" %>
     <%@page import="org.eclipse.bean.Livre" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consult New Books</title>
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
  height: 16px;
  width: 16px;
}
</style>
</head>
<body>
<div class="w3-sidebar w3-light w3-bar-block" style="width:160px">
        <h3 class="w3-bar-item">LIB<span>RARY.</span></h3>
        <c:url value="/ajouterb" var="l1" />
        <a href="${ l1 }" class="w3-bar-item w3-button">Add Book</a>
        <c:url value="/consulterb" var="l2" />
        <a href="${ l2 }" class="w3-bar-item w3-button">Consult Book</a>
        <c:url value="/consulterpb" var="l3" />
        <a href="${ l3 }" class="w3-bar-item w3-button">Consult Popular Book</a>
        <c:url value="/consulterbm" var="l5" />
        <a href="${ l5 }" class="w3-bar-item w3-button">Consult the book the least borrowed</a>
        <c:url value="/livre" var="l4" />
        <a href="${ l4 }" class="w3-bar-item w3-button">back</a>
</div>
<div style="margin-left:15%">
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
              </tr>
              </thead>
              <tbody>
              <c:forEach var="l" items="${ requestScope.livres }">
              <tr>
              <td>${ l.code}</td>
              <td>${ l.titre }</td>
              <td>${ l.langue }</td>
              <td>${ l.auteur }</td>
              <td>${ l.prix }</td>
              </tr>
              </c:forEach>
            </tbody>
            </table>
   </div>
 </div>

</body>
</html>