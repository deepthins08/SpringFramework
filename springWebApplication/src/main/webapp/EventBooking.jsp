<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="/springWebApplication/js/event.js"></script>
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

<form action="event" name="form" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
<span class="text-danger">
<c:forEach items="${errors}" var="objectError">
${objectError.defaultMessage}<br>
</c:forEach>


</span>
                <span class="text-success fs-4 fw-bold">${eventMsg}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Event Booking</h6>

                <div class="mb-3">
                    <label for="name" class="form-label text-dark">Event Name</label>
                    <input type="text" class="form-control" value="${dto.name}" name="name" id="name" aria-describedby="nameHelp" onblur="setName()">
                    <span id="nameError" class="text-danger"></span>
                </div>
      <div class="mb-3">
                         <label for="date" class="form-label text-dark">Event Date</label>
                         <input type="date" value="${dto.date}" class="form-control" ${action=='edit'?'readonly':''} name="date" id="date" aria-describedby="dateHelp" onblur="setDate()">
                         <span id="dateError" class="text-danger"></span>
                     </div>


                <div class="mb-3">
                    <label for="time" class="form-label text-dark">Event Time</label>
                    <input type="time" class="form-control" value="${dto.time}" name="time" id="time" aria-describedby="phoneHelp" onblur="setTime()">
                    <span id="timeError" class="text-danger"></span>

                </div>
                <div class="mb-4">
<div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here"  name="location" id="location" onblur="setLocation()">${dto.location}</textarea>
  <label for="location">Event Location</label>
</div>
 <span id="locationError" class="text-danger"></span>
</div>

<div class="mb-4">
                    <label for="group" class="form-label text-dark">Type of Event</label>
                    <select class="form-select" id="group" name="group" onchange="showOtherEventType()" >
                        <option value="0" ${dto.group == null ? 'selected' :''}>Choose...</option>
                        <option value="Birthday" ${dto.group eq 'Birthday' ? 'selected' :''}>Birthday</option>
                        <option value="Conference" ${dto.group eq 'Conference' ? 'selected' :''}>Conference</option>
                        <option value="Seminar" ${dto.group eq 'Seminar' ? 'selected' :''}>Seminar</option>
                        <option value="WorkShop" ${dto.group eq 'WorkShop' ? 'selected' :''}>WorkShop</option>
                        <option value="Webinar" ${dto.group eq 'Webinar' ? 'selected' :''}>Webinar</option>
                        <option value="Others" ${dto.group eq 'Others' ? 'selected' :''}>Others(Please specify)</option>

                    </select>
                    <span id="groupError" class="text-danger"></span>
                </div>
 <div class="mb-3">
 <label for="otherEventType" id="otherEventTypeLabel" style="display:none;">Please specify:</label>
    <input type="text" name="otherEventType" value="${dto.otherEventType}" id="otherEventType" oninput="setEventType()" style="display:none;">
 </div>

                <div class="mb-1 mt-3">
  <div class="container">
              <div class="row">
               <div class="col">
               <c:if test="${action=='edit'}">
                    <input type="submit" value="Edit" name="submit" id="btn" class="btn btn-primary" >
                    </c:if>
                    <c:if test="${action!='edit'}">
                                        <input type="submit" value="Book" name="submit" id="btn" class="btn btn-primary" disabled>
                                        </c:if>
               </div>
                    <div class="col">
                         <input class="btn btn-primary ms-5 " type="reset" value="Reset">
                   </div>
                   </div>
                   </div>
                </div>
            </div>
        </div>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>

</body>
</html>
