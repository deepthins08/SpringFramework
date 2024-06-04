<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="/springWebApplication/js/ticket.js"></script>
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
                                  <a class="nav-link text-dark fs-5 fw-bold" href="Travel.jsp">Travel Booking</a>
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

            </ul>
        </div>
    </div>
</nav>

<form action="movie" name="form" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light ">
            <div class="card-body">
<span class="text-danger">
<c:forEach items="${errors}" var="objectError">
${objectError.defaultMessage}<br>
</c:forEach>
</span>
                <span class="text-success fs-4 fw-bold">${movieMsg}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Movie Ticket Booking</h6>
  <div class="mb-3">
                    <label for="group" class="form-label text-dark">Movie Name</label>
                    <select class="form-select" id="group" name="group" onblur="setGroup()" >
                        <option value="0" ${dto.group == null ? 'selected' :''}>Choose...</option>
                        <option value="Avengers" ${dto.group eq 'Avengers' ? 'selected' :''}>Avengers</option>
                        <option value="Black Panther" ${dto.group eq 'Black Panther' ? 'selected' :''}>Black Panther</option>
                        <option value="Inception" ${dto.group eq 'Inception' ? 'selected' :''}>Inception</option>
                        <option value="The Lord of the Rings: The Fellowship of the Ring" ${dto.group eq 'The Lord of the Rings: The Fellowship of the Ring' ? 'selected' :''}>The Lord of the Rings: The Fellowship of the Ring</option>
                        <option value="The Matrix" ${dto.group eq 'The Matrix' ? 'selected' :''}>The Matrix</option>
                        <option value="The Shawshank Redemption" ${dto.group eq 'The Shawshank Redemption' ? 'selected' :''}>The Shawshank Redemption</option>

                    </select>
                    <span id="groupError" class="text-danger"></span>
                </div>
<div class="mb-3">
                    <label for="date" class="form-label text-dark">Date</label>
                    <input type="date"  class="form-control" name="date" id="date" value="${dto.date}" aria-describedby="dateHelp" onblur="setDate()">
                    <span id="dateError" class="text-danger"></span>
                </div>
   <div class="mb-3">
                    <label for="time" class="form-label text-dark">Time</label>
                    <input type="time" class="form-control" value="${dto.time}" name="time" id="time" aria-describedby="phoneHelp" onblur="setTime()">
                    <span id="timeError" class="text-danger"></span>

                </div>
 <div class="mb-3">
                     <label for="tickets" class="form-label text-dark">No of Tickets</label>
                     <input type="text" class="form-control" value="${dto.tickets}" name="tickets" id="tickets" aria-describedby="ticketsHelp" onblur="setTickets()">
                     <span id="ticketsError" class="text-danger"></span>

                 </div>

  <div class="mb-3">
   <label for="qualification" class="form-label text-dark">Please Choose Payment Method</label><br>

 <div class="form-check form-check-inline">
   <input class="form-check-input" type="checkbox" name="confirm" id="confirm1" value="option1" ${dto.confirm eq 'option1' ? 'checked' :''} onblur="setConfirm()">
   <label class="form-check-label" for="confirm1">UPI/Online</label>
 </div>
 <input class="form-check-input" type="checkbox" name="confirm" id="confirm2" value="option2" ${dto.confirm eq 'option2' ? 'checked' :''} onblur="setConfirm()">
   <label class="form-check-label" for="confirm2">Debit/Credit Card</label>
 </div>
  <span id="confirmError" class="text-danger"></span>
 </div>


                <div class="mb-1 mt-3">
 <div class="container">
               <div class="row">
                <div class="col me-5">
                    <input type="submit" value="Book" name="btn" id="btn" class="btn btn-primary me-5" disabled>
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

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>

</body>
</html>
