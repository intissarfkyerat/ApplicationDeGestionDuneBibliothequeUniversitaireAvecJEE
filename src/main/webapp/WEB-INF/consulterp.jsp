<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
     <%@ page import="java.util.List" %>
     <%@page import="org.eclipse.bean.Penality" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consult Penalty</title>
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
        <c:url value="/ajouterp" var="l1" />
        <a href="${ l1 }" class="w3-bar-item w3-button">Add Penalty</a>
        <c:url value="/penalite" var="l4" />
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
              <th>Coded Penalty</th>
              <th>Coded Member</th>
              <th>Penalty</th>
              <th>Update</th>
              <th>Remove</th>
              </tr>
              </thead>
              <tbody>
               <c:forEach var="l" items="${ requestScope.penalite }">
              <tr>
              <td>${ l.id }</td>
              <td>${ l.codepe }</td>
              <td>${ l.codead }</td>
              <td>${ l.penalite }</td>
              <td><a href="consulterp?action=modifier&id=${l.id}&codepe=${l.codepe}&codead=${l.codead}&penalite=${l.penalite}"><img src="images/pen.png"></a></td>
              <td><a href="consulterp?action=Supprimer&id=${l.id}"><img src="images/trash.png"></a></td>
              </tr>
              </c:forEach>
            </tbody>
            </table>
            </div>
 </div>
</body>
</html>