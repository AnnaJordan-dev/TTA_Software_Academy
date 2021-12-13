function checkFullname() {
    var fullname = document.getElementById("fullname").value
    if(fullname=="" || fullname==null)
      {
        document.getElementById("fmsg").innerText = "Please enter your name"
      }
    }

function checkEmail()   { 
    var email = document.getElementById("email").value
    if(email=="" || email==null)
      {
      document.getElementById("emsg").innerText = "Please enter your email"
      }
    }

function checkMobile() {
    var mobile = document.getElementById("mobile").value
    if(mobile=="" || mobile==null)
      {
    document.getElementById("mmsg").innerText = "Please enter your number"
      } 
    }

function checkCountry() {
    var country = document.getElementsByName("country")
    if(country=="" || country==null)
      {
        document.getElementById("cmsg").innerText = "Please select your country"
      } 
}
    
function checkGender() {
  var gender = document.getElementByName("gender")
  if(gender=="" || gender==null)
  {
    document.getElementById("gmsg").innerText = "Please select your gender"
  } 
}