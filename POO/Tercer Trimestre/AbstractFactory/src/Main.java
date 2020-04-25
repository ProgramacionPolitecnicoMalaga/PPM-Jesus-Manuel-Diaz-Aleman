public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.seleccionarEscenario(2); // El tipo 0 es el escenario Selva, 1 Desierto y 2 Espacio.
        juego.crearEscenario();
        juego.mostrarJugador();
        juego.mostrarVillano();
        juego.mostrarObstaculo();
    }
}
