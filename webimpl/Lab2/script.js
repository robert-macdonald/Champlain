/**
 * Created by robert on 1/30/17.
 */
var playerNames = ["Russel Westbrook", "James Harden", "Lebron James"];
var gamesPlayed = [67, 81, 69];
var fieldGoals = [627, 647, 624];
var freeThrows = [375, 715, 546];
var headerTag = document.getElementsByTagName("th");
var descTag = document.getElementsByTagName("td");
var tableTag = document.getElementsByTagName("table");

function getTotal(index) {
    return fieldGoals[index] + freeThrows[index];
}
function getAverage(index) {
    return getTotal(index) / gamesPlayed[index];
}
function createTable() {
    document.write("<table style='100%' id='createdTable'>");
    document.write("<th>Player Name</th>");
    document.write("<th>Games Played</th>");
    document.write("<th>Field Goals</th>");
    document.write("<th>Free Throws</th>");
    document.write("<th>Total Points</th>");
    document.write("<th>Average Points</th>");
    for(var i = 0; i < playerNames.length; i++){
        document.write("<tr>");
        document.write("<td>" + playerNames[i] + "</td>");
        document.write("<td>" + gamesPlayed[i] + "</td>");
        document.write("<td>" + fieldGoals[i] + "</td>");
        document.write("<td>" + freeThrows[i] + "</td>");
        document.write("<td>" + getTotal(i) + "</td>");
        document.write("<td>" + getAverage(i) + "</td>");
        document.write("</tr>");
    }
    document.write("</table>");
    for(var h = 0; h < headerTag.length; h++){
        headerTag[h].style.border = "1px solid black";
    }
    for(var d = 0; d < descTag.length; d++){
        descTag[d].style.border = "1px solid black";
    }
    for(var t = 0; t < tableTag.length; t++) {
        tableTag[t].style.border = "1px solid black";
    }
}