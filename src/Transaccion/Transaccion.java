/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transaccion;

/**
 *
 * @author salomon
 */
class Transaccion {
    private Deposito Destino;
    private Retiro Origen;
    private boolean Aprobado;

    public Deposito getDestino() {
        return Destino;
    }

    public void setDestino(Deposito Destino) {
        this.Destino = Destino;
    }

    public Retiro getOrigen() {
        return Origen;
    }

    public void setOrigen(Retiro Origen) {
        this.Origen = Origen;
    }

    public boolean isAprobado() {
        return Aprobado;
    }

    public void setAprobado(boolean Aprobado) {
        this.Aprobado = Aprobado;
    }
}
