public class Mesa {
    private int numero;
    private boolean ocupada;  // false para mesas cerrada, true para mesas abiertas
    private int tam;



    public Mesa(int numero, int tam) {
        this.numero = numero;
        this.ocupada = false;
        this.tam = tam;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", isCerrada=" + ocupada +
                ", tam=" + tam +
                '}';
    }
}
