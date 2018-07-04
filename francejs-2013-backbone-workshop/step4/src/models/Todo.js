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
  
  
  // step 2
  , upMe: function()
  {
    var next = this.collection.findWhere( { order: this.get( 'order' ) - 1 } );
    if ( !next )
      return;
    
    next.set( 'order', this.get( 'order' ) );
    this.set( 'order', this.get( 'order' ) - 1 );
    this.collection.sort();
  }
  
  , downMe: function()
  {
    var next = this.collection.findWhere( { order: this.get( 'order' ) + 1 } );
    if ( !next )
      return;
    
    next.set( 'order', this.get( 'order' ) );
    this.set( 'order', this.get( 'order' ) + 1 );
    this.collection.sort();
  }
} );