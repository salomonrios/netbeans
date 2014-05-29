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
public class CuentaCorriente {
    private double TasaInteres;
    private String SegundaClave;
    private String NumeroChequera;
    private boolean CuotaManejo;
    private String TargetaCredito;
    private String NumeroTargetaCredito;
    private boolean ChequeraBloqueada;

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public String getSegundaClave() {
        return SegundaClave;
    }

    public void setSegundaClave(String SegundaClave) {
        this.SegundaClave = SegundaClave;
    }

    public String getNumeroChequera() {
        return NumeroChequera;
    }

    public void setNumeroChequera(String NumeroChequera) {
        this.NumeroChequera = NumeroChequera;
    }

    public boolean isCuotaManejo() {
        return CuotaManejo;
    }

    public void setCuotaManejo(boolean CuotaManejo) {
        this.CuotaManejo = CuotaManejo;
    }

    public String getTargetaCredito() {
        return TargetaCredito;
    }

    public void setTargetaCredito(String TargetaCredito) {
        this.TargetaCredito = TargetaCredito;
    }

    public String getNumeroTargetaCredito() {
        return NumeroTargetaCredito;
    }

    public void setNumeroTargetaCredito(String NumeroTargetaCredito) {
        this.NumeroTargetaCredito = NumeroTargetaCredito;
    }

    public boolean isChequeraBloqueada() {
        return ChequeraBloqueada;
    }

    public void setChequeraBloqueada(boolean ChequeraBloqueada) {
        this.ChequeraBloqueada = ChequeraBloqueada;
    }
}
