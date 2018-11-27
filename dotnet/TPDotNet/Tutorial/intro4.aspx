<html>
    <head>
        <title>Page intro4</title>
        <script language="C#" runat="server">
            void SubmitBtn_Click(Object sender, EventArgs E)
            {
                Message.Text = "Bonjour " + Nom.Text + ", vous avez sélectionné : " + Categorie.SelectedItem;
            }
        </script>
    </head>
    <body>
        <center>
            <form action="#" method="post" runat="server">
                <h3>
                    Nom :
                    <asp:TextBox ID="Nom" runat="server" />
                    Catégorie :
                    <asp:DropDownList ID="Categorie" runat="server">
                        <asp:ListItem>Fantastique</asp:ListItem>
                        <asp:ListItem>Aventure</asp:ListItem>
                        <asp:ListItem>Thriller</asp:ListItem>
                    </asp:DropDownList>
                </h3>
                <asp:Button Text="Recherche" OnClick="SubmitBtn_Click" runat="server" />
                <asp:Label ID="Message" runat="server" />
            </form>
        </center>
    </body>
</html>
