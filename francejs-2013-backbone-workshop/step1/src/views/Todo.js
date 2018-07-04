var TodoView = Backbone.View.extend( {
  tagName: "div",
  className: "ticket",

  // event binding on dom (eventsName selector : target method)
  events: {
    "click.done"     : "toggleDone",
    "click"          : "open",
    "dblclick"       : "edit",
    "click .close"   : "delete",
    "click .down"    : "orderDown",
    "click .up"      : "orderUp"
  },

  // when the view is created
  initialize: function() {
    this.template = _.template( $( '#TodoV1' ).html() );
    this.listenTo( this.model, 'change', this.render );
    this.listenTo( this.model, 'destroy', this.remove );
  },

  render: function() {
    this.$el.html( this.template( { todo: this.model.toJSON() } ) );
    return this;
  },

  toggleDone: function() {
    this.model.toggle();
  },

  delete: function() {
    this.model.destroy();
  },

  // step 2 - later
  orderUp: function( e ) {},

  orderDown: function() {}
});
