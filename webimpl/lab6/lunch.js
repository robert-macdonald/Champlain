/**
 * Created by robert on 3/8/17.
 */
/*
    Buttons
 */
var calc = document.getElementById("sButton");
var clear = document.getElementById("rButton");

/*
    Price variables
 */
var sub = document.getElementById("subtotal");
var tax = document.getElementById("tax");
var total = document.getElementById("total");
var subtotal = 0.00;

calc.addEventListener("click", calculate);
clear.addEventListener("click", reset);

function calculate() {
    var options = document.getElementsByName("items");
    for (var i in options) {
        if (options[i].checked) {
            subtotal += parseFloat(options[i].value);
        }
        tax.innerHTML = Math.round((subtotal * 0.15) * 100) / 100;
        sub.innerHTML = subtotal;
        total.innerHTML = Math.round((subtotal * 1.15) * 100) / 100;
    }
}
function reset() {
    subtotal = 0.00;
    tax.innerHTML = "0.00";
    sub.innerHTML = "0.00";
    total.innerHTML = "0.00";
}