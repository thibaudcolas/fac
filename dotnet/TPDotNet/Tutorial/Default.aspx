<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <title>Page Default</title>
    </head>
    <body>
        <center>
        <form action="Default.aspx" method="post">
            <div>
                <h3>
                    Nom :
                    <input id="Nom" type="text" />
                    Catégorie :
                    <select id="Categorie" size="1">
                        <option>Fantastique</option>
                        <option>Aventure</option>
                        <option>Thriller</option>
                    </select>
                </h3>
            </div>
            <input type="submit" value="Recherche" />
        </form>
        </center>
    </body>
</html>
