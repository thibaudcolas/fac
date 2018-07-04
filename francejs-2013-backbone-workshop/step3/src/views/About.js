var AboutView = Backbone.View.extend( {
  tagName: "div"
  , className: "about"
  
  , views: {
  }
  
  , initialize: function()
  {
    this.template = _.template( $( '#About' ).html() );
  }
  
  , render: function()
  {
    this.$el.html( this.template( {} ) );
    return this;
  }
  
  , destroy: function()
  {
    for ( var i in this.views )
    {
      this.views[ i ].destroy();
      delete this.views[ i ];
    }
    this.remove();
  }
} );