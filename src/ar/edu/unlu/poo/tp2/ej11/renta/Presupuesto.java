package ar.edu.unlu.poo.tp2.ej11.renta;

public class Presupuesto {
    private Vehiculo vehiculo;
    private int cantidadDias;

    public Presupuesto(Vehiculo vehiculo, int cantDias){
        setVehiculo(vehiculo);
        setCantidadDias(cantDias);
    }

    private void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    private void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getTipoVehiculo(){
        return vehiculo.getClass().getName();
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public double montoFinal(){
        return vehiculo.getPrecioAlquiler(cantidadDias);
    }

    @Override
    public String toString(){
        return vehiculo.toString() + " - Monto final a pagar por " + getCantidadDias() + " dias de alquiler: $" + montoFinal() + " (Precio por dia: $" + vehiculo.getPrecioAlquiler(cantidadDias)/cantidadDias + ")";
    }

}
