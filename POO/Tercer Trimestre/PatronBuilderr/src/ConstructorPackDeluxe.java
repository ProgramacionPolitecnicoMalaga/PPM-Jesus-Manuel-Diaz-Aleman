public class ConstructorPackDeluxe extends ContructorPack{
    @Override
    public void añadirDesayuno() {
        pack.setDesayuno(true);
    }

    @Override
    public void añadirAlmuerzo() {
        pack.setAlmuerzo(true);
    }

    @Override
    public void añadirCena() {
        pack.setCena(true);
    }

    @Override
    public void añadirHabitacion() {
        pack.setHabitacion("Habitacion suite");
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
        pack.setCursoKitSurf(true);
    }

    @Override
    public void añadirActividadesInfantiles() {
        pack.setActividadesInfantiles(false);
    }

    @Override
    public void añadirCinePlaya() {
        pack.setCinePlaya(true);
    }
}
