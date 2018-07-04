var eventUtility;

(function () {
  "use strict";

  eventUtility = {
    getTarget : function (e) {
      return typeof e.target !== "undefined" ? e.target : e.srcElement;
    },

    preventDefault : function (e) {
      if (typeof e.preventDefault !== "undefined") {
        e.preDefault();
      }
      else {
        e.returnValue = false;
      }
    },

    getCharCode : function (e) {
      return e.charCode || e.keyCode;
    }
  };

})();


