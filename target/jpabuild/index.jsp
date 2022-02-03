<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestion d'employe</title>
</head>
<style>
    @import url(https://fonts.googleapis.com/css?family=Roboto:300);

    .login-page {
        width: 360px;
        padding: 8% 0 0;
        margin: auto;
        font-family: "Roboto", sans-serif;
    }
    .button {
        font-family: "Roboto", sans-serif;
        text-transform: uppercase;
        outline: 0;
        background: #0a317d;
        width: 100%;
        border: 0;
        padding: 15px;
        color: #ffffff;
        font-size: 14px;
        -webkit-transition: all 0.3 ease;
        transition: all 0.3 ease;
        cursor: pointer;
        display: block;
    }
    .button:hover,
    .button:active,
    .button:focus {
        background: #43a047;
    }

</style>
<body>
<div class="login-page">
    <center>
        <h1>Gestion d'employés</h1>
        <a class="button" href="${pageContext.servletContext.contextPath}/login">login</a>
    </center>
</div>
</body>
</html>