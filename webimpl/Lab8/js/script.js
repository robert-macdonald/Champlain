var listItems = document.getElementsByTagName('li');
var instructions = document.getElementsByTagName('p');
$("#ingr").hover(
  function() {
    for (var i = 0; i < listItems.length; i++){
      if (i % 2 == 0){
        listItems[i].style.color = "red";
      } else {
        listItems[i].style.color = "blue";
      }
    }
  },
  function(){
    for (var x = 0; x < listItems.length; x++){
      listItems[x].style.color = "black";
    }
  }
);
$("#instr").hover(
  function(){
    $(".instr").slideDown(1000);
  },
  function(){
    $(".instr").slideUp(1000);
  }
);
