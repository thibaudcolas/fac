<%@ Page Language="C#" AutoEventWireup="true" CodeFile="intro6.aspx.cs" Inherits="intro6" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <title>Page intro6</title>
    </head>
    <body>
        <h3>
            <font face="Verdana">
                Exécution d'une navigation entre les pages (Scénario 1)
            </font>
        </h3>
        <p>
            Cet exemple montre comment générer une balise d'ancrage HTML qui obligera le client à naviguer vers une nouvelle page lorsqu'il cliquera dessus dans le navigateur.
        </p>
        <hr />
        
        <asp:HyperLink ID="AnchorLink" Font-Size=24 runat="server">
            Bonjour <asp:Label ID="Nom" runat="server" /> cliquez sur ce lien !
        </asp:HyperLink>
    </body>
</html>
