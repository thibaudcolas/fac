using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
    }

    public void AddBtn_Click(Object sender, EventArgs E)
    {
        if (AvailableFonts.SelectedIndex != -1)
        {
            /* Ajoute la fonte séléctionnée aux fontes installées et l'enlève des fontes disponibles */
            InstalledFonts.Items.Add(new ListItem(AvailableFonts.SelectedItem.Value));
            AvailableFonts.Items.Remove(AvailableFonts.SelectedItem.Value);
        }
    }

    public void AddAllBtn_Click(Object sender, EventArgs E)
    {
        /* Ajoute toutes les fontes disponibles aux fontes installées et supprime les fontes disponibles */
        while (AvailableFonts.Items.Count != 0)
        {
            InstalledFonts.Items.Add(new ListItem(AvailableFonts.Items[0].Value));
            AvailableFonts.Items.Remove(AvailableFonts.Items[0].Value);
        }
    }

    public void RemoveBtn_Click(Object sender, EventArgs E)
    {
        if (InstalledFonts.SelectedIndex != -1)
        {
            /* Ajoute la fonte séléctionnée aux fontes disponibles et l'enlève des fontes installées */
            AvailableFonts.Items.Add(new ListItem(InstalledFonts.SelectedItem.Value));
            InstalledFonts.Items.Remove(InstalledFonts.SelectedItem.Value);
        }
    }

    public void RemoveAllBtn_Click(Object sender, EventArgs E)
    {
        /* Ajoute toutes les fontes installées aux fontes installées et supprime les fontes installées */
        while (InstalledFonts.Items.Count != 0)
        {
            AvailableFonts.Items.Add(new ListItem(InstalledFonts.Items[0].Value));
            InstalledFonts.Items.Remove(InstalledFonts.Items[0].Value);
        }
    }

}
