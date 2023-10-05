package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

public class Expendedor {
    private int codigo;
    private static int totalExpendedores = 0;
    private Combustible combustible;

    public Expendedor(Combustible combustible) {
        totalExpendedores++;
        this.codigo = totalExpendedores;
        this.combustible = combustible;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCombustible() {
        return combustible.getTipo();
    }

    public double getPrecioVentaCombustible() {
        return combustible.getPrecioVenta();
    }
}
