<%--
  Created by IntelliJ IDEA.
  User: abdelazizbardich
  Date: 1/28/2022
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin dashboard</title>
    <style>
        <%@include file="/WEB-INF/css/style.css"%>
    </style>
</head>
<body class="bg-light">
<div class="container">
    <div class="row align-items-center my-3">
        <div class="col-md">
            <div class="h1">
                List des employee
            </div>
        </div>
        <div class="col-md-auto"><a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/logout">Deconnecxion</a></div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <form class="bg-white rounder border shadow">

            </form>
        </div>
    </div>
</div>
<script>
    <%@include file="/WEB-INF/js/script.js"%>
</script>
</body>
</html>
