var TodoEditor = Backbone.View.extend( {
  tagName: "div"
  , className: "editor"
  
  , events: {
    "keypress input":  "createOnEnter"
    ,"click .create": "create"
  }
  
  // initialize don't allow to params custom values
  /*, constructor: function( params )
  {
    params = params || {};
    params.templateName = params.templateName || "TodoEditor"; // like this
    Backbone.View.call( this, params );
  }*/
  
  , render: function()
  {
    this.$el.html( _.template( $( "#TodoEditor" ).html(), {} ) );
    this.$title = this.$el.find( '#todoEditTitle' );
    this.$content = this.$el.find( '#todoEditContent' );
    
    return this;
  }
  
  , create: function()
  {
    var todo = {
      "title"    : this.$title.val()
      ,"content": this.$content.val()
    };
    
    Todos.add( todo, { validate: true } );
  }
  
  , createOnEnter: function( e )
  {
    if ( e.keyCode == 13 )
      this.create();
  }
  
  // step 3
  , destroy: function()
  {
    this.remove();
  }
} );