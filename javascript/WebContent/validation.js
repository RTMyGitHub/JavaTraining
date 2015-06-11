/**
 * 
 */
function validate() {
	
	var errorHTML = "";
	
	if(document.getElementById("firstName").value == "") {
		errorHTML = errorHTML + "<li>First name cannot be blank</li>";
	}
	
	if(document.getElementById("lastName").value == "") {
		errorHTML = errorHTML + "<li>Last name cannot be blank</li>";
	}
	
	var zip = document.getElementById("zipCode").value;
	if(zip == "") {
		errorHTML = errorHTML + "<li>Zip cannot be blank</li>";
	} else if(isNaN(zip) || (zip.length != 5)) {
		errorHTML = errorHTML + "<li>Zip must be 5 digits</li>";
	}
	
	var age = document.getElementById("age").value;
	
	if(age == "") {
		errorHTML = errorHTML + "<li>Age cannot be blank</li>";
	} else if(isNaN(age) || age < 1 || age > 120) {
		errorHTML = errorHTML + "<li>Age must be between 1 and 120</li>";
	}
	
	var state = document.getElementById("state");
	var selectedIndex = state.selectedIndex;
	
	var selectedOptionText = state.options[selectedIndex].text;
	var selectedOptionValue =  state.options[selectedIndex].value;
	
	if(selectedIndex == 0) {
		errorHTML = errorHTML + "<li>State must be selected</li>";
	}
	
	document.getElementById("errorMessage").innerHTML = errorHTML;
	
}
