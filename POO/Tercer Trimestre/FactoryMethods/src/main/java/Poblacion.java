public class Poblacion {
    private int año, numeroEmpadronado;
    private String nacionalidad;

    public Poblacion(int año, int numeroEmpadronado, String nacionalidad) {
        this.año = año;
        this.numeroEmpadronado = numeroEmpadronado;
        this.nacionalidad = nacionalidad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumeroEmpadronado() {
        return numeroEmpadronado;
    }

    public void setNumeroEmpadronado(int numeroEmpadronado) {
        this.numeroEmpadronado = numeroEmpadronado;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Poblacion{" +
                "año=" + año +
                ", numeroEmpadronado=" + numeroEmpadronado +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
