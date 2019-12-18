import java.util.LinkedList;

public class DoUndo {

    private LinkedList<Integer> done;
    private LinkedList<Integer> undone;

    private void doActiob(Integer avance, Jugador jugador){
        jugador.avanza(avance);
        done.addFirst(new Jugada(avance, jugador));
    }
    private void undo(){
        Jugada jugadaADeshacer = done.pollFirst();
        Jugador jugador jugadaADeshacer.getJugador();
        int desplazamiento = jugadaADeshacer.getMovimiento();
                jugador.retroceder(desplazamiento);
        undone.addFirst(jugadaADeshacer);
    }
    private void redo(){
        Jugada jugadaARehacer = undone.pollFirst();
        Jugador jugador = jugadaARehacer.getMovimiento();
        jugador.avanzar(desplazamiento);
        done.addFirst(jugadaARehacer);
    }
}
