var bal = 0;
// jQuery to collapse the navbar on scroll
function collapseNavbar() {
  if ($(".navbar").offset().top > 50) {
    $(".navbar-fixed-top").addClass("top-nav-collapse");
    $("#top-link").removeClass("hidden");
  } else {
    $(".navbar-fixed-top").removeClass("top-nav-collapse");
    $("#top-link").addClass("hidden");
  }
}

$(window).scroll(collapseNavbar);
$(document).ready(collapseNavbar);

$(document).ready(function () {
  $('#balance').text('Balance: ' + bal);
});

// jQuery for page scrolling feature
$(function() {
  $('a.page-scroll').bind('click', function(event) {
    var $anchor = $(this);
    $('html, body').stop().animate({
      scrollTop: $($anchor.attr('href')).offset().top
    }, 1500, 'easeInOutExpo');
    event.preventDefault();
  });
});

// Closes the Responsive Menu on Menu Item Click
$('.navbar-collapse ul li a').click(function() {
  $(".navbar-collapse").collapse('hide');
});

// Sending money from user to user
$('#send').on('submit', function (event) {
  var amount = $('#amount').val();
  if (amount <= bal){
    bal -= amount;
    $('#balance').text('Balance: ' + bal);
    alert('Transaction sent!');
  } else {
    alert('Insufficient funds' + amount);
  }
  event.preventDefault();
});

// Login form with ajax
$('#login').on('submit', function (e) {
  $.ajax({
    dataType: "json",
    type: "GET",
    url: 'https://api.myjson.com/bins/1gr2p5',
    success: function (responseObject) {
      $.each(responseObject, function (index, data) {
        $.each(data, function (index, users) {
          if (users.username == $('#username').val()){
            if (users.password == $('#password').val()){
              $('#login-section').addClass("hidden");
              $('#wallet-section').removeClass("hidden");
              bal = users.balance;
              $('#balance').text('Balance: ' + bal);
            } else {
              alert('invalid login');
            }
          } else {
            alert('invalid login');
          }
        });
      });
    }
  });
  e.preventDefault();
});

// Create new account with ajax and php
$('#create-button').on('click', function (e) {

  var exists = false;

  $.ajax({
    dataType: "json",
    type: "GET",
    url: 'https://api.myjson.com/bins/1gr2p5',
    success: function (responseObject) {
      $.each(responseObject.data, function (index, users) {
        if (users.username == $('#username').val()){
          alert('Username already taken');
          exists = true;
        }
      });
    }
  });

    if (exists == false){
      var user = {
        username: $('#username').val(),
        password: $('#password').val(),
        balance: 0
      }
    }

  $.ajax({
    type : "POST",
    url : "json.php",
    data : {
        json : JSON.stringify(user)
    }
  });
  e.preventDefault();
});
