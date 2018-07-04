window.onload = function()
{
  // create EditorView
  var editor = new TodoEditor( { el: $( '.todoEdit' ) } );
  editor.render();
  //
  // maping collection to create all Todos
  Todos.map( function( m, i )
  {
    addTodo( m );
  } );
  // bind add Event on collection
  Todos.on( 'add', addTodo );
}

var views = {};
function addTodo( model )
{
  var v = new TodoView( { model: model } );
  $( '.todoList' ).append( v.render().el );
}
