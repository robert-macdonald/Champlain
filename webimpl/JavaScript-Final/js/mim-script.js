var bal = 500;

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

// Login form
$('#login').on('submit', function (event) {
  if ($('#username').val() === "robert" && $('#password').val() === "password123"){
    $('#login-section').addClass("hidden");
    $('#wallet-section').removeClass("hidden");
  } else {
    alert("Invalid login");
  }
  event.preventDefault();
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
