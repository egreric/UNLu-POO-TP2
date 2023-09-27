package ar.edu.unlu.poo.tp2.ej2;

import java.util.ArrayList;

public class AgenciaTurismo {
    private ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    private ArrayList<PaqueteTurismo> paquetesTurismo = new ArrayList<PaqueteTurismo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    public AgenciaTurismo(){

    }

    public void agregarCliente(Cliente cliente){
        // mejora: agregar solo si el cliente no existe (funcion a implementar -private boolean existeCliente(Cliente cliente)-)
        this.clientes.add(cliente);
    }

    public void agregarProveedor(Proveedor proveedor){
        // mejora: agregar solo si el proveedor no existe (funcion a implementar -private boolean existeProveedor(Proveedor proveedor)-)
        this.proveedores.add(proveedor);
    }

    public void agregarPaqueteTurismo(PaqueteTurismo paqueteTurismo){
        // agrego los proveedores de las distintas categorias que completan mi paquete (si es que ya no fueron agregados)
        agregarProveedor(paqueteTurismo.getHospedaje().getProveedor());
        agregarProveedor(paqueteTurismo.getMedioTransporte().getProveedor());
        for (Excursion e: paqueteTurismo.getListaExcursiones()){
            agregarProveedor(e.getProveedor());
        }
        this.paquetesTurismo.add(paqueteTurismo);
    }

    public void agregarVenta(Venta venta){
        if (existePaqueteTurismo(venta.getPaqueteTurismo())){ // solo puedo agregar ventas de paquetes de turismo que ya existan
            agregarCliente(venta.getCliente()); // puedo dar de alta un cliente nuevo en una venta, no es necesario que anteriormente este dado de alta
            this.ventas.add(venta);
        }
    }

    private boolean existePaqueteTurismo(PaqueteTurismo paqueteTurismo) {
        for (PaqueteTurismo p: this.paquetesTurismo){
            if (p.esIgual(paqueteTurismo)){
                return true;
            }
        }
        return false;
    }


}
