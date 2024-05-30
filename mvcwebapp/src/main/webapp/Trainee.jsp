<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="/mvcwebapp/org/trainee.js"></script>

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
<li class="nav-item">
                    <a class="nav-link active text-dark fs-5 fw-bold" aria-current="page" href="OrganDonation.jsp">OrganDonation</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<form action="train" name="health" method="post">
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
<span class="text-danger">
<c:forEach items="${error}" var="objectError">
${objectError.defaultMessage}<br>
</c:forEach>


</span>
                <span class="text-success fs-4 fw-bold">${intern}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Trainee Info</h6>

                <div class="mb-3">
                    <label for="name" class="form-label text-dark">Name</label>
                    <input type="text" class="form-control" value="${dto.name}" name="name" id="name" aria-describedby="nameHelp" onblur="setName()">
                    <span id="nameError" class="text-danger"></span>
                </div>
                <div class="mb-3">
                    <label for="phone" class="form-label text-dark">phone</label>
                    <input type="text" class="form-control" value="${dto.phone}" name="phone" id="phone" aria-describedby="phoneHelp" onblur="setPhone()">
                    <span id="phoneError" class="text-danger"></span>
                </div>

                   <div class="mb-4">
                                    <label class="form-label text-dark">YOP</label>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="yop" id="yop" value="2021" onblur="setYOP()" ${dto.yop eq '2021' ? 'checked' :''}  >
                                        <label class="form-check-label" for="yop">2021</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="yop" id="yop1" value="2022" onblur="setYOP()" ${dto.yop eq '2022' ? 'checked' :''} >
                                        <label class="form-check-label" for="yop1">2022</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="yop" id="yop2" value="2023" onblur="setYOP()" ${dto.yop eq '2023' ? 'checked' :''}>
                                        <label class="form-check-label" for="yop2">2023</label>
                                    </div>
                                   <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="yop" id="yop3" value="2024" onblur="setYOP()" ${dto.yop eq '2024' ? 'checked' :''}>
                                        <label class="form-check-label" for="yop3">2024</label>
                                    </div>
                                    <span id="radioError" class="text-danger"></span>
                                </div>


                <div class="mb-4">
                    <label for="qualification" class="form-label text-dark">Qualification</label>
                    <select class="form-select" id="qualification" name="qualification" onblur="setQualification()">
                        <option ${dto.qualification == null ? 'selected' :''} value="0">Choose...</option>
                        <option value="BA" ${dto.qualification eq 'BA' ? 'selected' :''}>BA</option>
                        <option value="BCOM" ${dto.qualification eq 'BCOM' ? 'selected' :''}>BCOM</option>
                        <option value="BCA" ${dto.qualification eq 'BCA' ? 'selected' :''}>BCA</option>
                        <option value="BE" ${dto.qualification eq 'BE' ? 'selected' :''}>BE</option>
                        <option value="BSC" ${dto.qualification eq 'BSC' ? 'selected' :''}>BSC</option>
                        <option value="MCA" ${dto.qualification eq 'MCA' ? 'selected' :''}>MCA</option>
                        <option value="MTech" ${dto.qualification eq 'MTech' ? 'selected' :''}>MTech</option>
                        <option value="MBA" ${dto.qualification eq 'MBA' ? 'selected' :''}>MBA</option>
                    </select>
                    <span id="qualifyError" class="text-danger"></span>
                </div>
 <div class="mb-3">
  <label for="qualification" class="form-label text-dark">Backlogs</label>
 <div class="form-check form-check-inline">
   <input class="form-check-input" type="checkbox" name="back" id="back1" value="option1" ${dto.back eq 'option1' ? 'checked' :''} onblur="setBacklog()">
   <label class="form-check-label" for="back1">Yes</label>
 </div>
 <div class="form-check form-check-inline">
   <input class="form-check-input" type="checkbox" name="back" id="back2" value="option2" ${dto.back eq 'option2' ? 'checked' :''} onblur="setBacklog()">
   <label class="form-check-label" for="back2">No</label>
 </div>
  <span id="backError" class="text-danger"></span>
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
