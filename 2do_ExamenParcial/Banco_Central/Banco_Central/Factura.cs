using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Banco_Central
{

    [Serializable]
    public class Factura
    {

        public int Nit;
        public int ci;
        public string razonSocial;
        public string fecha;
        public int numeroFactura;
        public int CUF;
        public TipoDocumentoCliente tipoDocumentoCliente = new TipoDocumentoCliente();
        public string nombreCliente;
        public string[] listaDetalleFactura;
        //1.Cantidad
        //2.Producto
        //3.PrecioUnitario
        //4.PrecioTotal

    }

    [Serializable]
    public class TipoDocumentoCliente
    {
        public int NIT;
        public int CI;

        public TipoDocumentoCliente(int nit, int ci) { }
        public TipoDocumentoCliente() { }
    }
}