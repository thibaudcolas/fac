var CORE = (function () {
  var moduleData = {};
  var to_s = function (anything) { return Object.prototype.toString.call(anything); };
  var debug = true;

  return {
    debug : function (on) {
      debug = on ? true : false;
    },
    create_module : function (moduleID, creator) {
      var temp;
      if (typeof moduleID === 'string' && typeof creator === 'function') {
        temp = creator(Sandbox.create(this, moduleID));
        if (temp.init && typeof temp.init === 'function' && temp.destroy && typeof temp.destroy === 'function') {
          temp = null;
          moduleData[moduleID] = {
            create : creator,
            instance : null
          };
        }
        else {
          this.log(1, "Module '" + moduleID + "' Registration : FAILED : instance has no init or destroy");
        }
      }
      else {
          this.log(1, "Module '" + to_s(moduleID) + "' Registration : FAILED : corrupted arguments");
      }
    },
    start : function (moduleID) {
      var mod = moduleData[moduleID];
      if (mod) {
        mod.instance = mod.create(Sandbox.create(this, moduleID));
        mod.instance.init();
      }
    },
    start_all : function () {
      var moduleID;
      for (moduleID in moduleData) {
        if (moduleData.hasOwnProperty(moduleID)) {
          this.start(moduleID);
        }
      }
    },
    stop : function (moduleID) {
      var data;
      if (data = moduleData[moduleID] && data.instance) {
        data.instance.destroy();
        data.instance = null;
      }
      else {
        this.log(1, "Stop Module '" + moduleID + "' FAILED : module does not exist");
      }
    },
    stop_all : function () {
      var moduleID;
      for (moduleID in moduleData) {
        if (moduleData.hasOwnProperty(moduleID)) {
          this.stop(moduleID);
        }
      }
    },
    registerEvents : function (evts, moduleID) {
      if (this.is_obj(evts) && moduleID) {
        if (moduleData[moduleID]) {
          moduleData[moduleID].events = evts;
        }
        else {
          this.log(1, "Register events Module '" + moduleID + "' FAILED : module does not exist");
        }
      }
      else {
        this.log(1, "Register events Module '" + moduleID + "' FAILED : erroneous parameters");
      }
    },
    triggerEvent : function (evt) {
      var mod;
      for (mod in moduleData) {
        if (moduleData.hasOwnProperty(mod)) {
          mod = moduleData[mod];
          if (mod.events && mod.events[evt.type]) {
            mod.events[evt.type](evt.data);
          }
        }
      }
    },
    removeEvents : function (evts, mod) {
      if (this.is_obj(evts) && mod && (mod = moduleData[mod]) && mod.events) {
        delete mod.events;
      }
    },
    log : function (severity, message) {
      if (debug) {
        var fun = {
          1 : 'log',
          2 : 'warn',
          3 : 'error'
        };
        console[fun[severity]](message);
      }
    },
    dom : {
      query : function (selector, context) {},
      bind : function (element, evt, fn) {},
      unbind : function (element, evt, fn) {},
      create : function (el) {
        return document.createElement(el);
      },
      apply_attrs : function (el, attrs) {}
    },
    is_arr : function (arr) {},
    is_obj : function (obj) {}
  };
}());
