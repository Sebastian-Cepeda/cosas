/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

/**
 *
 * @author LENOVO
 */
public class Cliente {

    public Cliente(int nrodocumento, String complemento, String nombres, String pirmerApellido, String segundoApellido) {
        this.nrodocumento = nrodocumento;
        this.complemento = complemento;
        this.nombres = nombres;
        this.pirmerApellido = pirmerApellido;
        this.segundoApellido = segundoApellido;
    }
    
    int nrodocumento;
    String complemento;
    String nombres;
    String pirmerApellido;
    String segundoApellido;

    public int getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(int nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPirmerApellido() {
        return pirmerApellido;
    }

    public void setPirmerApellido(String pirmerApellido) {
        this.pirmerApellido = pirmerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
