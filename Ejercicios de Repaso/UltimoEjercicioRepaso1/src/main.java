import javax.xml.xpath.XPathExpressionException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws XPathExpressionException {
       ParqueVehiculos parqueVehiculos = new ParqueVehiculos();
        Ventas ventas = new Ventas();
        VehiculosXMLReader xmlReader = new VehiculosXMLReader();
        xmlReader.getVehiculos(parqueVehiculos);

       parqueVehiculos.añadirCliente( new Persona("aaa", "aaaa"));
        parqueVehiculos.añadirCliente( new Persona("bbb", "bbbb"));
        parqueVehiculos.añadirCliente( new Persona("ccc", "cccc"));


        Vista vista = new Vista();
        int opcion = vista.menuInicial();
        while(opcion != Vista.TERMINAR){
            switch (opcion){
                case Vista.REALIZAR_VENTA:
                    vista.mostrarClientes(parqueVehiculos.getListaClientes());
                    int i = vista.elegircliente();
                    Persona cliente = parqueVehiculos.getListaClientes().get(i);

                    vista.mostrarVehiculos(parqueVehiculos.getListaVehiculos());
                    int j = vista.elegirVehiculo();
                    Vehiculo vehiculo = parqueVehiculos.getListaVehiculos().get(i);

                    int cantidad = vista.elegirCantidad();

                    ventas.añadirVenta(new Venta(cliente,vehiculo,cantidad, parqueVehiculos));
                    ventas.actualizarCantidadVehiculos(parqueVehiculos.getListaVehiculos());
                    break;
                case Vista.LISTAR_VEHICULOS_DISPONIBLES:
                    vista.mostrarVehiculos(parqueVehiculos.getVehiculosEnStock());
                    break;
                case Vista.LISTAR_VEHICULOS_VENDIDOS:
                    vista.mostrarVehiculos(parqueVehiculos.getVehiculosSinStock());
                    break;
                case Vista.CONSULTAR_VENTAS:
                    vista.mostrarClientes(parqueVehiculos.getListaClientes());
                    int x = vista.elegircliente();
                    Persona c = parqueVehiculos.getListaClientes().get(x);
                    vista.mostrarVentasCliente(ventas.getVentaBYCliente(c.getNombre()));
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
            opcion = vista.menuInicial();
        }



        /*System.out.println(parqueVehiculos.getListaVehiculos());

        Vehiculo vehiculo = parqueVehiculos.getListaVehiculos().get(0);
        Persona persona = new Persona("aaaa", "aaaa");
        Venta venta = new Venta(persona, vehiculo, 4);


        Vehiculo vehiculo1 = parqueVehiculos.getListaVehiculos().get(1);
        Persona persona1 = new Persona("bbb", "bbbb");
        Venta venta1 = new Venta(persona1, vehiculo1, 3);

        Vehiculo vehiculo2 = parqueVehiculos.getListaVehiculos().get(2);
        Persona persona2 = new Persona("cccc", "cccc");
        Venta venta2 = new Venta(persona2, vehiculo2, 4);


        ventas.añadirVenta(venta);
        ventas.añadirVenta(venta1);
        ventas.añadirVenta(venta2);
        System.out.println(ventas);

        ArrayList<Venta> ventasDeCliente = ventas.getVentaBYCliente("cccc");
        System.out.println(ventasDeCliente);
*/


/*        ArrayList<Vehiculo> vehiculos1 = new ArrayList<>();
        Vehiculo vehiculo = new Vehiculo("aaa", "aaa", "gas", 10, 15000);
        Vehiculo vehiculo1 = new Vehiculo("bbb", "bbb", "gas", 10, 15000);
        Vehiculo vehiculo2 = new Vehiculo("ccc", "ccc", "gas", 10, 15000);
        vehiculos.add(vehiculo);
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);

        ArrayList<Persona> personas = new ArrayList<>();
        Persona persona = new Persona("aaaa", "aaaa");
        Persona persona1 = new Persona("aaaa", "aaaa");
        personas.add(persona);
        personas.add(persona1);


        ventas.vehiculoDisponible(vehiculo);
        ventas.vehiculoDisponible(vehiculo1);
        ventas.vehiculosVendidos(vehiculo2);

        ventas.ventasRealizadas(persona, vehiculo1);
        ventas.ventasRealizadas(persona1, vehiculo);

        System.out.println(venta.getPersona());
        System.out.println(venta.getListaVehiculos());

 */
    }
}
