$(function() {
  var tooltipContainer = $('#tooltip-container');
  // Target three different mouse events.
  $('.tooltip').mouseover(function (e) {
    if ($(this).attr('data-tip').startsWith("tooltip-")) {
      tooltipContainer.html($('#' + $(this).attr('data-tip')).html());
    }
    else {
      tooltipContainer.html($(this).attr('data-tip'));
    }

    tooltipContainer.css({'display':'block','opacity':0}).stop().animate({opacity:1}, 250);

  }).mousemove(function (e) {
    var tooltipWidth = tooltipContainer.outerWidth();
    var tooltipHeight = tooltipContainer.outerHeight();

    // Mouse coordinate. Minus 20 to make it go to the right bottom of the mouse.
    if (e.pageX > $('body').width() / 2) {
      // Aligned to the right.
      tooltipContainer.css('left',(e.pageX - tooltipWidth + 20) + 'px');
    }
    else {
      // Aligned to the left.
      tooltipContainer.css('left',(e.pageX - 20) + 'px');
    }

    if (e.pageY > 100) {
      // Top of cursor.
      tooltipContainer.css('top',(e.pageY - tooltipHeight - 20) + 'px');
    }
    else {
      // Bottom of cursor.
      tooltipContainer.css('top',(e.pageY + 20) + 'px');
    }
  }).mouseout(function (e) {
      tooltipContainer.stop().animate({opacity:0}, 250, function() {
      tooltipContainer.css('display','none').html('');
    });
  });
});
