function optionCheck() {
    
    var a = document.getElementById('input').value;
    if (a === 'Maharashtra') {
        var array = ["Pune", "Palghar", "Thane"];
    }
    else if (a === 'Kerala') {
        var array = ["Irinjalakuda", "Thirissur", "Shornur"];
    }
    else {
        var array = [];
    }

    var optionValue = "";
    for(i =0 ; i <  array.length; i++){

        optionValue = optionValue + "<option>"+array[i]+"</option>"; 
    } 
    optionValue = "<select name = 'lol'>"+optionValue+"</select>";
    document.getElementById('output').innerHTML = optionValue;
};

function validate(){
    var name  = document.getElementById('name').value;
    var mobileNumber = document.getElementById('contact_mobile').value;
    var email = document.getElementById('contact_email').value;
    var instCode = document.getElementById('inst_code').value;
    var aadharNo =  document.getElementById('aadhar_no').value;
    var bankIFSC = document.getElementById('bank_ifsc').value;
    var bankAccNo = document.getElementById('acc_no').value;
    var bankName = document.getElementById('bank').value;
    var setPassword = document.getElementById('set_pass').value;
    var confPassword = document.getElementById('conf_pass').value;
    
    var submit="true";
    var alphaExp = /^[a-zA-Z]+$/;
    var phoneno = /^\d{10}$/;
    var aadharVal = /^\d{12}$/;
    var alphaExp= /^[a-zA-Z]+$/;
    var phoneVal = /^\d{10}$/;
    var pinVal= /^\d{6}$/;


    if( name == '' || mobileNumber == '' || email == '' || instCode == '' || aadharNo == '' || bankIFSC == '' || bankAccNo == ''
        || bankName == '' || setPassword == '' || confPassword == ''){
            alert("FIELDS CANNOT BE EMPTY");
            return false;
        }  
    else{
            return true;
        }
            
};