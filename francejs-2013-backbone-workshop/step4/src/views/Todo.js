var TodoView = Backbone.View.extend( {
  tagName: "div"
  , className: "ticket"
  
  , events: {
    "click .done"     : "toggleDone"
    , "click"         : "open"
    , "dblclick"      : "edit"
    , "click .close"  : "delete"
    , "click .down"   : "orderDown"
    , "click .up"     : "orderUp"
  }
  
  , initialize: function()
  {
    this.template = _.template( $( '#TodoV1' ).html() );
    this.listenTo( this.model, 'change', this.render );
    this.listenTo( this.model, 'destroy', this.remove );
  }
  
  , render: function()
  {
    this.$el.html( this.template( { todo: this.model.toJSON() } ) );
    return this;
  }
  
  , toggleDone: function()
  {
    this.model.toggle();
  }
  
  , edit: function( e )
  {
    if ( $( e.target ).hasClass( "btn" ) )
      return;
    this.$el.addClass( "editing" );
    this.input.focus();
  }
  
  , open: function( e )
  {
    if ( $( e.target ).hasClass( "btn" ) )
      return;
    this.$el.toggleClass( "zone-hidden" );
  }
  
  , updateOnEnter: function( e )
  {
    if ( e.keyCode == 13 )
      this.close();
  }
  
  , delete: function()
  {
    this.model.destroy();
    this.trigger( 'delete', this );
  }
  
  , destroy: function()
  {
    this.remove();
  }
  
  // step 2
  , orderUp: function( e )
  {
    this.model.upMe();
  }
  , orderDown: function()
  {
    this.model.downMe();
  }
} );