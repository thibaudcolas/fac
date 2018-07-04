var TodosList = Backbone.Collection.extend( {
  
  model: TodoModel
  
  , order: 1
  , nextOrder: function()
  {
    if ( !this.length )
      return this.order++; // when call "add" for the first time there is no length during "adding"
    return this.last().get( 'order' ) + 1;
  }
  
  , comparator: 'order'
  
} );

var Todos = new TodosList()
Todos.add( [
  { "title": "Ecrire le workshop Backbone", "content": "", "done": true }
  ,{ "title": "Faire les slides", "content": "", "done": true }
  ,{ "title": "Donner le workshop", "content": "", "done": false }
  ,{ "title": "Make people happy", "content": "", "done": false }
] );
