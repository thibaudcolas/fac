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
  
  , delete: function()
  {
    // add this to trigger destroy event and remove it from array
    // prevent zombie views
    this.trigger( 'delete', this );
    this.model.destroy();
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