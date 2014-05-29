/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transaccion;

import Cliente.DatosPersonales;
import CuentaBancaria.CuentaBancaria;

/**
 *
 * @author salomon
 */
public class Deposito {
    private DatosPersonales depositante;
    private CuentaBancaria destino;
    private String Cantidad;

    public DatosPersonales getDepositante() {
        return depositante;
    }

    public void setDepositante(DatosPersonales depositante) {
        this.depositante = depositante;
    }

    public CuentaBancaria getDestino() {
        return destino;
    }

    public void setDestino(CuentaBancaria destino) {
        this.destino = destino;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
}
