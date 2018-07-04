var Router = Backbone.Router.extend( {
  routes:{
    '*path'      : 'routing'
  }
  
  , initialize: function()
  {
    for ( var i in this.pages )
      this.pages[ i ] = new this.pages[ i ];
  }
  , pages: {
    "home"  : HomeView
    ,"about": AboutView
  }
  
  , currentPage: undefined
  , routing: function( route )
  {
    console.log( "%c[ROUTE] :: ", "background-color:#222222; color:yellow", route );
    route = route || "";
    route = route.split( '/' );
    var page = route[ 0 ] || null;
    
    if ( !route || route.length == 0 || !this.pages[ route[ 0 ].toLowerCase() ] )
    {
      console.log( "No route given, routing on default", "background-color:#222222; color:orange" );
      var page = "home";
    }
    page = page.toLowerCase();
    
    if ( this.currentPage != undefined )
      this.currentPage.destroy();
    
    this.currentPage = this.pages[ page ];
    this.currentPage.route( route );
    $( '.pages.container' ).append( this.currentPage.el );
    $( '.nav li' ).removeClass( 'active' );
    $( '.nav .' + page ).addClass( 'active' );
  }
} );