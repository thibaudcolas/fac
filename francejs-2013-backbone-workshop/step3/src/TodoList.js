function TodoList()
{
  this.views = {};
  this.destroy = function()
  {
    console.log( this.views );
    for ( var i in this.views )
    {
      this.views[ i ].destroy();
      delete this.views[ i ];
    }
  }
}