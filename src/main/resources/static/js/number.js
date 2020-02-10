// Function to validate user input
function validate() {
  var phoneNum = document.getElementById("number").value;
  var error = document.getElementById("error");
  var button = document.getElementById("submit");
  // If phone number is  7  10 digits and contains only digits
  if (phoneNum.length == 7 && phoneNum.match(/^[0-9]+$/) || phoneNum.length == 10 && phoneNum.match(/^[0-9]+$/)){
     // hide error message, make submit button clickable
     error.style.display = "none";
     button.disabled = false;
  }
  else{
    // Show error message, disable submit button
    error.style.display = "block";
    error.style.color = "Red";
    button.disabled = true;
  }
}