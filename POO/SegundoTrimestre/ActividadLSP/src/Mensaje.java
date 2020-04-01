public class Mensaje {
    private String texto;
    private int tipo;
    private Persona destinatario;

    public Mensaje(String texto, int tipo, Persona destinatario) {
        this.texto = texto;
        this.tipo = tipo;
        this.destinatario = destinatario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "texto='" + texto + '\'' +
                ", tipo=" + tipo +
                ", destinatario=" + destinatario +
                '}';
    }
}
