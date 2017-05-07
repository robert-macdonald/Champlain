var answer;
$('#pValue').on('focus', function () {
    $('#pValue').reset();
    $('#pValue').removeClass('errorClass');
  }
);
$('form').on('submit', function (event) {
    if ($('#pValue').val() < 0){
      $('#pValue').addClass('errorClass');
    } else {
      answer = $('#pValue').val() * .45;
      $('#kValue').text(answer).show();
      alert('success');
    }
    event.preventDefault();
  }
);
$('form').on('reset', function (event) {
    $('#kValue').text('').show();
    $('form').reset();
    event.preventDefault();
  }
);
