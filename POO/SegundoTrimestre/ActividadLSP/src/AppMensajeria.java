import java.util.ArrayList;

public class AppMensajeria {
    private Manager manager;
    private ArrayList<Participante> participantes;
    private ArrayList<Invitado> invitados;
    private ArrayList<Mensaje> mensajes;

    public AppMensajeria(String nombre, String apellido) {
         manager = new Manager(nombre, apellido);
        participantes = new ArrayList<>();
        invitados = new ArrayList<>();
        mensajes = new ArrayList<>();
    }

    public Manager getManager() {
        return manager;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    private void addParticipante(Participante participante){
        participantes.add(participante);
    }

    private void addInvitado(Invitado invitado){
        invitados.add(invitado);
    }

    private void addMensaje(Mensaje mensaje){
        mensajes.add(mensaje);
    }

    @Override
    public String toString() {
        return "AppMensajeria{" +
                "manager=" + manager +
                ", participantes=" + participantes +
                ", invitados=" + invitados +
                '}';
    }
}
