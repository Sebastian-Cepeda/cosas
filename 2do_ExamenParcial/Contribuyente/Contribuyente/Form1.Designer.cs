namespace Contribuyente
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.buttonVerificar = new System.Windows.Forms.Button();
            this.buttonCotizar = new System.Windows.Forms.Button();
            this.textRazonSocial = new System.Windows.Forms.TextBox();
            this.comboMoneda = new System.Windows.Forms.ComboBox();
            this.textIdAmbiente = new System.Windows.Forms.TextBox();
            this.textNit = new System.Windows.Forms.TextBox();
            this.textModalidad = new System.Windows.Forms.TextBox();
            this.textFecha = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.textNumeroFaturas = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.textCantidad = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.textNombreCliente = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.textPrecioTotal = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.textPrecioUnitario = new System.Windows.Forms.TextBox();
            this.label12 = new System.Windows.Forms.Label();
            this.textProducto = new System.Windows.Forms.TextBox();
            this.labelResultado = new System.Windows.Forms.Label();
            this.labelCotizacion = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.labelFecha = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // buttonVerificar
            // 
            this.buttonVerificar.Location = new System.Drawing.Point(120, 206);
            this.buttonVerificar.Name = "buttonVerificar";
            this.buttonVerificar.Size = new System.Drawing.Size(75, 23);
            this.buttonVerificar.TabIndex = 0;
            this.buttonVerificar.Text = "Verificar";
            this.buttonVerificar.UseVisualStyleBackColor = true;
            this.buttonVerificar.Click += new System.EventHandler(this.ButtonVerificar_Click);
            // 
            // buttonCotizar
            // 
            this.buttonCotizar.Location = new System.Drawing.Point(476, 71);
            this.buttonCotizar.Name = "buttonCotizar";
            this.buttonCotizar.Size = new System.Drawing.Size(75, 23);
            this.buttonCotizar.TabIndex = 1;
            this.buttonCotizar.Text = "Cotizar";
            this.buttonCotizar.UseVisualStyleBackColor = true;
            this.buttonCotizar.Click += new System.EventHandler(this.ButtonCotizar_Click);
            // 
            // textRazonSocial
            // 
            this.textRazonSocial.Location = new System.Drawing.Point(120, 93);
            this.textRazonSocial.Name = "textRazonSocial";
            this.textRazonSocial.Size = new System.Drawing.Size(100, 20);
            this.textRazonSocial.TabIndex = 3;
            // 
            // comboMoneda
            // 
            this.comboMoneda.FormattingEnabled = true;
            this.comboMoneda.Items.AddRange(new object[] {
            "US",
            "EU"});
            this.comboMoneda.Location = new System.Drawing.Point(476, 44);
            this.comboMoneda.Name = "comboMoneda";
            this.comboMoneda.Size = new System.Drawing.Size(121, 21);
            this.comboMoneda.TabIndex = 4;
            // 
            // textIdAmbiente
            // 
            this.textIdAmbiente.Location = new System.Drawing.Point(120, 15);
            this.textIdAmbiente.Name = "textIdAmbiente";
            this.textIdAmbiente.Size = new System.Drawing.Size(100, 20);
            this.textIdAmbiente.TabIndex = 5;
            // 
            // textNit
            // 
            this.textNit.Location = new System.Drawing.Point(120, 41);
            this.textNit.Name = "textNit";
            this.textNit.Size = new System.Drawing.Size(100, 20);
            this.textNit.TabIndex = 6;
            // 
            // textModalidad
            // 
            this.textModalidad.Location = new System.Drawing.Point(120, 67);
            this.textModalidad.Name = "textModalidad";
            this.textModalidad.Size = new System.Drawing.Size(100, 20);
            this.textModalidad.TabIndex = 7;
            // 
            // textFecha
            // 
            this.textFecha.Location = new System.Drawing.Point(120, 119);
            this.textFecha.Name = "textFecha";
            this.textFecha.Size = new System.Drawing.Size(100, 20);
            this.textFecha.TabIndex = 8;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(13, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(60, 13);
            this.label1.TabIndex = 9;
            this.label1.Text = "IdAmbiente";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 44);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(20, 13);
            this.label2.TabIndex = 10;
            this.label2.Text = "Nit";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(473, 28);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(56, 13);
            this.label3.TabIndex = 11;
            this.label3.Text = "Cotizacion";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(13, 122);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(37, 13);
            this.label4.TabIndex = 12;
            this.label4.Text = "Fecha";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(12, 96);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(67, 13);
            this.label5.TabIndex = 13;
            this.label5.Text = "RazonSocial";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(12, 70);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(56, 13);
            this.label6.TabIndex = 14;
            this.label6.Text = "Modalidad";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(13, 148);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(103, 13);
            this.label7.TabIndex = 16;
            this.label7.Text = "Numero de Facturas";
            // 
            // textNumeroFaturas
            // 
            this.textNumeroFaturas.Location = new System.Drawing.Point(120, 145);
            this.textNumeroFaturas.Name = "textNumeroFaturas";
            this.textNumeroFaturas.Size = new System.Drawing.Size(100, 20);
            this.textNumeroFaturas.TabIndex = 15;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(244, 18);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(49, 13);
            this.label8.TabIndex = 18;
            this.label8.Text = "Cantidad";
            // 
            // textCantidad
            // 
            this.textCantidad.Location = new System.Drawing.Point(351, 15);
            this.textCantidad.Name = "textCantidad";
            this.textCantidad.Size = new System.Drawing.Size(100, 20);
            this.textCantidad.TabIndex = 17;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(13, 174);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(94, 13);
            this.label9.TabIndex = 20;
            this.label9.Text = "Nombre de Cliente";
            // 
            // textNombreCliente
            // 
            this.textNombreCliente.Location = new System.Drawing.Point(120, 171);
            this.textNombreCliente.Name = "textNombreCliente";
            this.textNombreCliente.Size = new System.Drawing.Size(100, 20);
            this.textNombreCliente.TabIndex = 19;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(244, 99);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(74, 13);
            this.label10.TabIndex = 22;
            this.label10.Text = "ProductoTotal";
            // 
            // textPrecioTotal
            // 
            this.textPrecioTotal.Location = new System.Drawing.Point(351, 96);
            this.textPrecioTotal.Name = "textPrecioTotal";
            this.textPrecioTotal.Size = new System.Drawing.Size(100, 20);
            this.textPrecioTotal.TabIndex = 21;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(244, 73);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(73, 13);
            this.label11.TabIndex = 24;
            this.label11.Text = "PrecioUnitario";
            // 
            // textPrecioUnitario
            // 
            this.textPrecioUnitario.Location = new System.Drawing.Point(351, 70);
            this.textPrecioUnitario.Name = "textPrecioUnitario";
            this.textPrecioUnitario.Size = new System.Drawing.Size(100, 20);
            this.textPrecioUnitario.TabIndex = 23;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(244, 47);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(50, 13);
            this.label12.TabIndex = 26;
            this.label12.Text = "Producto";
            // 
            // textProducto
            // 
            this.textProducto.Location = new System.Drawing.Point(351, 44);
            this.textProducto.Name = "textProducto";
            this.textProducto.Size = new System.Drawing.Size(100, 20);
            this.textProducto.TabIndex = 25;
            // 
            // labelResultado
            // 
            this.labelResultado.AutoSize = true;
            this.labelResultado.Location = new System.Drawing.Point(3, 0);
            this.labelResultado.Name = "labelResultado";
            this.labelResultado.Size = new System.Drawing.Size(55, 13);
            this.labelResultado.TabIndex = 27;
            this.labelResultado.Text = "Resultado";
            // 
            // labelCotizacion
            // 
            this.labelCotizacion.AutoSize = true;
            this.labelCotizacion.Location = new System.Drawing.Point(488, 126);
            this.labelCotizacion.Name = "labelCotizacion";
            this.labelCotizacion.Size = new System.Drawing.Size(56, 13);
            this.labelCotizacion.TabIndex = 28;
            this.labelCotizacion.Text = "Cotizacion";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.labelResultado);
            this.panel1.Location = new System.Drawing.Point(262, 174);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(231, 112);
            this.panel1.TabIndex = 29;
            // 
            // labelFecha
            // 
            this.labelFecha.AutoSize = true;
            this.labelFecha.Location = new System.Drawing.Point(226, 122);
            this.labelFecha.Name = "labelFecha";
            this.labelFecha.Size = new System.Drawing.Size(82, 13);
            this.labelFecha.TabIndex = 30;
            this.labelFecha.Text = "Fecha_Servidor";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.labelFecha);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.labelCotizacion);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.textProducto);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.textPrecioUnitario);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.textPrecioTotal);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.textNombreCliente);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.textCantidad);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.textNumeroFaturas);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textFecha);
            this.Controls.Add(this.textModalidad);
            this.Controls.Add(this.textNit);
            this.Controls.Add(this.textIdAmbiente);
            this.Controls.Add(this.comboMoneda);
            this.Controls.Add(this.textRazonSocial);
            this.Controls.Add(this.buttonCotizar);
            this.Controls.Add(this.buttonVerificar);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonVerificar;
        private System.Windows.Forms.Button buttonCotizar;
        private System.Windows.Forms.TextBox textRazonSocial;
        private System.Windows.Forms.ComboBox comboMoneda;
        private System.Windows.Forms.TextBox textIdAmbiente;
        private System.Windows.Forms.TextBox textNit;
        private System.Windows.Forms.TextBox textModalidad;
        private System.Windows.Forms.TextBox textFecha;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textNumeroFaturas;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox textCantidad;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox textNombreCliente;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox textPrecioTotal;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.TextBox textPrecioUnitario;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.TextBox textProducto;
        private System.Windows.Forms.Label labelResultado;
        private System.Windows.Forms.Label labelCotizacion;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label labelFecha;
    }
}

