public class Revistas extends Publicaciones implements Prestable{
    private int numeroEjemplar = 1;

    public Revistas(int codigo, String titulo, int añoPublicacion, boolean prestado, int numeroEjemplar) {
        super(codigo, titulo, añoPublicacion, prestado);
        this.numeroEjemplar = numeroEjemplar;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numeroEjemplar=" + numeroEjemplar +
                ", titulo='" + titulo + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    @Override
    public boolean prestar() {
    return prestado;
    }

    @Override
    public void estaPrestado() {
    prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }
}
