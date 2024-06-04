let getFields=  {
"tickets":false,
"date":false,
"time":false,
"confirm":false,
"group":false,

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

function setConfirm() {
    let check1 = document.getElementById("confirm1");
    let check2 = document.getElementById("confirm2");
    let error = document.getElementById("confirmError");

    if (!check1.checked && !check2.checked) {
        error.innerHTML = "Please confirm your payment.";
        error.style.color = 'red';
        getFields["confirm"] = false;
    } else {
        error.innerHTML = "";
        getFields["confirm"] = true;
    }
    validate();
}

document.addEventListener("DOMContentLoaded", function() {
    let today = new Date();
    let dd = String(today.getDate()).padStart(2, '0');
    let mm = String(today.getMonth() + 1).padStart(2, '0'); // January is 0!
    let yyyy = today.getFullYear();

    today = yyyy + '-' + mm + '-' + dd;
    document.getElementById("date").setAttribute("min", today);
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

function setTime() {
    let time = document.getElementById("time");
    let error = document.getElementById("timeError");
    let timePattern = /^([01]\d|2[0-3]):([0-5]\d)$/; // Regular expression to match HH:MM 24-hour format

    if (!timePattern.test(time.value.trim())) {
        error.innerHTML = "Please enter a valid time (HH:MM).";
        error.style.color = 'red';
        getFields["time"] = false;
    } else {
        error.innerHTML = "";
        getFields["time"] = true;
    }
    validate();
}


function setTickets() {
    let tickets = document.getElementById("tickets");
    let error = document.getElementById("ticketsError");

    // Check if the ticket value is between 1 and 10
    if (tickets.value.trim() === "" || isNaN(tickets.value) || tickets.value < 1 || tickets.value > 10) {
        error.innerHTML = "Please enter a valid number of tickets (1-10).";
        error.style.color = 'red';
        getFields["tickets"] = false;
    } else {
        getFields["tickets"] = true;
        error.innerHTML = "";
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
error.innerHTML="Please select a Movie name";
error.style.color='red';
getFields["group"]=false;
}
validate();
}

