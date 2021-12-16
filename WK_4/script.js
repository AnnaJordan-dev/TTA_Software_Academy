// Define function to display error message
function printError(elemId, hintMsg) {
  document.getElementById(elemId).innerHTML = hintMsg
}

function validateForm() {
  // Retrieving the form value
  var name = document.contactForm.name.value
  var email = document.contactForm.email.value
  var mobile = document.contactForm.mobile.value
  var country = document.contactForm.country.value
  var gender = document.contactForm.gender.value
  var hobbies = []
  var checkboxes = document.getElementsByName("hobbies[]")
  for(var i=0; i < checkboxes.length; i++) {
      if(checkboxes[i].checked) {
          // Populate hobbies array with selected values
          hobbies.push(checkboxes[i].value)
      }
  }
  
// Define error variables with a default value
  var nameErr = emailErr = mobileErr = countryErr = genderErr = true;
  
  
  if(name == "") {
      printError("nameErr", "Please enter your name")
  } else {
          printError("nameErr", "");
          nameErr = false;
      }
  }
  
  
  if(email == "") {
      printError("emailErr", "Please enter your email address");
  } else {
          printError("emailErr", "");
          emailErr = false;
      }
  
  
  if(mobile == "") {
      printError("mobileErr", "Please enter your mobile number");
  } else {
          printError("mobileErr", "");
          mobileErr = false;
      }
  
  
  if(country == "Select") {
      printError("countryErr", "Please select your country");
  } else {
      printError("countryErr", "");
      countryErr = false;
  }
  
  if(gender == "") {
      printError("genderErr", "Please select your gender");
  } else {
      printError("genderErr", "");
      genderErr = false;
  }
