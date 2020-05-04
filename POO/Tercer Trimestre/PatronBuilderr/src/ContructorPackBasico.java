public class ContructorPackBasico extends ContructorPack{
    @Override
    public void añadirDesayuno() {
        pack.setDesayuno(true);
    }

    @Override
    public void añadirAlmuerzo() {
    pack.setAlmuerzo(false);
    }

    @Override
    public void añadirCena() {
    pack.setCena(false);
    }

    @Override
    public void añadirHabitacion() {
        pack.setHabitacion("Habitacion simple");
    }

    @Override
    public void añadirCamaAdicional() {
        pack.setCamaAdicional(false);
    }

    @Override
    public void añadirParqueDeAtracciones() {
        pack.setParqueAtracciones(false);
    }

    @Override
    public void añadirCursoKiteSurf() {
        pack.setCursoKitSurf(false);
    }

    @Override
    public void añadirActividadesInfantiles() {
        pack.setActividadesInfantiles(false);
    }

    @Override
    public void añadirCinePlaya() {
        pack.setCinePlaya(false);
    }
}
