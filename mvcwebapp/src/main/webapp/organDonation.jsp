<%@ page isELIgnored="false" %>
<html>
<head>
<title>Xworkz</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="/mvcwebapp/org/donation.js"></script>
</head>
<body class="bg-primary">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="container">
            <a class="navbar-brand" href="#">
 <img src="https://www.x-workz.in/Logo.png" width="100px" height="80px">            </a>
          </div>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active text-dark fs-1 fw-bold" aria-current="page" href="index.jsp">Home</a>
                </li>


            </ul>
        </div>
    </div>
</nav>

<form action="donate" name="health" method="post" >
    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-light">
            <div class="card-body">
            <span class="text-success fs-4 fw-bold">   ${organ}</span>
                <h6 class="card-title mb-3 text-dark fs-1">Donar Info</h6>

                <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="name" class="form-label text-dark">Name</label>
                                <input type="text" class="form-control" name="name" id="name" aria-describedby="modelHelp" onblur="setName()">
                                <span id="nameError"></span>
                            </div>
                        </div>
                    </div>
                </div>

 <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="phone" class="form-label text-dark">Phone</label>
                                <input type="text" class="form-control" name="phone" id="phone" aria-describedby="modelHelp" onblur="setPhone()" >
                                <span id="phoneError"></span>
                            </div>
                        </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="group">Blood Group</label>
                                <select class="form-select" id="group" name="group" onblur="setGroup()" >
                                    <option selected value="0">Choose...</option>
                                    <option value="A+">A+</option>
                                    <option value="A-">A-</option>
                                    <option value="B+">B+ </option>
                                    <option value="B-">B- </option>
                                    <option value="O+">O+ </option>
                                    <option value="O-">O- </option>
                                    <option value="AB+">AB+ </option>
                                    <option value="AB-">AB- </option>
                                </select>

                                <span id="groupError"></span>
                            </div>
                        </div>
                    </div>
                </div>

    <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">

<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="gender" value="male" onblur="setGender()">
  <label class="form-check-label" for="gender">
    Male
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="gender1" value="female" onblur="setGender()">
  <label class="form-check-label" for="gender1">
    Female
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="gender2" value="others" onblur="setGender()">
  <label class="form-check-label" for="gender2">
    Others
  </label>
</div>
                        <span id="radioError"></span>

                        </div></div></div>

    <div class="row">
                        <div class="col-sm-12">
                            <div class="form-group">
                                <div class="mb-1 mt-3">

                                    <input type="submit" value="Register" name="btn" id="btn" disabled aria-describedby="modelHelp"  >

                                </div>
                            </div>
                        </div>
                    </div>
        </div>
        </div>
        </div>

        </form>


        </body>
        </html>

