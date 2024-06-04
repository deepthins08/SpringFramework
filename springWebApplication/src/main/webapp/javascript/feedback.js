let getFields=  {
"name":false,
"phone":false,
"email":false,
"feedBack":false
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




function setFeedback() {
    let name = document.getElementById("feedBack");
    let error = document.getElementById("feedBackError");
    // Regular expression to match only alphabetic characters and spaces
//    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 300 ) {
        error.innerHTML = "Please provide valid Feedback (3-300 characters)";
        error.style.color = 'red';
        getFields["feedBack"] = false;
    } else {
        getFields["feedBack"] = true;
        error.innerHTML = "";
    }
    validate();
}




