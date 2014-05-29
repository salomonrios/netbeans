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
public class CuentaAhorros {
    private String TargetaDevito;
    private String CedundaClave;
    private String NumeroTargeta;
    private String CuentaNomina;
    private String CuentaManejo;
    private double TasaInteres;   

    public String getTargetaDevito() {
        return TargetaDevito;
    }

    public void setTargetaDevito(String TargetaDevito) {
        this.TargetaDevito = TargetaDevito;
    }

    public String getCedundaClave() {
        return CedundaClave;
    }

    public void setCedundaClave(String CedundaClave) {
        this.CedundaClave = CedundaClave;
    }

    public String getNumeroTargeta() {
        return NumeroTargeta;
    }

    public void setNumeroTargeta(String NumeroTargeta) {
        this.NumeroTargeta = NumeroTargeta;
    }

    public String getCuentaNomina() {
        return CuentaNomina;
    }

    public void setCuentaNomina(String CuentaNomina) {
        this.CuentaNomina = CuentaNomina;
    }

    public String getCuentaManejo() {
        return CuentaManejo;
    }

    public void setCuentaManejo(String CuentaManejo) {
        this.CuentaManejo = CuentaManejo;
    }

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = TasaInteres;
    }
}
