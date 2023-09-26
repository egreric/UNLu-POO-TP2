package ar.edu.unlu.poo.tp2.ej1;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionClub {
    private ArrayList<Inscripcion> inscriptos = new ArrayList<Inscripcion>();
    private Suscripcion suscripcionBasica;
    private Suscripcion suscripcionIntermedia;
    private Suscripcion suscripcionDestacada;

    public GestionClub(Suscripcion suscripcionBasica, Suscripcion suscripcionIntermedia, Suscripcion suscripcionDestacada){
        setSuscripcionBasica(suscripcionBasica);
        setSuscripcionIntermedia(suscripcionIntermedia);
        setSuscripcionDestacada(suscripcionDestacada);
    }

    public Suscripcion getSuscripcionBasica() {
        return suscripcionBasica;
    }

    private void setSuscripcionBasica(Suscripcion suscripcionBasica){
        this.suscripcionBasica = suscripcionBasica;
    }

    public Suscripcion getSuscripcionIntermedia() {
        return suscripcionIntermedia;
    }

    private void setSuscripcionIntermedia(Suscripcion suscripcionIntermedia){
        this.suscripcionIntermedia = suscripcionIntermedia;
    }

    public Suscripcion getSuscripcionDestacada() {
        return suscripcionDestacada;
    }

    private void setSuscripcionDestacada(Suscripcion suscripcionDestacada){
        this.suscripcionDestacada = suscripcionDestacada;
    }

    public void agregarInscriptoBasico(Socio socio, LocalDate fecha){
        this.inscriptos.add(new Inscripcion(socio,fecha,this.suscripcionBasica));
    }

    public void agregarInscriptoIntermedio(Socio socio, LocalDate fecha){
        this.inscriptos.add(new Inscripcion(socio,fecha,this.suscripcionIntermedia));
    }

    public void agregarInscriptoDestacada(Socio socio, LocalDate fecha){
        this.inscriptos.add(new Inscripcion(socio,fecha,this.suscripcionDestacada));
    }

    public String mostrarActividadesBasicas(){
        return getSuscripcionBasica().mostrarActividades();
    }

    public String mostrarActividadesIntermedias(){
        return getSuscripcionIntermedia().mostrarActividades();
    }

    public String mostrarActividadesDestacadas(){
        return getSuscripcionDestacada().mostrarActividades();
    }

    public String reporteMensualInscriptos() {
        String s = "Reporte de Inscriptos del Mes " + (LocalDate.now().getMonthValue() - 1) + "\n\n";
        for (Inscripcion i : inscriptos) {
            if (i.getFecha().getMonthValue() == (LocalDate.now().getMonthValue() - 1)) {
                s += i.mostrarDatosInscripcion() + "\n\n";
            }
        }
        return s;
    }

    public String listadoSociosSegunSuscripcion(TipoSuscripcion tipoSuscripcion){
        String s = "Listado de Socios " + tipoSuscripcion + "\n";
        for (Inscripcion i: inscriptos){
            if (i.getSuscripcion().getTipo() == tipoSuscripcion){
                s += i.getSocio().getNombre() + " " +  i.getSocio().getApellido() + "\n";
            }
        }
        return s;
    }


}
