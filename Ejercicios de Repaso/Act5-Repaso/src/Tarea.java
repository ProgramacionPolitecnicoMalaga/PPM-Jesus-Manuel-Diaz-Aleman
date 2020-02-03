import java.time.LocalDate;
import java.util.Date;

public class Tarea {
    private LocalDate fecha;
    private Categoria categoria;
    private String descripcion;
    private boolean completado;

    public Tarea(LocalDate fecha, Categoria categoria, String descripcion) {
        this.fecha = fecha;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.completado = false;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "fecha=" + fecha +
                ", categoria=" + categoria +
                ", descripcion='" + descripcion + '\'' +
                ", completado=" + completado +
                '}';
    }
}
