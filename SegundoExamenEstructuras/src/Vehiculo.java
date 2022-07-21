/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCPC
 */
public class Vehiculo {

    private int anoCreacion;
    int cantidadKilometros;
   

    public Vehiculo(int anoCreacion, int cantidadKilometros) {
        this.anoCreacion = anoCreacion;
        this.cantidadKilometros = cantidadKilometros;
    }

    public int getCantidadKilometros() {
        return cantidadKilometros;
    }

    public void setCantidadKilometros(int cantidadKilometros) {
        this.cantidadKilometros = cantidadKilometros;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

}
