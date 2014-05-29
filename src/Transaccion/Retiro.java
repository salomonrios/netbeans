/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transaccion;

import Cliente.DatosPersonales;



/**
 *
 * @author salomon
 */
public class Retiro {
    private DatosPersonales Retirando;
    private Transaccion origen;

    public DatosPersonales getRetirando() {
        return Retirando;
    }

    public void setRetirando(DatosPersonales Retirando) {
        this.Retirando = Retirando;
    }

    public Transaccion getOrigen() {
        return origen;
    }

    public void setOrigen(Transaccion origen) {
        this.origen = origen;
    }
}
