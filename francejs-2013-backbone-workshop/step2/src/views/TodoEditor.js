var TodoEditor = Backbone.View.extend( {
  events: {
    "keypress input":  "createOnEnter"
    ,"click .create": "create"
  }
  
  , render: function()
  {
    this.$el.html( _.template( $( "#TodoEditor" ).html(), {} ) );
    this.$title = this.$el.find( '#todoEditTitle' );
    this.$content = this.$el.find( '#todoEditContent' );
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
} );