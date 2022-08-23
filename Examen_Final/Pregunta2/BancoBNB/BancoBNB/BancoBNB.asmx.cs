using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace BancoBNB
{
    /// <summary>
    /// Descripción breve de BancoBNB
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class BancoBNB : System.Web.Services.WebService
    {

        [WebMethod]
        public double ConsultaSaldo(int rocuenta)
        {
            Cuenta cuenta = new Cuenta();

           int ncuenta =  cuenta.nrocuenta = 1000053278;
           double res = cuenta.slado = 500;

            if (rocuenta == ncuenta)
            {
                return res;
            }
            else
            {
                return 0.0;
            }

        }
    }
}
