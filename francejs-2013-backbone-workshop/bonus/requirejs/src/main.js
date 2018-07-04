require.config( {
  baseUrl: "./src/"
  ,paths: {
    'jquery'     : 'libs/jquery-2.0.3.min'
    ,'underscore': 'libs/underscore-min'
    ,'backbone'  : 'libs/backbone-min'
    ,'Router'    : 'Router.js'
    ,'TodoList'  : 'TodoList.js'
    
    // collections
    
    // libs
    
    // models
    
    // pages
    
    // views
  }
  ,shim: {
    'jquery': {
      exports: '$'
    }
    ,'underscore': {
      deps: [ 'jquery' ]
      ,exports: '_'
    }
    ,'backbone': {
      deps: [ 'underscore' ]
      ,exports: 'Backbone'
    }
  }
  , "urlArgs": "r=" + Date.now() // will be destroy when grunted
} );

require( [ 'Router', 'backbone' ],
function( Router, Backbone )
{
  var app = new Router();
  Backbone.history.start();
} );