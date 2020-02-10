import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Vehiculo {
    private String marca, color, modelo, matricula, estado;
    private int añoFabricacion;

    public Vehiculo(String marca, String color, String modelo, String matricula, String estado, int añoFabricacion) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", estado=" + estado + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                '}';
    }
}
