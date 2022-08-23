using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace BancoBNB
{

    [Serializable]
    public class Cliente
    {
        public int nrocuenta;
        public string nombres;
        public string primerApellido;
        public string SegundoApellido;

    }

  
    [Serializable]
    public class Cuenta
    {
        public int nrocuenta;
        public Cliente cliente;
        public double slado;
    }
}