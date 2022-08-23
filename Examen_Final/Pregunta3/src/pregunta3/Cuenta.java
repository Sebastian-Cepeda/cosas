/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

/**
 *
 * @author LENOVO
 */
public class Cuenta {
    Banco banco;
    int nrocuenta;
    Cliente cliente;

    public Cuenta(Banco banco, int nrocuenta, Cliente cliente) {
        this.banco = banco;
        this.nrocuenta = nrocuenta;
        this.cliente = cliente;
    }
    
    

    public int getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(int nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
