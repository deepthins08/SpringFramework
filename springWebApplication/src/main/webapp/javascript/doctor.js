let getFields=  {
"name":false,
"phone":false,
"email":false,
"gender":false,
"group":false,
"hospital":false,
"specialization":false

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



function setGroup(){
let obj=document.getElementById("group");
let error=document.getElementById("groupError");

if(obj.value!="0"){
error.innerHTML="";
getFields["group"]=true;
}
else{
error.innerHTML="Please select a experience";
error.style.color='red';
getFields["group"]=false;
}
validate();
}


function setHospital() {
    let name = document.getElementById("hospital");
    let error = document.getElementById("hospitalError");
    // Regular expression to match only alphabetic characters and spaces
    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 30 || !regex.test(name.value)) {
        error.innerHTML = "Please enter a valid hospital name (3-30 characters, only alphabets and spaces)";
        error.style.color = 'red';
        getFields["hospital"] = false;
    } else {
        getFields["hospital"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setSpecialization() {
    let name = document.getElementById("specialization");
    let error = document.getElementById("specializationError");
    // Regular expression to match only alphabetic characters and spaces
    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 30 || !regex.test(name.value)) {
        error.innerHTML = "Please enter a specialization (3-30 characters, only alphabets and spaces)";
        error.style.color = 'red';
        getFields["specialization"] = false;
    } else {
        getFields["specialization"] = true;
        error.innerHTML = "";
    }
    validate();
}






