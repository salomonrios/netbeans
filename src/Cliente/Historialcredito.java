/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

/**
 *
 * @author salomon
 */
public class Historialcredito {
    private DatosPersonales cliente;
    private String cantidadadeudada;
    private boolean estado;
    private boolean bloqueado;
    private boolean pazsalvo;

    public DatosPersonales getCliente() {
        return cliente;
    }

    public void setCliente(DatosPersonales cliente) {
        this.cliente = cliente;
    }

    public String getCantidadadeudada() {
        return cantidadadeudada;
    }

    public void setCantidadadeudada(String cantidadadeudada) {
        this.cantidadadeudada = cantidadadeudada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public boolean isPazsalvo() {
        return pazsalvo;
    }

    public void setPazsalvo(boolean pazsalvo) {
        this.pazsalvo = pazsalvo;
    }
    
}
