<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="/springWebApplication/js/doctor.js"></script>
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

<form action="doctor" name="form" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
<span class="text-danger">
<c:forEach items="${errors}" var="objectError">
${objectError.defaultMessage}<br>
</c:forEach>


</span>
                <span class="text-success fs-4 fw-bold">${doctorMsg}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Doctor Details</h6>

                <div class="mb-3">
                    <label for="name" class="form-label text-dark">Name</label>
                    <input type="text" class="form-control" value="${dto.name}" name="name" id="name" aria-describedby="nameHelp" onblur="setName()">
                    <span id="nameError" class="text-danger"></span>
                </div>
                 <div class="mb-3">
                                    <label for="email" class="form-label text-dark">Email</label>
                                    <input type="email" value="${dto.email}" class="form-control" name="email" id="email" aria-describedby="emailHelp" onblur="setMail()">
                                    <span id="emailError" class="text-danger"></span>
                                </div>

                <div class="mb-3">
                    <label for="phone" class="form-label text-dark">phone</label>
                    <input type="text" class="form-control" value="${dto.phone}" name="phone" id="phone" aria-describedby="phoneHelp" onblur="setPhone()">
                    <span id="phoneError" class="text-danger"></span>

                </div>
      <div class="mb-4">
                                     <label class="form-label text-dark">Gender</label>
                                     <div class="form-check form-check-inline">
                                         <input class="form-check-input" type="radio" name="gender" id="gender" value="male" onblur="setGender()" ${dto.gender eq 'male' ? 'checked' :''}  >
                                         <label class="form-check-label" for="gender">Male</label>
                                     </div>
                                     <div class="form-check form-check-inline">
                                         <input class="form-check-input" type="radio" name="gender" id="gender1" value="female" onblur="setGender()" ${dto.gender eq 'female' ? 'checked' :''} >
                                         <label class="form-check-label" for="gender1">Female</label>
                                     </div>
                                     <div class="form-check form-check-inline">
                                         <input class="form-check-input" type="radio" name="gender" id="gender2" value="others" onblur="setGender()" ${dto.gender eq 'others' ? 'checked' :''}>
                                         <label class="form-check-label" for="gender2">Others</label>
                                     </div>

                                     <span id="radioError" class="text-danger"></span>
                                 </div>

                <div class="mb-4">
 <div class="mb-3">
                    <label for="specialization" class="form-label text-dark">Specialization</label>
                    <input type="text" class="form-control" value="${dto.specialization}" name="specialization" id="specialization" aria-describedby="phoneHelp" onblur="setSpecialization()">
                    <span id="specializationError" class="text-danger"></span>

                </div>
  <div class="mb-4">
                    <label for="group" class="form-label text-dark">Experience</label>
                    <select class="form-select" id="group" name="group" onblur="setGroup()" >
                        <option value="0" ${dto.group == null ? 'selected' :''}>Choose...</option>
                        <option value="0-2" ${dto.group eq '0-2' ? 'selected' :''}>0-2</option>
                        <option value="2-4" ${dto.group eq '2-4' ? 'selected' :''}>2-4</option>
                        <option value="4-6" ${dto.group eq '4-6' ? 'selected' :''}>4-6</option>
                        <option value="6-8" ${dto.group eq '6-8' ? 'selected' :''}>6-8</option>
                        <option value="8-10" ${dto.group eq '8-10' ? 'selected' :''}>8-10</option>
                        <option value="10-15" ${dto.group eq '10-15' ? 'selected' :''}>10-15</option>
                        <option value="15-20" ${dto.group eq '15-20' ? 'selected' :''}>15-20</option>

                    </select>
                    <span id="groupError" class="text-danger"></span>
                </div>
  <div class="mb-3">
                     <label for="hospital" class="form-label text-dark">Working Hospital Name</label>
                     <input type="text" class="form-control" value="${dto.hospital}" name="hospital" id="hospital" aria-describedby="phoneHelp" onblur="setHospital()">
                     <span id="hospitalError" class="text-danger"></span>

                 </div>
                <div class="mb-1 mt-3">
    <div class="container">
                                       <div class="row">
                                         <div class="col">
                    <input type="submit" value="Send Info" name="btn" id="btn" class="btn btn-primary" disabled>
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
