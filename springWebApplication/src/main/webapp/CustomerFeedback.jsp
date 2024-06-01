<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="/springWebApplication/js/feedback.js"></script>
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
                                   <a class="nav-link text-dark fs-5 fw-bold" href="MovieTicketBooking.jsp">MovieTicketBooking</a>
                               </li>
            </ul>
        </div>
    </div>
</nav>

<form action="feedback" name="form" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
<span class="text-danger">
<c:forEach items="${errors}" var="objectError">
${objectError.defaultMessage}<br>
</c:forEach>


</span>
                <span class="text-success fs-4 fw-bold">${feedbackMsg}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Customer FeedBack</h6>

                <div class="mb-3">
                    <label for="name" class="form-label text-dark">Customer Name</label>
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
<div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here"  name="feedBack" id="feedBack" onblur="setFeedback()">${dto.feedBack}</textarea>
  <label for="feedBack">FeedBack</label>
</div>
 <span id="feedBackError" class="text-danger"></span>
</div>
 <div class="form-group">
                <label for="satisfaction">Overall Satisfaction:</label>
                <div class="d-flex align-items-center">
                    <input type="range" class="custom-range" value="${dto.satisfaction}" id="satisfaction" name="satisfaction" min="1" max="5" value="3" oninput="document.getElementById('satisfaction-value').innerText = this.value" >
                    <span id="satisfaction-value" class="range-value">3</span>
                </div>
            </div>


                <div class="mb-1 mt-3">
                    <input type="submit" value="submit" name="btn" id="btn" class="btn btn-primary" disabled>
                </div>
            </div>
        </div>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>

</body>
</html>
