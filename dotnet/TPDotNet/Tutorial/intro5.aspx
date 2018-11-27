<%@ Page Language="C#" AutoEventWireup="true" CodeFile="intro5.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Page intro5</title>
</head>
<body>
    <h3>
        <font face="Verdana">
            Gestion de plusieurs événements d'action de contrôle
        </font>
    </h3>
    <p>
        Cet exemple montre comment gérer plusieurs événements d'action de contrôle déclenchés à partir de contrôles &lt;asp:button&gt; différents.
    </p>
    <hr />
    <form action="controls4.aspx" runat="server">
        <table>
            <tr>
                <td>
                    Polices disponibles
                </td>
                <td>
<!-- Filler -->
                </td>
                <td>
                    Polices installées
                </td>
            </tr>
            <tr>
                <td>
                    <asp:ListBox ID="AvailableFonts" Width="100px" runat="server">
                        <asp:ListItem>Roman</asp:ListItem>
                        <asp:ListItem>Arial Black</asp:ListItem>
                        <asp:ListItem>Garamond</asp:ListItem>
                        <asp:ListItem>Somona</asp:ListItem>
                        <asp:ListItem>Symbol</asp:ListItem>
                    </asp:ListBox>
                </td>
                <td>
<!-- Filler -->
                </td>
                <td>
                    <asp:ListBox ID="InstalledFonts" Width="100px" runat="server">
                        <asp:ListItem>Times</asp:ListItem>
                        <asp:ListItem>Helvetica</asp:ListItem>
                        <asp:ListItem>Arial</asp:ListItem>
                    </asp:ListBox>
                </td>
            </tr>
            <tr>
                <td>
<!-- Filler -->                
                </td>
                <td>
                    <asp:Button Text="<<" OnClick="RemoveAllBtn_Click" runat="server" />
                    <asp:Button ID="Button1" Text="<" OnClick="RemoveBtn_Click" runat="server" />
                    <asp:Button ID="Button2" Text=">" OnClick="AddBtn_Click" runat="server" />
                    <asp:Button ID="Button3" Text=">>" OnClick="AddAllBtn_Click" runat="server" />
                </td>
                <td>
<!-- Filler -->  
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
