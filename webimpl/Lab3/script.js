/**
 * Created by robert on 2/1/17.
 */
var points = 0;

function questionOne() {
    var q1 = document.getElementsByName("question1");
    for (var i = 0; i < q1.length; i++){
        if(q1[i].checked){
            if (q1[i].value == "a"){
                window.alert("Correct!");
                points += 1;
            } else {
                window.alert("Incorrect!");
            }
        }
    }
}
function questionTwo() {
    var q2 = document.getElementsByName("question2");
    for (var i = 0; i < q2.length; i++){
        if(q2[i].checked){
            if (q2[i].value == "c"){
                window.alert("Correct!");
                points += 1;
            } else {
                window.alert("Incorrect!");
            }
        }
    }
}
function questionThree() {
    var q3 = document.getElementsByName("question3");
    for (var i = 0; i < q3.length; i++){
        if(q3[i].checked){
            if (q3[i].value == "b"){
                window.alert("Correct!");
                points += 1;
            } else {
                window.alert("Incorrect!");
            }
        }
    }
}
function questionFour() {
    var q4 = document.getElementsByName("question4");
    for (var i = 0; i < q4.length; i++){
        if(q4[i].checked){
            if (q4[i].value == "b"){
                window.alert("Correct!");
                points += 1;
            } else {
                window.alert("Incorrect!");
            }
        }
    }
}
function questionFive() {
    var q5 = document.getElementsByName("question1");
    for (var i = 0; i < q5.length; i++){
        if(q5[i].checked){
            if (q5[i].value == "a"){
                window.alert("Correct!");
                points += 1;
            } else {
                window.alert("Incorrect!");
            }
        }
    }
}

function isPassingGrade() {
    return points / 5 >= 0.6;
}

function validateForm() {
    if (isPassingGrade()){
        window.alert("You Passed with " + points + " points.");
    }
    else window.alert("You Failed with " + points + " points")
}