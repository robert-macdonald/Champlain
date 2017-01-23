/**
 * Created by robert on 1/23/17.
 */
function semOne() {
    window.alert('You must click the link to see original page.');
    document.getElementById("semester").innerHTML = "Semester One";
    document.getElementById("btn1").style.display = "none";
    document.getElementById("btn2").style.display = "none";
    document.getElementById("listOne").style.display = "block";
    document.getElementById("listTwo").style.display = "none";
    document.getElementById("home").style.display = "block";
}
function semTwo() {
    window.alert('You must click the link to see original page.');
    document.getElementById("semester").innerHTML = "Semester Two";
    document.getElementById("btn1").style.display = "none";
    document.getElementById("btn2").style.display = "none";
    document.getElementById("listTwo").style.display = "block";
    document.getElementById("listOne").style.display = "none";
    document.getElementById("home").style.display = "block";
}