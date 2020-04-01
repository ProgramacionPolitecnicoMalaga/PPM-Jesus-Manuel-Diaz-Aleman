public abstract class EscribirMensaje extends Persona{
    public EscribirMensaje(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public abstract Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario);
}
