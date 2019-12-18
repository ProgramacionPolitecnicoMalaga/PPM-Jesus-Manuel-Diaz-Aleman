import java.util.ArrayList;

public class Aparcamiento {
    ArrayList<Vehiculo> listaConfiscados;
    ArrayList<Vehiculo> listaSubastados;
    ArrayList<Vehiculo> listaVendidos;
    ArrayList<Comprador> clientesAutorizados;
    ArrayList<Evento> eventos;

    public Aparcamiento() {
        this.listaConfiscados = new ArrayList<>();
        this.listaSubastados = new ArrayList<>();
        this.listaVendidos = new ArrayList<>();
        this.clientesAutorizados = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }
    public void confiscarVehiculo(String fecha, Vehiculo vehiculo){
        eventos.add(new Confiscacion(fecha, vehiculo));
        listaConfiscados.add(vehiculo);
    }
    public void subastarVehiculo(String fecha, Vehiculo vehiculo){
        try {
            if(listaConfiscados.contains(vehiculo)){
            eventos.add(new Subasta(fecha, vehiculo));
            listaSubastados.add(vehiculo);
            listaConfiscados.remove(vehiculo);
        }else{
                throw new AparcamientoException("No se puede subastar un vehiculo no confiscado");
            }
        } catch (AparcamientoException e) {
            e.printStackTrace();
        }

    }

    public void venderVehiculo(String fecha, Vehiculo vehiculo, Comprador cliente){
        try {
            if(!clientesAutorizados.contains(cliente)){
                throw new AparcamientoException("El cliente no está autorizado");
            } else if(!listaSubastados.contains(vehiculo)){
                throw new AparcamientoException("No se puede vender vehiculo que no este subastado");
        } else{
                eventos.add(new Compra(fecha, vehiculo, cliente));
                listaVendidos.add(vehiculo);
                listaSubastados.remove(vehiculo);
            }
        }catch (AparcamientoException e) {
            e.printStackTrace();
        }
    }

    public void autorizarCliente(Comprador cliente){
        clientesAutorizados.add(cliente);
    }

    public void imprimirEventos(){
        for(int i=0; i < eventos.size(); i++){
            System.out.println(eventos.get(i).toString());
        }
    }

    public void imprimirVendidos(){
        for(int i=0; i < eventos.size(); i++){
      //   if(eventos.get(i) instanceof ){ si el evento es una compra imprimo
             //imprimir comprador y vehiculo
         }
        }
    }


}
