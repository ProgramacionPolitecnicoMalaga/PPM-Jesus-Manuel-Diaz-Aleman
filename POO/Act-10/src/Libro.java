public class Libro extends Publicaciones implements Prestable{
    private String autor;
    private int IBSN;

    public Libro(int codigo, String titulo, int añoPublicacion, boolean prestado, String autor, int IBSN) {
        super(codigo, titulo, añoPublicacion, prestado);
        this.autor = autor;
        this.IBSN = IBSN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIBSN() {
        return IBSN;
    }

    public void setIBSN(int IBSN) {
        this.IBSN = IBSN;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", IBSN=" + IBSN +
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
        prestado =  true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }
}
