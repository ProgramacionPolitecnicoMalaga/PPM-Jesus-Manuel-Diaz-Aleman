import java.awt.event.PaintEvent;
import java.util.ArrayList;

public class Ventas {
    private ArrayList<Venta> ventas;

    public Ventas() {
        ventas = new ArrayList<>();
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public void añadirVenta(Venta venta){
        ventas.add(venta);
    }

    public ArrayList<Venta> getVentaBYCliente(String nombre){
       ArrayList<Venta> ventasPorComprador = new ArrayList<>();
        for(Venta venta : ventas){
            if (venta.getPersona().getNombre().equals(nombre)){
                ventasPorComprador.add(venta);
            }
        }
        return ventasPorComprador;
    }

    public void actualizarCantidadVehiculos(ArrayList<Vehiculo> vehiculos){
        for (Venta v: ventas) {
            Vehiculo vehiculoVenta = v.getVehiculo();
            System.out.println(v);
            int i = 0;
            boolean encontrado = false;
            while(i<vehiculos.size() && !encontrado){
                Vehiculo vehiculo = vehiculos.get(i);
                if(vehiculo.equals(vehiculoVenta)){
                    encontrado = true;
                    vehiculo.setUnidades(vehiculo.getUnidades()-v.getCantidad());
                }
                i++;
            }
        }
    }


    @Override
    public String toString() {
        return "Ventas{" +
                "ventas=" + ventas +
                '}';
    }
}
