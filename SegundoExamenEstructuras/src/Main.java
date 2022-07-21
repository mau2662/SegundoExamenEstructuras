/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public int suma(Circular lista2) {
        int suma = 0;
        for (int i = 0; i < lista2.getSize(); i++) {

            if (lista2.getSize() % 2 == 0) {
                suma = suma + lista2.get(i);
            }

        }
        return suma;

    }

    public void insertarOrdenado(LinkedList<Vehiculo> lista, Vehiculo vehiculoNuevo) {

        if (vehiculoNuevo.getAnoCreacion() > lista.get(0).getAnoCreacion()) {

            lista.insertAfter(vehiculoNuevo);

        } else {

            lista.insertFirst(vehiculoNuevo, 0);
        }

    }

}
