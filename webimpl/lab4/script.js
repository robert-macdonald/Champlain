/**
 * Created by robert on 2/6/17.
 */
var ticketList = [];

function Ticket(type, time, amount) {
    this.ticketType = type;
    this.ticketTime = time;
    this.ticketAmount = amount;

    this.getPrice = function () {
        if (this.ticketAmount > 0) {
            if (type === "0") {
                if (this.ticketTime === "0") {
                    return 37 * Math.round(this.ticketAmount);
                } else if (this.ticketTime === "1") {
                    return 35 * Math.round(this.ticketAmount);
                } else if (this.ticketTime === "2") {
                    return 43 * Math.round(this.ticketAmount);
                } else {
                    window.alert("Invalid time");
                    ticketList.pop();
                }
            } else if (this.ticketType === "1") {
                if (this.ticketTime === "0") {
                    return 54 * Math.round(this.ticketAmount);
                } else if (this.ticketTime === "1") {
                    return 51 * Math.round(this.ticketAmount);
                } else if (this.ticketTime === "2") {
                    return 62 * Math.round(this.ticketAmount);
                } else {
                    window.alert("Invalid time");
                    ticketList.pop();
                }
            } else {
                window.alert("Invalid age");
                ticketList.pop();
            }
        } else {
            window.alert("Invalid amount, input positive number.");
            ticketList.pop();
        }
    };
}
function createNewTicket() {
    var time = document.getElementById("day");
    var type = document.getElementById("age");
    var amount = document.getElementById("quantity");

    ticketList.push(new Ticket(type.value, time.value, amount.value));
}
function removeTicket() {
    ticketList.pop();
}
function getTotalPrice() {
    var sum = 0;
    var printSum = document.getElementById("total");
    for (var index = 0; index < ticketList.length; index++) {
        sum += ticketList[index].getPrice();
    }
    var tax = Math.round((0.015 * sum) * 100) / 100;
    var totalAfterTax = sum + tax;
    printSum.innerHTML = "Subtotal: $" + sum + "<br>" + "Tax: $" + tax + "<br>" + "Total: $" + totalAfterTax;
}
function getWindChill() {
    var temp = document.getElementById("temp").value;
    var windSpeed = document.getElementById("wind").value;
    if (windSpeed < 0) {
        return "Cannot use negative numbers";
    } else if (windSpeed > 0) {
        return temp - (1.5 * windSpeed);
    }
}
function resetWind() {
    document.getElementById("temp").value = "0";
    document.getElementById("wind").value = "0";
}
function resetTickets() {
    var time = document.getElementById("day");
    var age = document.getElementById("age");
    var amount = document.getElementById("quantity");

    time.value = 0;
    age.value = 0;
    amount.value = 0;

    for (var i = 0; i < ticketList.length; i++) {
        ticketList.splice(i);
    }

    document.getElementById("total").innerHTML = "";
}