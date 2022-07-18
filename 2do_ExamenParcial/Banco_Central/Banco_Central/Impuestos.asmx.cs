using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace Banco_Central
{
    /// <summary>
    /// Descripción breve de Impuestos
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Impuestos : System.Web.Services.WebService
    {

        [WebMethod]
        public string sincronizarFechaHora()
        {
            string fechahora = "09/07/2022 10:32";
            
            return fechahora;
        }

        [WebMethod]
        public string obtenerCufd(string idambiente, int modalidad, int nit)
        {
            return "AB0000345C34521";
        }

        [WebMethod]
        public string EmitirFactura(int idambiente, int Nitnumero, string cufd, int modalidad, Factura factura)
        {
            Factura verificacion = factura;
            string razonsicial = "No esiste";
            string razonSocial = verificacion.razonSocial;


            string estado = "valido";
            string mensaje = "recibido correctamente";



            return estado +"-"+ mensaje +"-"+ razonSocial;
        }

    }
}
