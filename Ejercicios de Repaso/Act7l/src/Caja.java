import java.util.ArrayList;

public class Caja {
    private ArrayList<Cuenta> cuentas;

    public Caja() {
        cuentas = new ArrayList<>();
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    public double totalCaja(){
        double total = 0;
        for (Cuenta cuenta: cuentas) {
            total += cuenta.getTotal();
        }

        return total;
    }

    public Cuenta getCuentaByNumero(int numeroCuenta){
        Cuenta cuenta = null;
        int i = 0;
        boolean asignada = false;
        while (i<cuentas.size() && !asignada){
            if (cuentas.get(i).getNumeroDeCuenta() == numeroCuenta){
                cuenta = cuentas.get(i);
                asignada = true;
            }
            i++;
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "cuentas=" + cuentas +
                '}';
    }
}
