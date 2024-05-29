let getFields=  {
"name":false,
"phone":false,
"gender":false,
"group":false

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

function setName(){
let name=document.getElementById("name");
let error=document.getElementById("nameError");

if(name.value.trim()==="" || name.value.length<3 || name.value.length>30){
error.innerHTML="Please enter a valid name";
error.style.color='red';
getFields["name"]=false;
}
else{

getFields["name"]=true;
error.innerHTML="";
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

function setGender(){

let error=document.getElementById("radioError");

if(document.health.gender[0]==false && document.health.gender[1]==false && document.health.gender[2]==false){
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
error.innerHTML="Please select a blood group";
error.style.color='red';
getFields["group"]=false;
}
validate();
}