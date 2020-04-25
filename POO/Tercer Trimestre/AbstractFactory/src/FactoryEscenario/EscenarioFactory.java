package FactoryEscenario;

import Jugadores.Jugador;
import Obstaculos.Obstaculo;
import Villanos.Villano;

public interface EscenarioFactory {
    public Jugador crearJugador();
    public Villano crearVillano();
    public Obstaculo crearObstaculo();
}
