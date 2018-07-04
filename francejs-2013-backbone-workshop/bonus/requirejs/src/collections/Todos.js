var TodosList = Backbone.Collection.extend( {
  
  model: TodoModel
  
  , done: function()
  {
    return this.where( { done: true } );
  }
  
  , remaining: function()
  {
    return this.where( { done: false } );
  }
  
  // step 2
  , order: 1
  , nextOrder: function()
  {
    if ( !this.length )
      return this.order++;
    return this.last().get( 'order' ) + 1;
  }
  
  , comparator: 'order'
  
} );

var Todos = new TodosList()
// step 1 - 2
Todos.add( [
  { "title": "Ecrire le workshop Backbone", "content": "", "done": true }
  ,{ "title": "Faire les slides", "content": "", "done": true }
  ,{ "title": "Donner le workshop", "content": "", "done": false }
  ,{ "title": "Make people happy", "content": "", "done": false }
] );
