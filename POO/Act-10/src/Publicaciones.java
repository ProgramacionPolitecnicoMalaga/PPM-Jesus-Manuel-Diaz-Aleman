public class Publicaciones {
    private int codigo;
    public String titulo;
    private int añoPublicacion;
    public boolean prestado  /*false*/;

    public Publicaciones(int codigo, String titulo, int añoPublicacion, boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.prestado = prestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isPrestado() {
        return prestado = false;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", prestado=" + prestado +
                '}';
    }
}
