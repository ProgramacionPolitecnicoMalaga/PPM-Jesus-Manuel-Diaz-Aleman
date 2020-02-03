import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Operacion> listaCompras;
    private ArrayList<Operacion> listaVentas;

    public Concesionario() {
        listaVehiculos = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaCompras = new ArrayList<>();
        listaVentas = new ArrayList<>();
    }

    public ArrayList<Operacion> getListaVentas() {
        return listaVentas;
    }

    public ArrayList<Operacion> getListaCompras() {
        return listaCompras;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void añadirVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    public void eliminarVehiculo(Vehiculo vehiculo){
        listaVehiculos.remove(vehiculo);
    }
    public void añadirCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    public void añadirVenta(Operacion venta){
        listaVentas.add(venta);
    }
    public void añadirCompra(Operacion compra){
        listaCompras.add(compra);
    }

    public void realizarVenta(Vehiculo vehiculo, Cliente cliente, int precio){
        try {
            if(!listaClientes.contains(cliente)){
                throw new Exception("Este cliente no está autorizado");
            } else if(!listaVehiculos.contains(vehiculo)){
                throw new Exception("Este vehículo no se encuentra en el concesionario");
            }else{
                eliminarVehiculo(vehiculo);
                añadirVenta(new Venta(precio, cliente, vehiculo));
                cliente.pagar(precio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void realizarCompra(Vehiculo vehiculo, Cliente cliente, int precio){
        try {
            if(!listaClientes.contains(cliente)){
                throw new Exception("Este cliente no está autorizado");
            }else {
                añadirVehiculo(vehiculo);
                añadirCompra(new Compra(precio, cliente, vehiculo));
                cliente.ingresar(precio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public double saldoTotalCliente(Cliente cliente){
        double saldo = 0;
        for (Operacion compra: listaCompras) {
            if(compra.getCliente().equals(cliente)){
                saldo -= compra.getPrecioAcordado();
            }
        }
        for (Operacion venta: listaVentas) {
            if(venta.getCliente().equals(cliente)){
                saldo += venta.getPrecioAcordado();
            }
        }
        return saldo;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "listaVehiculos=" + listaVehiculos +
                ", listaClientes=" + listaClientes +
                ", listaCompras=" + listaCompras +
                ", listaVentas=" + listaVentas +
                '}';
    }
}
