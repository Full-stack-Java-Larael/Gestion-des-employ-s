<%--
  Created by IntelliJ IDEA.
  User: abdelazizbardich
  Date: 1/17/2022
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Update Employee</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="bg-primary">
<div class="container">
  <div class="justify-content-center py-5">
    <div class="col-auto m-auto"><h1 class="text-white">Update Employee</h1></div>
    <div class="col-md-12">
      <div class="card p-3">
        <form action="${pageContext.servletContext.contextPath}/update" method="post">
          <input value="${employee.getIdUser()}" required name="id" hidden>
          <div class="row">
            <div class="form-group col-md-4">
              <label for="email">Email:</label>
              <input class="form-control" value="${employee.getEmail()}" type="email" name="email" placeholder="Email..." id="email"/>
            </div>
            <div class="form-group col-md-4">
              <label for="first_name">First name:</label>
              <input class="form-control" type="text" value="${employee.getFirstName()}" name="first_name" placeholder="First name..." id="first_name"/>
            </div>
            <div class="form-group col-md-4">
              <label for="last_name">Last name:</label>
              <input class="form-control" type="text" value="${employee.getLastName()}" name="last_name" placeholder="First name..." id="last_name"/>
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-6">
              <label for="password">Password:</label>
              <input class="form-control" type="password" value="${employee.getPassword()}" name="password" placeholder="Password..." id="password"/>
            </div>
            <div class="form-group col-md-6">
              <label for="entry_date">Entry Date:</label>
              <input class="form-control" type="date" value="${employee.getEntryDate()}" name="entry_date" placeholder="Entry Date..." id="entry_date"/>
            </div>
          </div>
          <div class="row">
            <div class="form-group my-0 py-0 col-md-12">
              <label class="h4">Address:</label>
            </div>
            <div class="form-group col-md-3">
              <label for="country">Country:</label>
              <input class="form-control" type="text" value="${employee.getAddress().getCountry()}" name="country" placeholder="Country..." id="country"/>
            </div>
            <div class="form-group col-md-3">
              <label for="city">City:</label>
              <input class="form-control" type="text" value="${employee.getAddress().getCity()}" name="city" placeholder="City..." id="city"/>
            </div>
            <div class="form-group col-md-3">
              <label for="street">Street:</label>
              <input class="form-control" type="text" value="${employee.getAddress().getStreet()}" name="street" placeholder="Street..." id="street"/>
            </div>
            <div class="form-group col-md-3">
              <label for="postalcode">Postal code:</label>
              <input class="form-control" type="number" value="${employee.getAddress().getPostalCode()}" name="postalcode" placeholder="Postal code..." id="postalcode"/>
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-12">
              <button class="btn btn-lg btn-primary shadow-sm w-100">Update</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
