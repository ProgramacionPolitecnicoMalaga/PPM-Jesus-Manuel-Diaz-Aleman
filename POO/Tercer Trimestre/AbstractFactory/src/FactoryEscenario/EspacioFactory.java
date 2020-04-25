package FactoryEscenario;

import Jugadores.Jugador;
import Jugadores.USSEnterprise;
import Obstaculos.NaveKlingon;
import Obstaculos.Obstaculo;
import Villanos.Khan;
import Villanos.Villano;

public class EspacioFactory implements EscenarioFactory {
    @Override
    public Jugador crearJugador() {
        return new USSEnterprise();
    }

    @Override
    public Villano crearVillano() {
        return new Khan();
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new NaveKlingon();
    }
}
