package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

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
    private ArrayList<DetallePedido> listaDetalle = new ArrayList<DetallePedido>();

    public Pedido(String nombreVendedor, String apellidoVendedor, String dniVendedor, String nombreCliente, String apellidoCliente, String dniCliente, LocalDate fecha){
        setVendedor(nombreVendedor, apellidoVendedor, dniVendedor);
        setCliente(nombreCliente, apellidoCliente, dniCliente);
        setFecha(fecha);
        setEstado(Estado.PENDIENTE);
        setNumeroPedido(++numeroTotalPedidos);
    }

    public void agregarArticulo(String nombreArticulo, int cantidad, float precio){
        DetallePedido detallePedido = new DetallePedido(nombreArticulo, cantidad, precio);
        this.listaDetalle.add(detallePedido);
    }

    public void agregarArticulo(String nombreArticulo, int cantidad){
        DetallePedido detallePedido = new DetallePedido(nombreArticulo, cantidad);
        this.listaDetalle.add(detallePedido);
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

    public String getCliente() {
        return this.cliente.toString();
    }

    private void setCliente(String nombreCliente, String apellidoCliente, String dniCliente) {
        this.cliente = new Cliente(nombreCliente, apellidoCliente, dniCliente);

    }

    public String getVendedor() {
       return this.vendedor.toString();
    }

    private void setVendedor(String nombreVendedor, String apellidoVendedor, String dniVendedor) {
        this.vendedor = new Vendedor(nombreVendedor, apellidoVendedor, dniVendedor);
    }

    public String getListaDetalle() {
        return this.listaDetalle.toString();
    }

}
