import java.time.*;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        Vehiculo v1 = new Vehiculo("rsg", "azul", "sfgs", "CCCCC", LocalDate.of(2018,3,3));
        Vehiculo v2 = new Vehiculo("rsg", "azul", "sfgs", "BBBBB", LocalDate.of(2018,3,3));
        Vehiculo v3 = new Vehiculo("rsg", "azul", "sfgs", "AAAAA", LocalDate.of(2018,3,3));

       Cliente c1 =  new Cliente("ggsg", "gdsdg", "111111", new CuentaBancaria(555555, 5000));
       Cliente c2 =  new Cliente("ggsg", "gdsdg", "222222", new CuentaBancaria(555555, 500000));
       Cliente c3 =  new Cliente("ggsg", "gdsdg", "333333", new CuentaBancaria(555555, 500000));

        concesionario.añadirVehiculo(v1);
        concesionario.añadirVehiculo(v2);
        concesionario.añadirCliente(c1);
        concesionario.añadirCliente(c2);

        concesionario.realizarVenta(v1, c2, 20000);
        System.out.println(c2.getCuentaBancaria().getSaldo());
        concesionario.realizarCompra(v2, c1, 5000);
        System.out.println(c1.getCuentaBancaria().getSaldo());
    }
}
