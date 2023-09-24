package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class ManejadorPedido {
    private ArrayList<Pedido> listaPedidos;
    private Stock stock;

    public ManejadorPedido(ArrayList<Pedido> listaPedidos, Stock stock){
        setListaPedidos(listaPedidos);
        setStock(stock);
    }

    private void setListaPedidos(ArrayList<Pedido> listaPedidos){
        this.listaPedidos = listaPedidos;
    }

    private void setStock(Stock stock){
        this.stock = stock;
    }

    private boolean existeArticulo(String descripcionArticulo){
        for (int i = 0; i < this.stock.cantidadArticulos(); i++) {
            if (this.stock.getDescripcionArticulo(i).equals(descripcionArticulo)){
                return true;
            }
        } return false;
    }

    private boolean hayCantidadSuficienteArticulo(String descripcionArticulo, int cantidad){
        for (int i = 0; i < this.stock.cantidadArticulos(); i++) {
            if (this.stock.getDescripcionArticulo(i).equals(descripcionArticulo)) {
                if (this.stock.getCantidadArticulo(i) >= cantidad) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hayStock(Pedido pedido) {
        for (int i = 0; i < pedido.cantidadArticulos(); i++) {
            if (!hayCantidadSuficienteArticulo(pedido.getDescripcionArticulo(i), pedido.getCantidadArticulo(i))) {
                return false;
            }
        }
        return true;
    }

    private void descontarStock(Pedido pedido){
        for (int i = 0; i < pedido.cantidadArticulos(); i++) {
            stock.descontar(pedido.getDescripcionArticulo(i), pedido.getCantidadArticulo(i));
        }
    }

    public void procesarPedidos(){
        for (int i = 0; i < this.listaPedidos.size(); i++){
            if (hayStock(this.listaPedidos.get(i))){
                descontarStock(listaPedidos.get(i));
                listaPedidos.get(i).aceptar();
            } else {
                listaPedidos.get(i).rechazar();
            }
        }
    }

    private boolean esDelMesAnterior(Pedido pedido){
        int mesAnterior = LocalDate.now().minusMonths(1).getMonthValue();
        if (pedido.getFecha().getMonthValue() == mesAnterior){
            return true;
        }
        return false;
    }


    public String informeMensual(){
        String s = "Pedidos Aceptados / Rechazados del mes anterior \n";
        for (int i = 0; i < this.listaPedidos.size() ;i++){
            if (this.listaPedidos.get(i).estaAceptado() || this.listaPedidos.get(i).estaRechazado()) {
                if (esDelMesAnterior(this.listaPedidos.get(i))){
                    s += this.listaPedidos.get(i).toString() + "\n";
                }
            }
        }
        return s;

    }

}
