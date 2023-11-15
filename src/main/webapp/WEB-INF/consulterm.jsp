<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    <%@ page import="java.util.List" %>
    <%@page import="org.eclipse.bean.Personne" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consult Member</title>
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
        <c:url value="/ajouterm" var="l1" />
        <a href="${ l1 }" class="w3-bar-item w3-button">Add Member</a>
        <c:url value="/member" var="l4" />
        <a href="${ l4 }" class="w3-bar-item w3-button">back</a>
</div>
<div style="margin-left:15%">
  <div class="container">
              <h2></h2>
              <p></p>            
              <table class="table">
              <thead>
              <tr>
              <th>Id</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Email</th>
              <th>Profile</th>
              <th>Password</th>
              <th>Update</th>
              <th>Remove</th>
              </tr>
              </thead>
              <tbody>
             <c:forEach var="l" items="${ requestScope.personne }">
              <tr>
              <td>${ l.id }</td>
              <td>${ l.nom }</td>
              <td>${ l.prenom }</td>
              <td>${ l.mail }</td>
              <td>${ l.profile }</td>
              <td>${ l.pwd }</td>
             
              <td><a href="consulterm?action=modifier&id=${l.id}&nom=${l.nom}&prenom=${l.prenom}&mail=${l.mail}&profile=${l.profile}&pwd=${l.pwd}"><img src="images/pen.png"></a></td>
              <td><a href="consulterm?action=Supprimer&id=${l.id}"><img src="images/trash.png"></a></td>
              </tr>
             </c:forEach>
            </tbody>
            </table>
            </div>
 </div>
     
</body>
</html>