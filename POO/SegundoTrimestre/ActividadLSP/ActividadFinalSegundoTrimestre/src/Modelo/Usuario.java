package Modelo;

public class Usuario {
    private String nombre, contraseña, algoritmo;

    public Usuario(String nombre, String contraseña, String algoritmo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.algoritmo = algoritmo;
    }

    public Usuario() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    @Override
    public String toString() {
        return "Modelo.Usuario{" +
                ", nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", algoritmo='" + algoritmo + '\'' +
                '}';
    }
}
