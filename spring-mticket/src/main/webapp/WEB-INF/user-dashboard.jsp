<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c"
uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>

<title>User Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

</head>

<body>

<nav class="navbar navbar-dark bg-dark">

<div class="container">

<a class="navbar-brand">
Movie Booking Portal
</a>

<a href="logout"
   class="btn btn-danger">

Logout

</a>

</div>

</nav>

<div class="container mt-4">

<h2>

Welcome,
${user.name}

</h2>

<hr>

<h4>Your Bookings</h4>

<table class="table table-bordered">

<thead>

<tr>

<th>Movie</th>

<th>Theater</th>

<th>Show Time</th>

<th>Seats</th>

<th>Amount</th>

</tr>

</thead>

<tbody>

<c:forEach items="${bookings}"
           var="booking">

<tr>

<td>${booking.movieName}</td>

<td>${booking.theaterName}</td>

<td>${booking.showTime}</td>

<td>${booking.seats}</td>

<td>₹${booking.amount}</td>

</tr>

</c:forEach>

</tbody>

</table>

</div>

</body>
</html>