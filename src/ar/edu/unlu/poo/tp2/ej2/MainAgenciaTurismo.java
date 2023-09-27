package ar.edu.unlu.poo.tp2.ej2;

public class MainAgenciaTurismo {
    public static void main(String[] args){
        AgenciaTurismo agenciaTurismo = new AgenciaTurismo();

        Cliente cliente1 = new Cliente("Carlos","Rodriguez","12.133.421");
        Cliente cliente2 = new Cliente("Pedro", "Sanchez","17.346.224");
        Cliente cliente3 = new Cliente("Juan", "Perez","32.336.163");

        agenciaTurismo.agregarCliente(cliente1);
        agenciaTurismo.agregarCliente(cliente2);
        agenciaTurismo.agregarCliente(cliente3);


        Proveedor proveedor1 = new Proveedor("Volar Alto S.A.","30-24433243-1",TipoProveedor.MEDIO_TRANSPORTE);
        Proveedor proveedor2 = new Proveedor("Mar Azul S.R.L.","30-29333222-7",TipoProveedor.MEDIO_TRANSPORTE);
        Proveedor proveedor3 = new Proveedor("Truck Master S.A.","30-32777888-3",TipoProveedor.MEDIO_TRANSPORTE);

        Proveedor proveedor4 = new Proveedor("Descansar S.R.L.","30-32256754-3",TipoProveedor.HOSPEDAJE);
        Proveedor proveedor5 = new Proveedor("Duerme Ya S.A.","30-32256754-3",TipoProveedor.HOSPEDAJE);
        Proveedor proveedor6 = new Proveedor("Tranquilidad S.A.","30-23498574-3",TipoProveedor.HOSPEDAJE);

        Proveedor proveedor7 = new Proveedor("Travesia S.A.","30-28428999-3",TipoProveedor.EXCURSION);
        Proveedor proveedor8 = new Proveedor("Locura S.R.L.","30-17747533-3",TipoProveedor.EXCURSION);
        Proveedor proveedor9 = new Proveedor("Mirasol S.R.L.","30-24342931-3",TipoProveedor.EXCURSION);

        agenciaTurismo.agregarProveedor(proveedor1);agenciaTurismo.agregarProveedor(proveedor2);agenciaTurismo.agregarProveedor(proveedor3);
        agenciaTurismo.agregarProveedor(proveedor4);agenciaTurismo.agregarProveedor(proveedor5);agenciaTurismo.agregarProveedor(proveedor6);
        agenciaTurismo.agregarProveedor(proveedor7);agenciaTurismo.agregarProveedor(proveedor8);agenciaTurismo.agregarProveedor(proveedor9);

        MedioTransporte mt1 = new MedioTransporte("Aviones 1",5000,TipoMedioTransporte.AEREA,"Volar Alto S.A.","30-24433243-1");
        MedioTransporte mt2 = new MedioTransporte("Terrestre 1",1500,TipoMedioTransporte.MARITIMA,"Mar Azul S.R.L.","30-29333222-7");
        MedioTransporte mt3 = new MedioTransporte("Maritima 1",3000,TipoMedioTransporte.TERRESTE,"Truck Master S.A.","30-32777888-3");

        Hospedaje h1 = new Hospedaje("Hosteria 1",2300,TipoHospedaje.HOSTERIA,proveedor4);
        Hospedaje h2 = new Hospedaje("Hosteria 1",3600,TipoHospedaje.BUNGALO,proveedor5);
        Hospedaje h3 = new Hospedaje("Hosteria 1",4800,TipoHospedaje.HOTEL,proveedor6);

        Excursion e1 = new Excursion("Excursion 1",1000, proveedor7);
        Excursion e2 = new Excursion("Excursion 1",1000, proveedor8);
        Excursion e3 = new Excursion("Excursion 1",1000, proveedor9);

        PaqueteTurismo pTurismo1 = new PaqueteTurismo("Grecia",mt1,h1);
        pTurismo1.agregarExcursion(e1);




        agenciaTurismo.agregarPaqueteTurismo(pTurismo1);

    }
}
