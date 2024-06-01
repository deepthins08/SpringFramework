let getFields=  {
"name":false,
"date":false,
"time":false,
"location":false,
"group":false,
"otherEventType":false
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

   function showOtherEventType() {
            let eventType = document.getElementById("group").value;
            let otherEventType = document.getElementById("otherEventType");
            let error = document.getElementById("groupError");

            if (eventType === "Others") {
                otherEventType.style.display = "block";
                getFields["group"] = false; // Set to false until user enters a value
            } else {
                otherEventType.style.display = "none";
                otherEventType.value = ""; // Clear the text box if hidden
                getFields["group"] = true; // Valid when other is not selected
                getFields["otherEventType"] = true; // Ensure no error when other is hidden
                error.innerHTML = "";
            }
            validate();
        }

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
function setLocation() {
    let name = document.getElementById("location");
    let error = document.getElementById("locationError");
    // Regular expression to match only alphabetic characters and spaces
//    let regex = /^[A-Za-z\s]+$/;

    if (name.value.trim() === "" || name.value.length < 3 || name.value.length > 300 ) {
        error.innerHTML = "Please enter a valid Location (3-300 characters)";
        error.style.color = 'red';
        getFields["location"] = false;
    } else {
        getFields["location"] = true;
        error.innerHTML = "";
    }
    validate();
}


        function setEventType() {
            let eventType = document.getElementById("group").value;
            let otherEventType = document.getElementById("otherEventType").value.trim();
            let error = document.getElementById("groupError");

            if (eventType === "Others" && otherEventType === "") {
                error.innerHTML = "Please specify the event type.";
                error.style.color = 'red';
                getFields["group"] = false;
                getFields["otherEventType"] = false;
            } else if (eventType === "other" && otherEventType !== "") {
                error.innerHTML = "";
                getFields["group"] = true;
                getFields["otherEventType"] = true;
            } else {
                error.innerHTML = "";
                getFields["group"] = true;
                getFields["otherEventType"] = true;
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