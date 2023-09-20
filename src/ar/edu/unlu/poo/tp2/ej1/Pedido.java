package ar.edu.unlu.poo.tp2.ej1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
   private static int numeroTotalPedidos = 0; /* Llevo registro de cuantos pedidos realice asi a medida que voy
                                               creando nuevas, les asigno un valor correlativo y univoco */
    private int numeroPedido;
    private LocalDate fecha;
    private Estado estado;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<DetallePedido> listaDetalle;

    public Pedido(Vendedor vendedor, Cliente cliente, LocalDate fecha, ArrayList<DetallePedido> listaDetalle){
        setVendedor(vendedor);
        setCliente(cliente);
        setFecha(fecha);
        setListaDetalle(listaDetalle);
        setEstado(Estado.PENDIENTE);
        setNumeroPedido(++numeroTotalPedidos);
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    private void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    private void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    private void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<DetallePedido> getListaDetalle() {
        return listaDetalle;
    }

    private void setListaDetalle(ArrayList<DetallePedido> listaDetalle) {
        this.listaDetalle = listaDetalle;
    }

}
