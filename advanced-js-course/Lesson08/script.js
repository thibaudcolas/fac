(function (w, util) {
    "use strict";

    var form     = document.getElementById("theForm"),
        button   = form.myButton,
        textbox  = form.myTextbox,
        textarea = form.myTextArea,
        select   = form.dayOfWeek,
        color    = form.color;

    util.addEvent(form, "submit", function (e) {
        util.preventDefault(e);
    });

    util.addEvent(button, "click", function (e) {
        var target = util.getTarget(e);

        var pickedColor = "";

        for (var i = 0, l = color.length; i < l; i = i + 1) {
            if (color[i].checked) {
                pickedColor = color[i].value;
            }
        }

        w.alert(pickedColor);

        //alert("you wclicked me!");

    });

}(window, eventUtility));
