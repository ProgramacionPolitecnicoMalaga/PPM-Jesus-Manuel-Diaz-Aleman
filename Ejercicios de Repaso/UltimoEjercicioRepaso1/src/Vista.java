import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    public static final int REALIZAR_VENTA = 1;
    public static final int LISTAR_VEHICULOS_DISPONIBLES = 2;
    public static final int LISTAR_VEHICULOS_VENDIDOS = 3;
    public static final int CONSULTAR_VENTAS = 4;
    public static final int TERMINAR = 5;

    private Scanner lector;

    public Vista(){
        lector = new Scanner(System.in).useDelimiter("\n");
    }

    public int menuInicial(){
        System.out.println("1. Realizar una venta\n" +
                "2. Listar los vehículos disponibles\n" +
                "3. Listar vehículos agotados\n" +
                "4. Consultar las ventas a un cliente\n" +
                "5. Terminar");

        return lector.nextInt();
    }

    public void mostrarVehiculos(ArrayList<Vehiculo> vehiculos){
        if(!vehiculos.isEmpty()){
            for (Vehiculo v : vehiculos) {
                System.out.println(vehiculos.indexOf(v) + ". " + v.getMarca() + " / " + v.getModelo() + " / cantidad: " + v.getUnidades());
            }
            System.out.println("----------------------------------------------");
        }else {
            System.out.println("No hay ningún dato");
            System.out.println("----------------------------------------------");
        }
    }

    public int elegirVehiculo(){
        System.out.println("Elige un vehiculo:");
        return lector.nextInt();
    }

    public int elegirCantidad(){
        System.out.println("Elige una cantidad:");
        return lector.nextInt();
    }

    public void mostrarClientes(ArrayList<Persona> clientes){
        if(!clientes.isEmpty()){
            for (Persona c : clientes) {
                System.out.println(clientes.indexOf(c) + ". " + c);
            }
            System.out.println("----------------------------------------------");
        }else {
            System.out.println("No hay ningún dato");
            System.out.println("----------------------------------------------");
        }
    }

    public int elegircliente(){
        System.out.println("Elige un cliente:");
        return lector.nextInt();
    }

    public void mostrarVentasCliente(ArrayList<Venta> ventas){
        if(!ventas.isEmpty()){
            System.out.println("Ventas del cliente " + ventas.get(0).getPersona());
            for (Venta v : ventas) {
                System.out.println(ventas.indexOf(v) + ". " + v);
            }
            System.out.println("----------------------------------------------");
        }else {
            System.out.println("No hay ningún dato");
            System.out.println("----------------------------------------------");
        }
    }

    public void imprimirMensaje(String mensaje){
            System.out.println(mensaje);
    }

    public String añadirClienteYVehiculo(){
        System.out.println("Introducir cliente y vehiculo");
        return lector.next();
    }
}
