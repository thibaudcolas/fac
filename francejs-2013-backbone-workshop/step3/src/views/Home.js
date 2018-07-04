var HomeView = Backbone.View.extend( {
  tagName: "div"
  , className: "home"
  
  , views: {
    'editor': new TodoEditor()
    ,'todos': new TodoList()
  }
  
  , initialize: function()
  {
    this.template = _.template( $( '#Home' ).html() );
  }
  
  , render: function()
  {
    this.$el.html( this.template( {} ) );
    this.$el.find( '.todoEdit' ).append( this.views.editor.render().el );
    
    Todos.map( function( m, i )
    {
      this.addTodo( m );
    }, this );
    Todos.on( 'add', this.addTodo, this );
    
    // step 2
    Todos.on( 'sort', function()
    {
      this.views.todos.destroy(); // simplified
      Todos.map( function( m, i )
      {
        this.addTodo( m );
      }, this );
    }, this );
    
    return this;
  }
  
  , addTodo: function( model )
  {
    var v = new TodoView( { model: model } );
    this.$el.find( '.todoList' ).append( v.render().el );
    
    // order sort
    v.id = Date.now() + ( Math.random() * Date.now() ) >> 0; // little hacky to prevent not unique id
    this.views.todos.views[ v.id ] = v;
    v.on( 'delete', function( v ){
      delete this.views.todos.views[ v.id ];
    }, this );
  }
  
  , destroy: function()
  {
    for ( var i in this.views )
    {
      this.views[ i ].destroy();
    }
    this.remove();
  }
} );