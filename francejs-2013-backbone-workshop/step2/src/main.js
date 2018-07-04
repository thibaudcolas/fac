window.onload = function()
{
  var editor = new TodoEditor( { el: $( '.todoEdit' ) } );
  editor.render();
  
  Todos.map( function( m, i )
  {
    addTodo( m );
  } );
  Todos.on( 'add', addTodo );
  
  // step 2
  // simple way to do this
  Todos.on( 'sort', function()
  {
    for ( var i in views )
    {
      views[ i ].remove(); // remove from dom
      delete views[ i ];   // remove from object container
    }
    Todos.map( function( m, i )
    {
      addTodo( m );
    } );
  } );
}

var views = {};
function addTodo( model )
{
  var v = new TodoView( { model: model } );
  $( '.todoList' ).append( v.render().el );
  
  // add id
  v.id = Date.now() + ( Math.random() * Date.now() ) >> 0; // little hacky to prevent not unique id
  views[ v.id ] = v ;
  // create a manual binding to remove view from object container
  v.on( 'delete', function( v ){
    delete views[ v.id ];
  } );
}