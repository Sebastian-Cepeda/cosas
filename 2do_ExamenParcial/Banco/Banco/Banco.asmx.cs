using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace Banco
{
    /// <summary>
    /// Descripción breve de Banco
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Banco : System.Web.Services.WebService
    {

        [WebMethod]
        public double obternerCotizacion(string moneda)
        {
            double cotizacion = 0;
            if (moneda.Equals("US"))
            {
                cotizacion = 6.96;
            }

            if (moneda.Equals("EU"))
            {
                cotizacion = 8.5;
            }

            return cotizacion;

        }
    }
}
