import java.util.ArrayList;

public class ParqueVehiculos {
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Persona> listaClientes;

    public ParqueVehiculos() {
        listaVehiculos = new ArrayList<>();
        listaClientes = new ArrayList<>();

    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public ArrayList<Persona> getListaClientes() {
        return listaClientes;
    }

    public void añadirVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    public void añadirCliente(Persona cliente){
        listaClientes.add(cliente);
    }

    public Vehiculo getVehiculoByNombre(String marca, String modelo){
        for (Vehiculo vehiculo : listaVehiculos){
            if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo)){
                return vehiculo;
            }
        }
        return null;
    }

    public ArrayList<Vehiculo> getVehiculosSinStock(){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        for (Vehiculo vehiculo: listaVehiculos) {
            if (vehiculo.getUnidades() <= 0){
                vehiculos.add(vehiculo);
            }
        }
        return vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculosEnStock(){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        for (Vehiculo vehiculo: listaVehiculos) {
            if (vehiculo.getUnidades() > 0){
                vehiculos.add(vehiculo);
            }
        }
        return vehiculos;
    }
}
