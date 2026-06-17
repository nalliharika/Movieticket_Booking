<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>

<title>Admin Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

</head>

<body>

<nav class="navbar navbar-dark bg-dark">

<div class="container">

<a class="navbar-brand">

Admin Panel

</a>

<a href="logout"
   class="btn btn-danger">

Logout

</a>

</div>

</nav>

<div class="container mt-4">

<div class="row">

<div class="col-md-3">

<div class="card text-center shadow">

<div class="card-body">

<h5>Total Movies</h5>

<h2>${movieCount}</h2>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card text-center shadow">

<div class="card-body">

<h5>Total Users</h5>

<h2>${userCount}</h2>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card text-center shadow">

<div class="card-body">

<h5>Total Bookings</h5>

<h2>${bookingCount}</h2>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card text-center shadow">

<div class="card-body">

<h5>Revenue</h5>

<h2>₹${revenue}</h2>

</div>

</div>

</div>

</div>

<hr>

<h3>Movie Management</h3>

<a href="movies"
   class="btn btn-primary">

Manage Movies

</a>

<a href="theaters"
   class="btn btn-success">

Manage Theaters

</a>

<a href="bookings"
   class="btn btn-warning">

View Bookings

</a>

</div>

</body>
</html>