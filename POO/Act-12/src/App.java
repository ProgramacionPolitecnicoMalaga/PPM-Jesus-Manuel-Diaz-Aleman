public class App {
    public static void main(String[] args){

        Aparcamiento aparcamiento = new Aparcamiento();
        Barcos barco1 = new Barcos("05-11-2003", "05-12-2003", 12, "barco", 4.3, 2.6, 9.2);
        Barcos barco2 = new Barcos("05-11-2003", "05-12-2005", 6, "barcoAAA", 4.3, 2.6, 9.2);
        Barcos barco3 = new Barcos("05-11-2003", "05-12-2005", 6, "barco934", 4.3, 2.6, 9.2);

        Comprador comprador = new PersonaFisica("Pepe", "García", "12657S", "dsbhk");
        Comprador comprador1 = new PersonaFisica("Juan", "García", "12425A", "dsbhk");

        aparcamiento.autorizarCliente(comprador1);

        aparcamiento.confiscarVehiculo("05-11-2019",barco1);
        aparcamiento.confiscarVehiculo("05-01-2019",barco2);
        aparcamiento.confiscarVehiculo("03-01-2019",barco3);
        aparcamiento.subastarVehiculo("05-04-2019",barco2);
        aparcamiento.subastarVehiculo("05-04-2019",barco3);
        aparcamiento.venderVehiculo("05-01-2019", barco2, comprador1);


        aparcamiento.imprimirEventos();
        System.out.println(aparcamiento.listaConfiscados.toString());
        System.out.println(aparcamiento.listaSubastados.toString());
        System.out.println(aparcamiento.listaVendidos.toString());
    }
}
