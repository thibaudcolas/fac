<%@ Page Language="C#" AutoEventWireup="true" CodeFile="intro.aspx.cs" Inherits="intro" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Page intro</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:TextBox ID="Nom" runat="server"></asp:TextBox>
        <asp:Button ID="btnRechercher" runat="server" Text="Rechercher" />
        <asp:Label ID="lblInfo" runat="server"></asp:Label>
        <asp:DropDownList ID="Categorie" runat="server">
            <asp:ListItem>Fantastique</asp:ListItem>
            <asp:ListItem>Aventure</asp:ListItem>
            <asp:ListItem>Thriller</asp:ListItem>
        </asp:DropDownList>
    
    </div>
    </form>
</body>
</html>
