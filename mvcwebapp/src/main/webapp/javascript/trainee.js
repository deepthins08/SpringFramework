let getFields=  {
"name":false,
"phone":false,
"yop":false,
"qualification":false,
"back":false
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

function setQualification(){
let obj=document.getElementById("qualification");
let error=document.getElementById("qualifyError");

if(obj.value!="0"){
error.innerHTML="";
getFields["qualification"]=true;
}
else{
error.innerHTML="Please select any Qualification";
error.style.color='red';
getFields["qualification"]=false;
}
validate();
}

function setBacklog() {
    let check1 = document.getElementById("back1");
    let check2 = document.getElementById("back2");
    let error = document.getElementById("backError");

    if (!check1.checked && !check2.checked) {
        error.innerHTML = "Please choose any backlogs.";
        error.style.color = 'red';
        getFields["back"] = false;
    } else {
        error.innerHTML = "";
        getFields["back"] = true;
    }
    validate();
}


function setYOP(){

let error=document.getElementById("radioError");

if(document.health.yop[0].checked==false && document.health.yop[1].checked==false && document.health.yop[2].checked==false && document.health.yop[3].checked==false){
error.innerHTML="Please select YOP";
error.style.color='red';
getFields["yop"]=false;

}
else{

error.innerHTML="";
getFields["yop"]=true;

}
validate();
}
