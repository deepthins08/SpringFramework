<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="/springWebApplication/js/bloodDonation.js"></script>
<style>

        .navbar-nav .nav-link:hover {
            color: #fff !important;
            background-color: #198754;
        }
    </style>
</head>
<body class="bg-success">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://www.x-workz.in/Logo.png" width="80" height="60" alt="Xworkz Logo">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
       <div class="collapse navbar-collapse" id="navbarNav">
                 <ul class="navbar-nav ms-auto">
                     <li class="nav-item">
                         <a class="nav-link text-dark fs-6 fw-bold" aria-current="page" href="index.jsp">Home</a>
                     </li>

                     <!-- Customer Info Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="customerInfoDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             Customer Info
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="customerInfoDropdown">
                             <li><a class="dropdown-item" href="Customer.jsp">CustomerInfo</a></li>
                             <li><a class="dropdown-item" href="CustomerSearch.jsp">Customer Search</a></li>
                             <li><a class="dropdown-item" href="SearchByGender.jsp">Customer Search By Gender</a></li>
                         </ul>
                     </li>

                     <!-- Blood Donation Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="bloodDonationDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             BloodDonation
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="bloodDonationDropdown">
                             <li><a class="dropdown-item" href="BloodDonation.jsp">Blood Donation</a></li>
                             <li><a class="dropdown-item" href="BloodDonationSearch.jsp">Blood Donation Search</a></li>
                             <li><a class="dropdown-item" href="donarNameSearch.jsp">Donor Name Search</a></li>
                         </ul>
                     </li>

                     <!-- Travel Booking Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="travelBookingDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             TravelBooking
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="travelBookingDropdown">
                             <li><a class="dropdown-item" href="Travel.jsp">Travel Booking</a></li>
                             <li><a class="dropdown-item" href="TravelBookingSearch.jsp">Travel Booking Search</a></li>
                             <li><a class="dropdown-item" href="SearchByTransport.jsp">Search By Transport</a></li>
                         </ul>
                     </li>

                     <!-- Event Booking Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="eventBookingDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             EventBooking
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="eventBookingDropdown">
                             <li><a class="dropdown-item" href="EventBooking.jsp">Event Booking</a></li>
                             <li><a class="dropdown-item" href="EventBookingSearch.jsp">Event Booking Search</a></li>
                             <li><a class="dropdown-item" href="SearchByEventType.jsp">Search By Event Type</a></li>
                         </ul>
                     </li>

                     <!-- Doctor and Patient Info Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="doctorPatientInfoDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             DoctorInfo
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="doctorPatientInfoDropdown">
                             <li><a class="dropdown-item" href="DoctorInfo.jsp">Doctor Info</a></li>

                             <li><a class="dropdown-item" href="SearchByHospital.jsp">Hospital Search</a></li>
                             <li><a class="dropdown-item" href="DoctorSearch.jsp">Doctor Search</a></li>

                         </ul>
                     </li>

     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="doctorPatientInfoDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             PatientInfo
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="doctorPatientInfoDropdown">

                             <li><a class="dropdown-item" href="PatientInfo.jsp">Patient Info</a></li>
                             <li><a class="dropdown-item" href="PatientSearch.jsp">Patient Search</a></li>
                             <li><a class="dropdown-item" href="SearchByPhysician.jsp">Search By Physician</a></li>
                         </ul>
                     </li>

                     <!-- Movie Ticket Booking Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="movieTicketBookingDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             MovieTicket
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="movieTicketBookingDropdown">
                             <li><a class="dropdown-item" href="MovieTicketBooking.jsp">Movie Ticket Booking</a></li>
                             <li><a class="dropdown-item" href="MovieTicketBookingSearch.jsp">Movie Ticket Booking Search</a></li>
                             <li><a class="dropdown-item" href="MovieNameSearch.jsp">Movie Name Search</a></li>
                         </ul>
                     </li>

                     <!-- Feedback Search Dropdown -->
                     <li class="nav-item dropdown">
                         <a class="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="feedbackSearchDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                             Feedback Search
                         </a>
                         <ul class="dropdown-menu" aria-labelledby="feedbackSearchDropdown">
                          <li><a class="dropdown-item" href="CustomerFeedback.jsp">Customer Feedback</a></li>
                             <li><a class="dropdown-item" href="CustomerFeedbackSearch.jsp">Customer Feedback Search</a></li>
                             <li><a class="dropdown-item" href="FeedbackNameSearch.jsp">Feedback Name Search</a></li>
                         </ul>
                     </li>
                 </ul>
             </div>
         </div>
     </nav>
<div>
<form action="donationSearch" name="form" method="get">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">

                <span class="text-success fs-4 fw-bold">${msg}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Blood Donar Info</h6>

                <div class="mb-3">
                    <label for="id" class="form-label text-dark">Id</label>
                    <input type="text" class="form-control" name="id" id="id" aria-describedby="nameHelp" >

                </div>

                <div class="mb-1 mt-3">
                 <div class="container">
                                    <div class="row">
                                      <div class="col me-5">
                    <input type="submit" value="Search" name="btn" id="btn" class="btn btn-primary me-5" >
                </div>
                 <div class="col ms-5">
                          <input class="btn btn-primary ms-5 " type="reset" value="Reset">
                </div>
                </div>
                </div>
                </div>
            </div>
        </div>
    </div>
</form>

        <table class="table table-dark">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Donar Name</th>
              <th scope="col">Phone</th>
              <th scope="col">email</th>
              <th scope="col">gender</th>
              <th scope="col">date</th>
              <th scope="col">address</th>
              <th scope="col">lastDonated</th>
            </tr>
          </thead>
          <tbody>


       <c:if test="${not empty dto1}">
                  <tr>
                      <th scope="row">${dto1.id}</th>
                      <td>${dto1.name}</td>
                      <td>${dto1.phone}</td>
                      <td>${dto1.email}</td>
                      <td>${dto1.gender}</td>
                      <td>${dto1.date}</td>
                      <td>${dto1.address}</td>
                      <td>${dto1.lastDonated}</td>
                  </tr>
              </c:if>
          </tbody>
        </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>

</body>
</html>
