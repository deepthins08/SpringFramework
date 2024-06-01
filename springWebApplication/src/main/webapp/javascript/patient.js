let getFields=  {
"name":false,
"phone":false,
"email":false,
"gender":false,
"address":false,
"confirm":false,
"physician":false,
"history":false
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

if(cid.value.trim().length==10){
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

  function validateEmail(email) {
            // Regular expression pattern for validating email addresses
            const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            // Test the input email against the pattern
            return emailPattern.test(email);
        }

        function setMail() {
            let emailInput = document.getElementById("email");
            let errorSpan = document.getElementById("emailError");

            // Get the value of the email input field
            let email = emailInput.value.trim();

            // Check if the email is valid
            if (validateEmail(email)) {
                // Email is valid
                errorSpan.innerHTML = "";
                getFields["email"] = true;
            } else {
                // Email is invalid
                errorSpan.innerHTML = "Please enter a valid email address.";
                errorSpan.style.color = 'red';
                getFields["email"] = false;
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

function setHistory() {
    let name = document.getElementById("history");
    let error = document.getElementById("historyError");
    // Regular expression to match only alphabetic characters and spaces
    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 30 || !regex.test(name.value)) {
        error.innerHTML = "Please enter a valid Medical History (3-30 characters, only alphabets and spaces)";
        error.style.color = 'red';
        getFields["history"] = false;
    } else {
        getFields["history"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setPhysician() {
    let name = document.getElementById("physician");
    let error = document.getElementById("physicianError");
    // Regular expression to match only alphabetic characters and spaces
    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 30 || !regex.test(name.value)) {
        error.innerHTML = "Please enter a valid specialization(3-30 characters, only alphabets and spaces)";
        error.style.color = 'red';
        getFields["physician"] = false;
    } else {
        getFields["physician"] = true;
        error.innerHTML = "";
    }
    validate();
}

