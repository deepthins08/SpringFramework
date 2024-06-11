let getFields=  {
"name":false,
"phone":false,
"email":false,
"gender":false,
"date":false,
"address":false,
"confirm":false
}

function validate(){

let flag=false;

for(let[key,value] of Object.entries(getFields)){
if(value===false){

flag=true;
break;
}
}
if(!flag){
document.getElementById("btn").removeAttribute("disabled");
}else{
document.getElementById("btn").setAttribute("disabled","");
}
}

function setName() {
    let name = document.getElementById("name");
    let error = document.getElementById("nameError");
    // Regular expression to match only alphabetic characters and spaces
    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 30 || !regex.test(name.value)) {
        error.innerHTML = "Please enter a valid name (3-30 characters, only alphabets and spaces)";
        error.style.color = 'red';
        getFields["name"] = false;
    } else {
        getFields["name"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setPhone(){
let cid=document.getElementById("phone");
let error=document.getElementById("phoneError");


if(cid.value.trim().length==10 && /^\d+$/.test(cid.value.trim())){
getFields["phone"]=true;
error.innerHTML=""
}
else{
error.innerHTML="Please enter a valid Mobile Number.";
error.style.color='red';
getFields["phone"]=false;
}
validate();
}
function setMail() {
      let email = document.getElementById("email").value.trim();
      let error = document.getElementById("emailError");
      let emailRegex = /^[a-zA-Z]+[a-zA-Z0-9]*@gmail\.com$/;

      if (!emailRegex.test(email)) {
          error.innerHTML = "Please enter a valid email address.";
          error.style.color = 'red';
          getFields["email"] = false;
      } else {
          error.innerHTML = ""; // Clear the error message
          getFields["email"] = true;
      }

      validate(); // Call the validate function for overall form validation
  }

function setConfirm() {
    let check1 = document.getElementById("confirm");
    let error = document.getElementById("confirmError");

    if (!check1.checked ) {
        error.innerHTML = "Please confirm your details.";
        error.style.color = 'red';
        getFields["confirm"] = false;
    } else {
        error.innerHTML = "";
        getFields["confirm"] = true;
    }
    validate();
}


function setGender(){

let error=document.getElementById("radioError");

if(document.form.gender[0].checked==false && document.form.gender[1].checked==false && document.form.gender[2].checked==false){
error.innerHTML="Please select Gender";
error.style.color='red';
getFields["gender"]=false;

}
else{

error.innerHTML="";
getFields["gender"]=true;

}
validate();
}


document.addEventListener("DOMContentLoaded", function() {
    let today = new Date();
    let dd = String(today.getDate()).padStart(2, '0');
    let mm = String(today.getMonth() + 1).padStart(2, '0'); // January is 0!
    let yyyy = today.getFullYear();

    today = yyyy + '-' + mm + '-' + dd;
    document.getElementById("date").setAttribute("max", today);
});

function setDate() {
    let date = document.getElementById("date");
    let error = document.getElementById("dateError");
    let datePattern = /^\d{4}-\d{2}-\d{2}$/;

    if (!datePattern.test(date.value.trim())) {
        error.innerHTML = "Please enter a valid date (YYYY-MM-DD).";
        error.style.color = 'red';
        getFields["date"] = false;
    } else {
        let dateParts = date.value.split("-");
        let year = parseInt(dateParts[0], 10);
        let month = parseInt(dateParts[1], 10);
        let day = parseInt(dateParts[2], 10);
        let dateObj = new Date(year, month - 1, day);

        if (dateObj && (dateObj.getMonth() + 1) == month && dateObj.getDate() == day && dateObj.getFullYear() == year) {
            error.innerHTML = "";
            getFields["date"] = true;
        } else {
            error.innerHTML = "Please enter a valid date (YYYY-MM-DD).";
            error.style.color = 'red';
            getFields["date"] = false;
        }
    }
    validate();
}
function setAddress() {
    let name = document.getElementById("address");
    let error = document.getElementById("addressError");
    // Regular expression to match only alphabetic characters and spaces
//    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 300 ) {
        error.innerHTML = "Please enter a valid Address (3-300 characters)";
        error.style.color = 'red';
        getFields["address"] = false;
    } else {
        getFields["address"] = true;
        error.innerHTML = "";
    }
    validate();
}