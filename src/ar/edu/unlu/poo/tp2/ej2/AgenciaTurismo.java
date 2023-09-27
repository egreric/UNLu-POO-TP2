package ar.edu.unlu.poo.tp2.ej2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AgenciaTurismo {
    private ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    private ArrayList<PaqueteTurismo> paquetesTurismo = new ArrayList<PaqueteTurismo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    public AgenciaTurismo(){

    }

    public void agregarCliente(Cliente cliente){
        if (!existeCliente(cliente)) {
            this.clientes.add(cliente);
        }
    }

    private boolean existeCliente(Cliente cliente){
        for (Cliente c: this.clientes){
            if (c.getDni().equals(cliente.getDni())){
                return true;
            }
        }
        return false;
    }

    private void agregarProveedor(Proveedor proveedor){
        if (!existeProveedor(proveedor)) {
            this.proveedores.add(proveedor);
        }
    }

    private boolean existeProveedor(Proveedor proveedor){
        for (Proveedor p: this.proveedores){
            if (p.getCuit().equals(proveedor.getCuit())){
                return true;
            }
        }
        return false;
    }

    public void agregarPaqueteTurismo(PaqueteTurismo paqueteTurismo){
        // agrego los proveedores de las distintas categorias que completan mi paquete de turismo (si es que ya no fueron agregados)
        if (!existePaqueteTurismo(paqueteTurismo)) {
            agregarProveedor(paqueteTurismo.getHospedaje().getProveedor());
            agregarProveedor(paqueteTurismo.getMedioTransporte().getProveedor());
            for (Excursion e : paqueteTurismo.getListaExcursiones()) {
                agregarProveedor(e.getProveedor());
            }
            this.paquetesTurismo.add(paqueteTurismo);
        }
    }

    public void realizarVenta(Cliente cliente, PaqueteTurismo paqueteTurismo, LocalDate fecha){
        if (existePaqueteTurismo(paqueteTurismo)){ // solo puedo agregar ventas de paquetes de turismo que ya existan
            agregarCliente(cliente); // puedo dar de alta un cliente nuevo en una venta, no es necesario que anteriormente este dado de alta
            this.ventas.add(new Venta (paqueteTurismo,cliente,paqueteTurismo.getCosto(),fecha));
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

    public String listadoProveedores(){
        String s = "";
        for (int i = 0; i < this.proveedores.size(); i++){
            s += "Proveedor " + (i+1) + "\n";
            s += "Razon Social: " + this.proveedores.get(i).getRazonSocial() + "\n";
            s += "Tipo: " + this.proveedores.get(i).getTipoProveedor() + "\n\n";
        }
        return s;
    }

    public String listadoPaquetesTurismo(){
        String s = "";
        for (int i = 0; i < this.paquetesTurismo.size(); i++){
            s += "Paquete " + (i+1) + "\n";
            s += "Destino: " + this.paquetesTurismo.get(i).getDestino() + "\n";
            s += "Medio Transporte: '" + this.paquetesTurismo.get(i).getMedioTransporte().getNombre() + "' (" + this.paquetesTurismo.get(i).getMedioTransporte().getTipoMedioTransporte() + ")\n";
            s += "Hospedaje: '" + this.paquetesTurismo.get(i).getHospedaje().getNombre() + "' (" + this.paquetesTurismo.get(i).getHospedaje().getTipoHospedaje() + ")\n";
            s += "Costo: $" + this.paquetesTurismo.get(i).getCosto() + "\n";
            for (int j = 0; j < this.paquetesTurismo.get(i).getListaExcursiones().size(); j++) {
                s += "Excursion " + (j+1) + ": '" + this.paquetesTurismo.get(i).getListaExcursiones().get(j).getNombre() + "'\n";
            }
            s += "\n";
        }
        return s;
    }

    public String listadoClientes(){
        String s = "";
        for (int i = 0; i < this.clientes.size(); i++){
            s += "Cliente " + (i+1) + "\n";
            s += "Nombre: " + this.clientes.get(i).getNombre() + " " + this.clientes.get(i).getApellido() + "\n";
            s += "DNI: " + this.clientes.get(i).getDni() + "\n\n";
        }
        return s;
    }

    public String listadoVentasCompleto(){
        String s = "";
        for (int i = 0; i < this.ventas.size(); i++){
            s += "Venta " + (i+1) + "\n";
            s += "Nombre: " + this.ventas.get(i).getCliente().getNombre() + " " + this.ventas.get(i).getCliente().getApellido() + " - DNI: " + this.ventas.get(i).getCliente().getDni() + "\n";
            s += "Fecha: " + this.ventas.get(i).getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "\n";
            s += "Paquete contratado: " + this.ventas.get(i).getPaqueteTurismo().toString() + "\n";
            s += "Importe: $" + this.ventas.get(i).getImporte() + "\n\n";
        }
        return s;
    }

    public String listadoVentasPorDestino(String destino){
        String s = "";
        for (int i = 0; i < this.ventas.size(); i++){
            if (this.ventas.get(i).getPaqueteTurismo().getDestino().equals(destino)) {
                s += "Venta " + (i + 1) + "\n";
                s += "Nombre: " + this.ventas.get(i).getCliente().getNombre() + " " + this.ventas.get(i).getCliente().getApellido() + " - DNI: " + this.ventas.get(i).getCliente().getDni() + "\n";
                s += "Fecha: " + this.ventas.get(i).getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "\n";
                s += "Paquete contratado: " + this.ventas.get(i).getPaqueteTurismo().toString() + "\n";
                s += "Importe: $" + this.ventas.get(i).getImporte() + "\n\n";
            }
        }
        return s;
    }

    private int cantidadVentasPorDestino(String destino){
        int i = 0;
        for (Venta v: this.ventas){
            if (v.getPaqueteTurismo().getDestino().equals(destino)){
                i++;
            }
        }
        return i;
    }

    public String destinoFavorito(){
        String destinoFavorito = "";
        int cantidadVentas = 0;
        int cantidadVentasAux = 0;
        if (!this.ventas.isEmpty()) {   // si la lista de ventas no esta vacia
            destinoFavorito = this.ventas.get(0).getPaqueteTurismo().getDestino(); // tomo al primer elemento como el favorito
            cantidadVentas = cantidadVentasPorDestino(destinoFavorito);
            if (this.ventas.size() > 1) {   // si la lista de ventas tiene mas de un elemento entonces busco
                for (int i = 1; i < this.ventas.size(); i++){
                    cantidadVentasAux = cantidadVentasPorDestino(this.ventas.get(i).getPaqueteTurismo().getDestino());
                    if (cantidadVentasAux > cantidadVentas){
                        destinoFavorito = this.ventas.get(i).getPaqueteTurismo().getDestino();
                        cantidadVentas = cantidadVentasAux;
                    }
                }
            }
        }
        return "El destino favorito es: " + destinoFavorito + ", Con un total de " + cantidadVentas + " Ventas.";
    }

}
