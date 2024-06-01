<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="/springWebApplication/js/travel.js"></script>
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
                             <a class="nav-link active text-dark fs-5 fw-bold" aria-current="page" href="index.jsp">Home</a>
                         </li>
                         <li class="nav-item">
                             <a class="nav-link text-dark fs-5 fw-bold " href="Customer.jsp">Customer Info</a>
                         </li>
         <li class="nav-item">
                             <a class="nav-link text-dark fs-5 fw-bold" href="BloodDonation.jsp">Blood Donation</a>
                         </li>
         </li>

         <li class="nav-item">
                             <a class="nav-link text-dark fs-5 fw-bold" href="EventBooking.jsp">Event Booking</a>
                         </li>
         <li class="nav-item">
                             <a class="nav-link text-dark fs-5 fw-bold" href="DoctorInfo.jsp">DoctorInfo</a>
                         </li>
         <li class="nav-item">
                             <a class="nav-link text-dark fs-5 fw-bold" href="PatientInfo.jsp">PatientInfo</a>
                         </li>
          <li class="nav-item">
                              <a class="nav-link text-dark fs-5 fw-bold" href="CustomerFeedback.jsp">CustomerFeedback</a>
                          </li>
          <li class="nav-item">
                              <a class="nav-link text-dark fs-5 fw-bold" href="MovieTicketBooking.jsp">MovieTicketBooking</a>
                          </li>
            </ul>
        </div>
    </div>
</nav>

<form action="travel" name="form" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
<span class="text-danger">
<c:forEach items="${errors}" var="objectError">
${objectError.defaultMessage}<br>
</c:forEach>


</span>
                <span class="text-success fs-4 fw-bold">${travelMsg}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Travel Booking</h6>

                <div class="mb-3">
                    <label for="name" class="form-label text-dark">Name</label>
                    <input type="text" class="form-control" value="${dto.name}" name="name" id="name" aria-describedby="nameHelp" onblur="setName()">
                    <span id="nameError" class="text-danger"></span>
                </div>

                <div class="mb-3">
                    <label for="phone" class="form-label text-dark">phone</label>
                    <input type="text" class="form-control" value="${dto.phone}" name="phone" id="phone" aria-describedby="phoneHelp" onblur="setPhone()">
                    <span id="phoneError" class="text-danger"></span>
  <div class="mb-3">
                                     <label for="email" class="form-label text-dark">Email</label>
                                     <input type="email" value="${dto.email}" class="form-control" name="email" id="email" aria-describedby="emailHelp" onblur="setMail()">
                                     <span id="emailError" class="text-danger"></span>
                                 </div>

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
<div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here"  name="address" id="address" onblur="setAddress()">${dto.address}</textarea>
  <label for="address">Address</label>
</div>
 <span id="addressError" class="text-danger"></span>
</div>

 <div class="mb-3">
                    <label for="departure" class="form-label text-dark">Departure City</label>
                    <input type="text" class="form-control" value="${dto.departure}" name="departure" id="departure" aria-describedby="nameHelp" onblur="setDeparture()">
                    <span id="departureError" class="text-danger"></span>
                </div>
 <div class="mb-3">
                    <label for="destination" class="form-label text-dark">Destination City</label>
                    <input type="text" class="form-control" value="${dto.destination}" name="destination" id="destination" aria-describedby="nameHelp" onblur="setDestination()">
                    <span id="destinationError" class="text-danger"></span>
                </div>


 <div class="mb-3">
                    <label for="date" class="form-label text-dark">Date of Departure</label>
                    <input type="date" value="${dto.date}" class="form-control" name="date" id="date" aria-describedby="dateHelp" onblur="setDate()">
                    <span id="dateError" class="text-danger"></span>
                </div>


  <div class="mb-4">
                    <label for="group" class="form-label text-dark">Transportation Type</label>
                    <select class="form-select" id="group" name="group" onblur="setGroup()" >
                        <option value="0" ${dto.group == null ? 'selected' :''}>Choose...</option>
                        <option value="Bike" ${dto.group eq 'Bike' ? 'selected' :''}>Bike</option>
                        <option value="Bus" ${dto.group eq 'Bus' ? 'selected' :''}>Bus</option>
                        <option value="Car" ${dto.group eq 'Car' ? 'selected' :''}>Car</option>
                        <option value="Flight" ${dto.group eq 'Flight' ? 'selected' :''}>Flight</option>

                    </select>
                    <span id="groupError" class="text-danger"></span>
                </div>
  <div class="mb-3">
   <label for="qualification" class="form-label text-dark">Please Confirm Travel Booking</label>
  <div class="form-check form-check-inline">
    <input class="form-check-input" type="checkbox" name="confirm" id="confirm" value="option1" ${dto.confirm eq 'option1' ? 'checked' :''} onblur="setConfirm()">
    <label class="form-check-label" for="confirm">Confirm</label>
  </div>
  <span id="confirmError" class="text-danger"></span>
   </div>

                <div class="mb-1 mt-3">
                    <input type="submit" value="Register" name="btn" id="btn" class="btn btn-primary" disabled>
                </div>
            </div>
        </div>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>

</body>
</html>
