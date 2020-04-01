public class Manager extends EscribirMensaje{
    public Manager(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario) {
        Mensaje mensaje = null;
        try {
        if (tipoMensaje != 0 && tipoMensaje != 1 && tipoMensaje != 2) throw new MensajeExeption("No existe ese tipo de mensaje"); // 0 notificacion, 1 tarea, 2 etiqueta.

            else {
                mensaje = new Mensaje(texto, tipoMensaje, destinatario);
        }
            } catch (MensajeExeption mensajeExeption) {
                mensajeExeption.printStackTrace();
            }

        return mensaje;
    }
}
