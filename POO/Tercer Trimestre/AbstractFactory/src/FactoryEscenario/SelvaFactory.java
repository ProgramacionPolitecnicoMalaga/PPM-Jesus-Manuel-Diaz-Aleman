package FactoryEscenario;


import Jugadores.Indiana;
import Jugadores.Jugador;
import Obstaculos.CarceleroTurco;
import Obstaculos.Obstaculo;
import Villanos.Molaram;
import Villanos.Villano;

public class SelvaFactory implements EscenarioFactory {
    @Override
    public Jugador crearJugador() {
        return new Indiana();
    }

    @Override
    public Villano crearVillano() {
        return new Molaram();
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new CarceleroTurco();
    }
}
