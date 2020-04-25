import FactoryEscenario.EscenarioFactory;
import FactoryEscenario.SelectorEscenario;
import Jugadores.Jugador;
import Obstaculos.Obstaculo;
import Villanos.Villano;

public class Juego {
    private EscenarioFactory escenarioFactory;
    private SelectorEscenario selectorEscenario;

    private Jugador jugador;
    private Villano villano;
    private Obstaculo obstaculo;

    public Juego() {
        selectorEscenario = new SelectorEscenario();
    }

    public void seleccionarEscenario(int i){
        escenarioFactory = selectorEscenario.SeleccionarEscenario(i);
    }

    public void crearEscenario(){
        jugador = escenarioFactory.crearJugador();
        villano = escenarioFactory.crearVillano();
        obstaculo = escenarioFactory.crearObstaculo();

    }

    public void mostrarJugador(){
        jugador.mostrarJugador();
    }

    public void mostrarVillano(){
        villano.mostrarVillano();
    }

    public void mostrarObstaculo(){
        obstaculo.mostrarObstaculo();
    }
}
