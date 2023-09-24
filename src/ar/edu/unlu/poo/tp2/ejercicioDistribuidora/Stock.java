package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

import java.util.ArrayList;

public class Stock {
    private ArrayList<DetalleStock> listadoStock = new ArrayList<DetalleStock>();

    public void agregarArticulo(String nombreArticulo, int cantidad, double precio){
        DetalleStock detalleStock = new DetalleStock(nombreArticulo, cantidad, precio);
        listadoStock.add(detalleStock);
    }

    public int cantidadArticulos(){
        return listadoStock.size();
    }

    public String getDescripcionArticulo(int numero){
        return this.listadoStock.get(numero).getNombreArticulo();
    }

    public int getCantidadArticulo(int numero){
        return this.listadoStock.get(numero).getCantidad();
    }

    public void descontar(String nombreArticulo, int cantidad){
        for (int i = 0; i < this.listadoStock.size(); i++){
            if (this.listadoStock.get(i).getNombreArticulo().equals(nombreArticulo)){
                this.listadoStock.get(i).descontar(cantidad);
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.listadoStock.size(); i++)
            s += this.listadoStock.get(i).toString() + "\n";
        return s;

    }
}
