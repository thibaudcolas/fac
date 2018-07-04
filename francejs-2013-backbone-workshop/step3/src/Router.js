var Router = Backbone.Router.extend( {
  routes: {
    '/*'      : 'routeHome'
    ,'home'   : 'routeHome'
    ,'about'  : 'routeAbout'
  }

  , currentPage: undefined

  , routeHome: function( route )
  {
    if ( this.currentPage != undefined )
      this.currentPage.destroy();

    this.currentPage = new HomeView().render();
    $( '.pages.container' ).append( this.currentPage.el );
    $( '.nav li' ).removeClass( 'active' );
    $( '.nav .home' ).addClass( 'active' );
  }

  , routeAbout: function( route )
  {
    if ( this.currentPage != undefined )
      this.currentPage.destroy();

    this.currentPage = new AboutView().render();
    $( '.pages.container' ).append( this.currentPage.el );
    $( '.nav li' ).removeClass( 'active' );
    $( '.nav .about' ).addClass( 'active' );
  }
} );
