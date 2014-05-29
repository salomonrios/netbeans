/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuentaBancaria;

/**
 *
 * @author salomon
 */
public class CuentaBancaria {
    private String NumeroCuenta;
    private boolean estado;
    private boolean bloqueado;
    private boolean CerrarCuenta;

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
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

    public boolean isCerrarCuenta() {
        return CerrarCuenta;
    }

    public void setCerrarCuenta(boolean CerrarCuenta) {
        this.CerrarCuenta = CerrarCuenta;
    }
}
