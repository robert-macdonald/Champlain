/**
 * Created by robert on 2/6/17.
 */

// Final values
var morningS = 37;
var fullDayS = 43;
var afternoonS = 35;
var morning = 54;
var afternoon = 51;
var fullDay = 62;

//prices
var priceM = 0;
var priceA = 0;
var priceF = 0;

function ageGroup() {
    var age = document.getElementsByName("age");
    var amount = document.getElementsByName("amount");
    for(var i = 0; i < age.length; i++){
        if(age[i].checked){
            if(age[i].value == "student"){
                priceM = (morningS * amount[i].value);
                priceA = (afternoonS * amount[i].value);
                priceF = (fullDayS * amount[i].value);
            }
            if (age[i].value == "18"){
                priceM = (morning * amount[i].value);
                priceA = (afternoon * amount[i].value);
                priceF = (fullDay * amount[i].value);
            }
            if (age[i].value == "65"){
                priceM = (morningS * amount[i].value);
                priceA = (afternoonS * amount[i].value);
                priceF = (fullDayS * amount[i].value);
            } else {
                priceM = 5;
                priceA = 5;
                priceF = 5;
            }
        }
    }
}
function getTicketPrice(){
    var time = document.getElementsByName("time");
    for(var i = 0; i < time.length; i++){
        if(time[i].checked){
            if (time[i].value == "morning"){
                return priceM;
            } else if(time[i].value == "afternoon"){
                return priceA;
            } else if(time[i].value == "full"){
                return priceF;
            }
        }
    }
}
function getTotal() {
    document.getElementById("total").innerHTML = "Total: " + getTicketPrice();
}
function getWindChill() {
    var temp = document.getElementById("temp").value;
    var windSpeed = document.getElementById("wind").value;
    return temp - (1.5 * windSpeed);
}
function resetWind() {
    document.getElementById("temp").value = "0";
    document.getElementById("wind").value = "0";
}