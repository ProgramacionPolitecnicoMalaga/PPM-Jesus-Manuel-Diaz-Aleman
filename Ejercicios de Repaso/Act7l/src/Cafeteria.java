import java.util.ArrayList;

public class Cafeteria {
    private ArrayList<Mesa> mesas;
    private Caja caja;
    private Carta carta;

    public Cafeteria() {
        mesas = new ArrayList<>();
        this.caja = new Caja();
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void addMesa(Mesa mesa){
        mesas.add(mesa);
    }

    public Caja getCaja() {
        return caja;
    }

    public Mesa asignarPrimeraMesaLibre(int tam){
        Mesa mesa = null;
          int i = 0;
          boolean asignada = false;
          while (i<mesas.size() && !asignada){
              if (!mesas.get(i).isOcupada() && mesas.get(i).getTam() >=tam){
                  mesa = mesas.get(i);
                  Cuenta cuenta = new Cuenta(caja.getCuentas().size()); //autoincrementar el numero de la cuenta
                  caja.addCuenta(cuenta);
                  cuenta.ocuparMesa(mesa);
                  asignada = true;
              }
              i++;
          }
        return mesa;
    }

    public void asignarMesa(Mesa mesa){
        try { if(!mesa.isOcupada()){
            Cuenta cuenta = new Cuenta(caja.getCuentas().size()); //autoincrementar el numero de la cuenta
            caja.addCuenta(cuenta);
            cuenta.ocuparMesa(mesa);
        }else {
            throw new OcupadaException("La mesa está ocupada");
        }
        }catch (OcupadaException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Mesa> consultarMesasOcupadas(){
        ArrayList<Mesa> listaMesas = new ArrayList<>();
        for (Mesa mesa: mesas) {
            if (mesa.isOcupada()){
                listaMesas.add(mesa);
            }
        }
        return listaMesas;
    }

    public ArrayList<Mesa> consultarMesasLibres(){
        ArrayList<Mesa> listaMesas = new ArrayList<>();
        for (Mesa mesa: mesas) {
            if (!mesa.isOcupada()){
                listaMesas.add(mesa);
            }
        }
        return listaMesas;
    }

    public double consultarRecuento(){
        return caja.totalCaja();
    }

    public void cerrarMesa(int numeroDeCuenta){
        Cuenta cuenta = getCuentaByNumero(numeroDeCuenta);
        cuenta.cobrarMesa();
    }

    public void añadirProductoUnaCuenta(int numeroCuenta,Producto producto){
        Cuenta cuenta = getCuentaByNumero(numeroCuenta);
        cuenta.addProductoEnCuenta(producto);
    }

    public Cuenta getCuentaByNumero(int numeroCuenta){
        return caja.getCuentaByNumero(numeroCuenta);
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "mesas=" + mesas +
                ", recuentoDeCaja=" + caja +
                '}';
    }
}

