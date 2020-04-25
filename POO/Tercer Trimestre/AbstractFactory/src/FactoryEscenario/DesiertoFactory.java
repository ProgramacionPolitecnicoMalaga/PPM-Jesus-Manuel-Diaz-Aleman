package FactoryEscenario;

import Jugadores.Jugador;
import Jugadores.Patton;
import Obstaculos.Obstaculo;
import Obstaculos.Tanque;
import Villanos.Rommel;
import Villanos.Villano;

public class DesiertoFactory implements EscenarioFactory {
    @Override
    public Jugador crearJugador() {
        return new Patton();
    }

    @Override
    public Villano crearVillano() {
        return new Rommel();
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new Tanque();
    }
}
