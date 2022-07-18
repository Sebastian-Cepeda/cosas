using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Contribuyente
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void ButtonVerificar_Click(object sender, EventArgs e)
        {

            Impuestos.ImpuestosSoapClient cl = new Impuestos.ImpuestosSoapClient();
            Impuestos.Factura factura = new Impuestos.Factura();

            Banco.BancoSoapClient bn = new Banco.BancoSoapClient();

            double cambio = bn.obternerCotizacion(comboMoneda.Text);

            double precioUnitario = double.Parse(textPrecioUnitario.Text) / cambio;
            double precioTotal = double.Parse(textPrecioUnitario.Text) * double.Parse(textCantidad.Text);

            factura.Nit = int.Parse(textNit.Text);
            string idambiente = textIdAmbiente.Text;
            int modalidad = int.Parse(textModalidad.Text);
            string cufd = cl.obtenerCufd(idambiente, factura.Nit, modalidad);
            string razonSocial = textRazonSocial.Text;
            labelFecha.Text = cl.sincronizarFechaHora();
            textFecha.Text = cl.sincronizarFechaHora();
            string numeroFactura = textNumeroFaturas.Text;
            int cuf = int.Parse(idambiente) + modalidad;
            Impuestos.TipoDocumentoCliente tipo = new Impuestos.TipoDocumentoCliente();
            string nombreCliente = textNombreCliente.Text;
            string[] listaDetalle = { textCantidad.Text, textProducto.Text, precioUnitario.ToString(), precioTotal.ToString()};

            factura.razonSocial = razonSocial;
            factura.fecha = textFecha.Text;
            factura.numeroFactura = int.Parse(numeroFactura);
            factura.CUF = cuf;
            factura.tipoDocumentoCliente = tipo;
            factura.nombreCliente = nombreCliente;
            



            string verificacion = cl.EmitirFactura(int.Parse(idambiente), factura.Nit, cufd, modalidad, factura);

            labelResultado.Text = verificacion; 

        }

        private void ButtonCotizar_Click(object sender, EventArgs e)
        {
            Banco.BancoSoapClient banco = new Banco.BancoSoapClient();

            double moneda = banco.obternerCotizacion(comboMoneda.Text);

            labelCotizacion.Text = moneda.ToString();

        }
    }
}
