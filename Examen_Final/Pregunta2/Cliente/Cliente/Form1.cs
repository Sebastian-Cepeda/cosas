using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cliente
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void ButtonEnviar_Click(object sender, EventArgs e)
        {
            //Nro cuenta de referencia: 1000053278

            BancoBNB.BancoBNBSoapClient cl = new BancoBNB.BancoBNBSoapClient();

            int nrocuenta = int.Parse(textCuenta.Text);

            double saldo = cl.ConsultaSaldo(nrocuenta);

            labelSaldo.Text = saldo.ToString()+"Bs";
        }
    }
}
