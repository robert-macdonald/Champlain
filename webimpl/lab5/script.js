/**
 * Created by robert on 2/20/17.
 */
var dorm = document.getElementById("dorm");
var next = document.getElementById("next");
var supper = document.getElementById("supper");
var images = document.getElementsByName("image");

dorm.addEventListener("mouseover", showFirst);
dorm.addEventListener("mouseout", hideFirst);

next.addEventListener("mouseover", showSecond);
next.addEventListener("mouseout", hideSecond);

supper.addEventListener("mouseover", showThird);
supper.addEventListener("mouseout", hideThird);

function showFirst() {
    images[0].setAttribute("display", "show");
    images[1].setAttribute("display", "show");
}
function hideFirst() {
    images[0].setAttribute("class", "hide");
    images[1].setAttribute("class", "hide");
}

function showSecond() {
    images[2].setAttribute("class", "show");
    images[3].setAttribute("class", "show");
}
function hideSecond() {
    images[2].setAttribute("class", "hide");
    images[3].setAttribute("class", "hide");
}

function showThird() {
    images[4].setAttribute("class", "show");
    images[5].setAttribute("class", "show");
}
function hideThird() {
    images[4].setAttribute("class", "hide");
    images[5].setAttribute("class", "hide");
}