var TodoModel = Backbone.Model.extend( {
  defaults: function()
  {
    return {
      title    : ""
      , content: ""
      , order  : Todos.nextOrder()
      , done   : false
      , date   : Date.now()
    };
  }
  
  , toggle: function()
  {
    this.save( { done: !this.get( "done" ) } );
  }
} );