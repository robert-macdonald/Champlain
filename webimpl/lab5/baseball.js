/**
 * Created by robert on 3/6/17.
 */
document.getElementsByTagName("select")[0].onclick(changeTeam());

function changeTeam() {
    var team = document.getElementsByName("team");
    var show = document.getElementsByTagName("p");
    for (var i = 0; i < team.length; i++){
        if(team[i].selected){
            show[i].setAttribute("class", "show");
        } else {
            show[i].setAttribute("class", "hide");
        }
    }
}