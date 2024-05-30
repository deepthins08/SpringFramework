<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="/mvcwebapp/org/donation.js"></script>

</head>
<body class="bg-primary">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://www.x-workz.in/Logo.png" width="100" height="80" alt="Xworkz Logo">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active text-dark fs-5 fw-bold" aria-current="page" href="index.jsp">Home</a>
                </li>
</li>
<li class="nav-item">
                    <a class="nav-link text-dark fs-5 fw-bold" href="Trainee.jsp">Organ Donation</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<form action="donate" name="health" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
                <span class="text-danger">
                    <c:forEach items="${errors}" var="objectError">
                        ${objectError.defaultMessage}<br/>
                    </c:forEach>
                </span>
                <span class="text-success fs-4 fw-bold">${organ}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Donor Info</h6>

                <div class="mb-3">
                    <label for="name" class="form-label text-dark">Name</label>
                    <input type="text" value="${dto.name}" class="form-control" name="name" id="name" aria-describedby="nameHelp" onblur="setName()">
                    <span id="nameError" class="text-danger"></span>
                </div>
                <div class="mb-3">
                    <label for="phone" class="form-label text-dark">Phone</label>
                    <input type="text" value="${dto.phone}" class="form-control" name="phone" id="phone" aria-describedby="phoneHelp" onblur="setPhone()">
                    <span id="phoneError" class="text-danger"></span>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label text-dark">Email</label>
                    <input type="email" value="${dto.email}" class="form-control" name="email" id="email" aria-describedby="emailHelp" onblur="setMail()">
                    <span id="emailError" class="text-danger"></span>
                </div>
                <div class="mb-4">
                    <label for="group" class="form-label text-dark">Blood Group</label>
                    <select class="form-select" id="group" name="group" onblur="setGroup()" >
                        <option value="0" ${dto.group == null ? 'selected' :''}>Choose...</option>
                        <option value="A+" ${dto.group eq 'A+' ? 'selected' :''}>A+</option>
                        <option value="A-" ${dto.group eq 'A-' ? 'selected' :''}>A-</option>
                        <option value="B+" ${dto.group eq 'B+' ? 'selected' :''}>B+</option>
                        <option value="B-" ${dto.group eq 'B-' ? 'selected' :''}>B-</option>
                        <option value="O+" ${dto.group eq 'O+' ? 'selected' :''}>O+</option>
                        <option value="O-" ${dto.group eq 'O-' ? 'selected' :''}>O-</option>
                        <option value="AB+" ${dto.group eq 'AB+' ? 'selected' :''}>AB+</option>
                        <option value="AB-" ${dto.group eq 'AB-' ? 'selected' :''}>AB-</option>
                    </select>
                    <span id="groupError" class="text-danger"></span>
                </div>
                <div class="mb-4">
                    <label class="form-label text-dark">Gender</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" id="genderMale" value="male" ${dto.gender eq 'male' ? 'checked' :''} onblur="setGender()" >
                        <label class="form-check-label" for="genderMale">Male</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" id="genderFemale" value="female" onblur="setGender()" ${dto.gender eq 'female' ? 'checked' :''}>
                        <label class="form-check-label" for="genderFemale">Female</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="gender" id="genderOthers" value="others" onblur="setGender()" ${dto.gender eq 'others' ? 'checked' :''}>
                        <label class="form-check-label" for="genderOthers">Others</label>
                    </div>
                    <span id="radioError" class="text-danger"></span>
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
