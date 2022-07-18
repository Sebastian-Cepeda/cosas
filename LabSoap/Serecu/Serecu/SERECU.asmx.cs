using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace Serecu
{

    [Serializable]
    public class Esposo
    {
        public string ci;
        public string nombres;
        public string primerApellido;
        public string segundoApellido;
    }

    [Serializable]
    public class Persona
    {
        public string ci;
        public string nombres;
        public string primerApellido;
        public string segundoApellido;
        public string fechanacimiento;
        public string sexo;
        public string estadoCivil;
        public string datosPadre;
        public string datosMadre;
        public Esposo esposo = new Esposo();
        public string fechaDefuncion;
        public string causa;
    }
    /// <summary>
    /// Descripción breve de SERECU
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class SERECU : System.Web.Services.WebService
    {

        [WebMethod]
        public Persona ObtenerDatos(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.ci = "65432845";
            persona.nombres = "Juan Jose";
            persona.primerApellido = "Perez";
            persona.segundoApellido = "Pinto";
            persona.fechanacimiento = "15/03/96";
            persona.sexo = "M";
            persona.estadoCivil = "Casado";

            error.nombres = "Error";
            if (ci == persona.ci)
            {
                return persona;
            }
            else
            {
                return error;
            }
            
        }

        [WebMethod]
        public Persona ObtenerCertificadoNacimiento(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.ci = "65432845";
            persona.nombres = "Juan Jose";
            persona.primerApellido = "Perez";
            persona.segundoApellido = "Pinto";
            persona.fechanacimiento = "15/03/96";
            persona.datosPadre = "Emanuel Luis Perez Mendez";
            persona.datosMadre = "Maria Isabel Pinto Vargas";

            error.nombres = "Error";
            if (ci == persona.ci)
            {
                return persona;
            }
            else
            {
                return error;
            }

        }

        [WebMethod]
        public Persona ObtenerCertificadoMAtrimonio(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.ci = "65432845";
            persona.nombres = "Juan Jose";
            persona.primerApellido = "Perez";
            persona.segundoApellido = "Pinto";
            persona.esposo.ci = "578894515";
            persona.esposo.nombres = "Mariana Maria";
            persona.esposo.primerApellido = "Lopez";
            persona.esposo.segundoApellido = "Choque";

            error.nombres = "Error";
            if (ci == persona.ci)
            {
                return persona;
            }
            else
            {
                return error;
            }

        }

        [WebMethod]
        public Persona ObtenerCeritificadoDefunsion(string ci)
        {
            Persona persona = new Persona();
            Persona error = new Persona();

            persona.ci = "65432845";
            persona.nombres = "Juan Jose";
            persona.primerApellido = "Perez";
            persona.segundoApellido = "Pinto";
            persona.fechaDefuncion = "15/03/2020";
            persona.causa = "Instoxicacion";

            error.nombres = "Error";
            if (ci == persona.ci)
            {
                return persona;
            }
            else
            {
                return error;
            }

        }
    }
}
