package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class ModuloInformes {
    private ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Expendedor> listaExpendedores = new ArrayList<Expendedor>();
    private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    private ArrayList<Combustible> listaCombustibles = new ArrayList<Combustible>();

    public void agregarEmpleado(String nombre, String dni){
        this.listaEmpleados.add(new Empleado(nombre,dni));
    }

    public void agregarExpendedor(String tipo, double precioVenta){
        this.listaExpendedores.add(new Expendedor(new Combustible(tipo,precioVenta)));
        if (!existeTipoCombustible(tipo)){
            this.listaCombustibles.add(new Combustible(tipo, precioVenta));
        }
    }

    private boolean existeTipoCombustible(String tipo){
        for (Combustible c: this.listaCombustibles){
            if (c.getTipo().equals(tipo)){
                return true;
            }
        }
        return false;
    }

    private Empleado buscarEmpleadoPorDni(String dniEmpleado){
        for (Empleado e: this.listaEmpleados){
            if (e.getDni().equals(dniEmpleado)){
                return e;
            }
        }
        return null;
    }

    private boolean existeCliente(String patente){
        if (!this.listaClientes.isEmpty()) {
            for (Cliente c : this.listaClientes) {
                if (c.getPatente().equals(patente)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Al realizar una venta, cargo en mi sistema los datos de mi cliente y lo registro junto con la venta
    public void realizarVenta(String nombreCliente, String patente, int indiceExpendedor, double importe ,String dniEmpleado){
        Cliente cliente = (new Cliente(nombreCliente, patente));
        Empleado empleado = buscarEmpleadoPorDni(dniEmpleado);
        if (empleado != null) {
            if (!existeCliente(cliente.getPatente())) {
                this.listaClientes.add(cliente);
            }
            this.listaVentas.add(new Venta(cliente, empleado, this.listaExpendedores.get(indiceExpendedor - 1), LocalDate.now(), importe));
        }
    }

    public String informeVentasPorCombustible(){
        String s = "Informe de ventas por combustible\n";
        int contadorVentas = 0;
        for (Combustible c: this.listaCombustibles){
            for (Venta v: this.listaVentas){
                if (v.getExpendedor().getCombustible().equals(c.getTipo())){
                    contadorVentas++;
                }
            }
            s += "Tipo Combustible: " + c.getTipo() + " - Cantidad de ventas: " + contadorVentas + "\n";
            contadorVentas = 0;
        }
        return s;
    }

    // Devolver un listado ordenado me implica tener una estructura de datos que contenga el codigo del Expendedores y las ventas del mismo, sino
    // me es imposible saber cual es el mayor para poder compararlo con los demas Expendedores, es por eso que cree una clase DetalleExpendedorVenta
    public String informeVentasPorExpendedor(){
        String s = "Informe de ventas por Expendedor\n";
        ArrayList<DetalleExpendedorVenta> detalleExpendedorVenta = new ArrayList<DetalleExpendedorVenta>();
        double montoVentas = 0;
        // para cada uno de los expendedores sumo la cantidad de veces que se vendio del mismo
        for (Expendedor e: this.listaExpendedores){
            for (Venta v: this.listaVentas){
                if (v.getExpendedor().getCodigo() == e.getCodigo()){
                    montoVentas += v.getImporte();
                }
            }
            detalleExpendedorVenta.add(new DetalleExpendedorVenta(e.getCodigo(),montoVentas));
            montoVentas = 0;
        }
        // Creo un comparator para poder ordenar mi lista de detalle de ventas del expendedor de mayor a menor
        Comparator<DetalleExpendedorVenta> comparadorA = Comparator.comparing(DetalleExpendedorVenta::getMontoVendido);
        detalleExpendedorVenta.sort(comparadorA.reversed());

        // Devuelvo los resultados
        String patron = "0.00";
        DecimalFormat formato = new DecimalFormat(patron);
        for (DetalleExpendedorVenta d: detalleExpendedorVenta){
            s += "Codigo Expendedor: " + d.getCodigoExpendedor() + " - Monto Vendido: $" + formato.format(d.getMontoVendido()) + "\n";
        }
        return s;
    }

    // Devolver un listado ordenado me implica tener una estructura de datos que contenga el codigo del Expendedor y los litros expedidos del mismo, sino
    // me es imposible saber cual es el mayor para poder compararlo con los demas Expendedores, es por eso que cree una clase DetalleExpendedorLitros
    public String informeLitrosPorExpendedor(){
        String s = "Informe de litros expedidos por Expendedor\n";
        ArrayList<DetalleExpendedorLitro> detalleExpendedorLitros = new ArrayList<DetalleExpendedorLitro>();
        double contadorLitros = 0;
        // para cada uno de los expendedores sumo la cantidad de veces que se vendio del mismo
        for (Expendedor e: this.listaExpendedores){
            for (Venta v: this.listaVentas){
                if (v.getExpendedor().getCodigo() == e.getCodigo()){
                    contadorLitros += v.getLitrosCombustible();
                }
            }
            detalleExpendedorLitros.add(new DetalleExpendedorLitro(e.getCodigo(),contadorLitros));
            contadorLitros = 0;
        }
        // Creo un comparator para poder ordenar mi lista de detalle de ventas del expendedor de mayor a menor
        Comparator<DetalleExpendedorLitro> comparadorA = Comparator.comparing(DetalleExpendedorLitro::getCantidadLitrosExpendidos);
        detalleExpendedorLitros.sort(comparadorA.reversed());

        // Devuelvo los resultados
        String patron = "0.00";
        DecimalFormat formato = new DecimalFormat(patron);
        for (DetalleExpendedorLitro d: detalleExpendedorLitros){

            s += "Codigo Expendedor: " + d.getCodigoExpendedor() + " - Litros Expendidos: " + formato.format(d.getCantidadLitrosExpendidos()) + "\n";
        }
        return s;
    }

    // Devolver un listado ordenado me implica tener una estructura de datos que contenga el DNI de empleado y las ventas del mismo, sino
    // me es imposible saber cual es el mayor para poder compararlo con los demas empleados, es por eso que cree una clase DetalleEmpleadoVenta
    public String informeVentasPorEmpleado(){
        String s = "Informe de ventas por Empleado\n";
        ArrayList<DetalleEmpleadoVenta> detalleEmpleadoVenta = new ArrayList<DetalleEmpleadoVenta>();
        double montoVentas = 0;
        // para cada uno de los empleados sumo la cantidad de veces que vendio cada uno
        for (Empleado e: this.listaEmpleados){
            for (Venta v: this.listaVentas){
                if (v.getEmpleado().getDni().equals(e.getDni())){
                    montoVentas += v.getImporte();
                }
            }
            detalleEmpleadoVenta.add(new DetalleEmpleadoVenta(e.getDni(),montoVentas));
            montoVentas = 0;
        }
        // Creo un comparator para poder ordenar mi lista de detalle de ventas del expendedor de mayor a menor
        Comparator<DetalleEmpleadoVenta> comparadorA = Comparator.comparing(DetalleEmpleadoVenta::getMontoVendido);
        detalleEmpleadoVenta.sort(comparadorA.reversed());

        // Devuelvo los resultados
        String patron = "0.00";
        DecimalFormat formato = new DecimalFormat(patron);
        for (DetalleEmpleadoVenta d: detalleEmpleadoVenta){
            s += "Nombre Empleado: " + buscarEmpleadoPorDni(d.getDniEmpleado()).getNombre() + " - DNI: " +d.getDniEmpleado() + " - Monto Vendido: $" + formato.format(d.getMontoVendido()) + "\n";
        }
        return s;
    }

    // Devolver un listado ordenado me implica tener una estructura de datos que contenga la PATENTE del CLIENTE y las COMPRAS del mismo, sino
    // me es imposible saber cual es el mayor para poder compararlo con los demas CLIENTES, es por eso que cree una clase DetalleClienteCompras
    public String informeCompraPorCliente(){
        String s = "Informe de Compras por Cliente (TOP 10)\n";
        ArrayList<DetalleClienteCompras> detalleClienteCompras = new ArrayList<DetalleClienteCompras>();
        double montoCompra = 0;
        // para cada uno de los empleados sumo la cantidad de veces que vendio cada uno
        for (Cliente c: this.listaClientes){
            for (Venta v: this.listaVentas){
                if (v.getCliente().getPatente().equals(c.getPatente())){
                    montoCompra += v.getImporte();
                }
            }
            detalleClienteCompras.add(new DetalleClienteCompras(c.getPatente(),montoCompra));
            montoCompra = 0;
        }
        // Creo un comparator para poder ordenar mi lista de detalle de ventas del expendedor de mayor a menor
        Comparator<DetalleClienteCompras> comparadorA = Comparator.comparing(DetalleClienteCompras::getMontoGastado);
        detalleClienteCompras.sort(comparadorA.reversed());

        // Devuelvo los resultados
        String patron = "0.00";
        DecimalFormat formato = new DecimalFormat(patron);
        for (int i = 0; i < 10; i++){
            if (i < detalleClienteCompras.size()){
                s += "Patente Cliente Top " + (i+1) + ": " + detalleClienteCompras.get(i).getPatenteCliente() + " - Monto Gastado: $" + formato.format(detalleClienteCompras.get(i).getMontoGastado()) + "\n";
            }
        }

        return s;
    }

}

