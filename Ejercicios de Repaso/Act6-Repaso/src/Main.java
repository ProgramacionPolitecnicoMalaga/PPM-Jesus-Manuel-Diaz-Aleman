import java.time.*;

public class Main {
        public static void main(String[] args) {
            Concesionario concesionario = new Concesionario();

            Vehiculo v1 = new Vehiculo("rsg", "azul", "sfgs", "CCCCC", "usado",2015);
            Vehiculo v2 = new Vehiculo("rsg", "azul", "sfgs", "BBBBB", "nuevo", 2019);
            Vehiculo v3 = new Vehiculo("rsg", "azul", "sfgs", "AAAAA", "nuevo", 2019);

            Cliente c1 =  new Cliente("ggsg", "gdsdg", "111111", new CuentaBancaria(555555, 50000));
            Cliente c2 =  new Cliente("ggsg", "gdsdg", "222222", new CuentaBancaria(555555, 50000));
            Cliente c3 =  new Cliente("ggsg", "gdsdg", "333333", new CuentaBancaria(555555, 50000));

            concesionario.añadirVehiculo(v1);
            concesionario.añadirVehiculo(v2);
            concesionario.añadirCliente(c1);
            concesionario.añadirCliente(c2);

            concesionario.realizarVenta(v1, c2, 20000);
            System.out.println(c2.getCuentaBancaria().getSaldo());
            concesionario.realizarCompra(v2, c1, 20000);
            System.out.println(c1.getCuentaBancaria().getSaldo());

            concesionario.realizarCompra(v1, c3, 20000);  //Exepcion
            concesionario.realizarVenta(v3, c1, 15000);   //Exepcion

            concesionario.saldoTotalCliente(c1);
            System.out.println(c1.getCuentaBancaria());
        }
    }

