package ar.edu.unlu.poo.tp2.ej2;

import java.util.ArrayList;

public class PaqueteTurismo {
    private String destino;
    private MedioTransporte medioTransporte;
    private Hospedaje hospedaje;
    private double costo;
    private ArrayList<Excursion> listaExcursiones = new ArrayList<Excursion>();

    public PaqueteTurismo(String destino, MedioTransporte medioTransporte, Hospedaje hospedaje){
        setDestino(destino);
        setMedioTransporte(medioTransporte);
        setHospedaje(hospedaje);
        setCosto();
    }

    public String getDestino() {
        return destino;
    }

    private void setDestino(String destino) {
        this.destino = destino;
    }

    public MedioTransporte getMedioTransporte() {
        return medioTransporte;
    }

    private void setMedioTransporte(MedioTransporte medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    private void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getCosto(){
        return this.costo;
    }

    // Voy a simular que mi ganancia esta en el recargo(del 30%) de la sumatoria de los costos del hospedaje, el transporte y las excursiones
    public void setCosto(){
        double costoHospedaje = this.getHospedaje().getCosto();
        double costoMedioTransporte = this.getMedioTransporte().getCosto();
        double costoExcursiones = 0;
        for (Excursion e: listaExcursiones){
            costo += e.getCosto();
        }
        this.costo = ((costoHospedaje + costoMedioTransporte + costoExcursiones) * 1.3);
    }

    public ArrayList<Excursion> getListaExcursiones() {
        return listaExcursiones;
    }

    public void agregarExcursion(Excursion excursion) {
        this.listaExcursiones.add(excursion);
    }

    public boolean esIgual(PaqueteTurismo paqueteTurismo){
        if (this.destino.equals(paqueteTurismo.destino)){
            if (this.medioTransporte.esIgual(paqueteTurismo.medioTransporte)){
                if (this.hospedaje.esIgual(paqueteTurismo.hospedaje)){
                    if (listasExcursionesIguales(this.listaExcursiones, paqueteTurismo.listaExcursiones)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean excursionEncontrada(Excursion excursion, ArrayList<Excursion> listaExcursiones){
        for (Excursion e:listaExcursiones){
            if (excursion.esIgual(e)){
                return true;
            }
        }
        return false;
    }

    private boolean listasExcursionesIguales(ArrayList<Excursion> listaExcursiones1, ArrayList<Excursion> listaExcursiones2) {
        boolean iguales = true;
        if (listaExcursiones1.size() == listaExcursiones2.size()) {
            int i = 0;
            while ((i < listaExcursiones1.size()) && (iguales)) {
                if (!excursionEncontrada(listaExcursiones1.get(i), listaExcursiones2)) {
                    iguales = false;
                }
            }
        }
        return iguales;
    }
}
