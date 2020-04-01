public class Participante extends EscribirMensaje{
    public Participante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario) {  // 0 notificacion, 1 tarea, 2 etiqueta.
        Mensaje mensaje = null;
        try {
            if (tipoMensaje != 0 && tipoMensaje != 1 && tipoMensaje != 2) {
                throw new MensajeExeption("El tipo de mensaje no es correcto.");

            } else if (tipoMensaje == 0) {
                throw new MensajeExeption("El usuario no está autorizado a escribir una tarea");

            }
            else {
                mensaje = new Mensaje(texto, tipoMensaje, destinatario);
            }
        } catch (MensajeExeption e) {
            e.printStackTrace();
        }
        return mensaje;
    }
    }

