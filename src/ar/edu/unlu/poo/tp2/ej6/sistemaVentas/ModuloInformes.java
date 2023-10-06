package ar.edu.unlu.poo.tp2.ej6.sistemaVentas;

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

    public void agregarExpendedor(String tipoCombustible, double precioVenta){
        this.listaExpendedores.add(new Expendedor(new Combustible(tipoCombustible,precioVenta)));
        if (!existeTipoCombustible(tipoCombustible)){
            this.listaCombustibles.add(new Combustible(tipoCombustible, precioVenta));
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

    // Nota: Este metodo solo se usa para la carga de ventas del mes anterior y asi cumplir con las consigna de los ejercicios 6 y 7
    public void realizarVenta(String nombreCliente, String patente, int indiceExpendedor, double importe ,String dniEmpleado, LocalDate fecha){
        Cliente cliente = (new Cliente(nombreCliente, patente));
        Empleado empleado = buscarEmpleadoPorDni(dniEmpleado);
        if (empleado != null) {
            if (!existeCliente(cliente.getPatente())) {
                this.listaClientes.add(cliente);
            }
            this.listaVentas.add(new Venta(cliente, empleado, this.listaExpendedores.get(indiceExpendedor - 1), fecha, importe));
        }
    }

    public String proporcionCantidadVentasMensualPorCombustible(){
        String s = "Proporcion de ventas por combustible(%)\n";
        int contadorVentas = 0;
        for (Combustible c: this.listaCombustibles){
            for (Expendedor e: this.listaExpendedores){
                if (e.getCombustible().equals(c.getTipo())){
                    contadorVentas += e.getCantidadMensualVentas();
                }
            }
            s += "Tipo Combustible: " + c.getTipo() + " - Cantidad de ventas: " + contadorVentas + "(" + (Math.round((double)(contadorVentas*100)/this.listaVentas.size())) + "%)\n";
            contadorVentas = 0;
        }
        return s;
    }

    public String informeVentasPorExpendedor(){
        String s = "Informe de ventas por Expendedor\n";

        // Ordeno mi lista de expendedores por el monto total mensual vendido de mayor a menor
        Comparator<Expendedor> comparador = Comparator.comparing(Expendedor::getTotalMensualVendido);
        listaExpendedores.sort(comparador.reversed());

        for (Expendedor e: listaExpendedores){
            s += "Expendedor " + e.getCodigo() + " - Monto vendido: $" + e.getTotalMensualVendido() + "\n";
        }
        return s;
    }

    public String informeLitrosPorExpendedor(){
        String s = "Informe de litros expedidos por Expendedor\n";

        // Ordeno mi lista de expendedores por la cantidad total mensual de litros expendidos de mayor a menor
        Comparator<Expendedor> comparador = Comparator.comparing(Expendedor::getTotalMensualLitrosExpendidos);
        listaExpendedores.sort(comparador.reversed());

        // Creo un formato para devolver con un solo decimal los litros
        String patron = "0.0";
        DecimalFormat formato = new DecimalFormat(patron);

        for (Expendedor e: listaExpendedores){
            s += "Expendedor " + e.getCodigo() + " - Combustible Expedido: " + formato.format(e.getTotalMensualLitrosExpendidos()) + " Lts.\n";
        }
        return s;
    }


    public String informeVentasPorEmpleado(){
        String s = "Informe de ventas por Empleado\n";

        // Ordeno mi lista de empleados por la cantidad total mensual de ventas realizadas de mayor a menor
        Comparator<Empleado> comparador = Comparator.comparing(Empleado::getTotalMensualVendido);
        listaEmpleados.sort(comparador.reversed());

        // Creo un formato para devolver con un solo decimal los litros
        String patron = "0.0";
        DecimalFormat formato = new DecimalFormat(patron);

        for (Empleado e: listaEmpleados){
            s += "Empleado: " + e.getNombre() + " - Monto Vendido: $" + formato.format(e.getTotalMensualVendido()) + "\n";
        }
        return s;
    }


    public String top10ClientesCompras(){
        String s = "Informe de Compras por Cliente (TOP 10)\n";

        // Ordeno mi lista de clientes por la cantidad total mensual de ventas realizadas de mayor a menor
        Comparator<Cliente> comparador = Comparator.comparing(Cliente::getTotalMensualGastado);
        listaClientes.sort(comparador.reversed());

        // Creo un formato para devolver con un solo decimal los litros
        String patron = "0.0";
        DecimalFormat formato = new DecimalFormat(patron);

        for (int i = 0; i < 10; i++){
            if (listaClientes.get(i) != null){
                s += "TOP "+ (i+1) + " - Nombre: " + listaClientes.get(i).getNombre() + "(" + listaClientes.get(i).getPatente() + ") - Monto Gastado: $" + formato.format(listaClientes.get(i).getTotalMensualGastado()) + "\n";
            }
        }
        return s;
    }


}

