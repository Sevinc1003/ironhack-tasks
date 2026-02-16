

var display = document.getElementById('display').value;

var firstNum = "";
var secondNum = "";
var operationType = "";


function addToDisp(int) {


    document.getElementById('display').value += int;
}

function zero(){
    if(document.getElementById('display').value === ""){
        return;
    }
    else{
        document.getElementById('display').value += "0";
    }
}

function clearDisp() {

    document.getElementById('display').value = "";
}

function operation(element) {

    firstNum = +document.getElementById("display").value;
    document.getElementById('display').value = "";
    operationType = element.innerText;
}


function equals() {

    var result;

    secondNum = +document.getElementById("display").value;
    document.getElementById('display').value = "";

    switch (operationType) {
        case "+":
            result = firstNum + secondNum;
            document.getElementById('display').value = result;
            break;
    
        case "-":
            result = firstNum - secondNum;
            document.getElementById('display').value = result;
            break;
        case "*":
            result = firstNum * secondNum;
            document.getElementById('display').value = result;
            break;
        case "/":
            result = firstNum / secondNum;
            document.getElementById('display').value = result;
            break;
        default:
            break;
    }
}

