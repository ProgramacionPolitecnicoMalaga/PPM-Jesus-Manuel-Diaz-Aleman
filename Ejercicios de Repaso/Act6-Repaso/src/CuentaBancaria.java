public class CuentaBancaria {
    private int numeroDeCuenta;
    private double saldo;

    public CuentaBancaria(int numeroDeCuenta, double saldo) {
        if(saldo < 0) try {
            throw  new ConcesionarioException("El saldo inicial no puede ser negativo");
        } catch (ConcesionarioException e) {
            e.printStackTrace();
        }
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sumarSaldo(int cantidad){
        saldo = saldo + cantidad;
    }

    public void restarSaldo(int cantidad){
        try { if(cantidad > saldo)
            throw new Exception("No puedes restar más saldo del disponible");
        } catch (Exception e) {
            e.printStackTrace();
        }
        saldo = saldo - cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroDeCuenta=" + numeroDeCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
