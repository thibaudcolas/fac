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

public partial class intro6 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Random randomGenerator = new Random(DateTime.Now.Millisecond);
        int randomNum = randomGenerator.Next(0, 3);
        switch (randomNum)
        {
            case 0:
                Nom.Text = "Scott";
                break;
            case 1:
                Nom.Text = "Fred";
                break;
            case 2:
                Nom.Text = "Adam";
                break;
        }
        AnchorLink.NavigateUrl = "intro.aspx?name=" + System.Web.HttpUtility.UrlEncode(Nom.Text);
    }
}
