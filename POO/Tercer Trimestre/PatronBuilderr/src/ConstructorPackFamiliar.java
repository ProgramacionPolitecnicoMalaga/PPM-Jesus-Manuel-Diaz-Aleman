public class ConstructorPackFamiliar extends ContructorPack {
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
        pack.setHabitacion("Habitacion doble");
    }

    @Override
    public void añadirCamaAdicional() {
        pack.setCamaAdicional(true);
    }

    @Override
    public void añadirParqueDeAtracciones() {
        pack.setParqueAtracciones(true);
    }

    @Override
    public void añadirCursoKiteSurf() {
        pack.setCursoKitSurf(false);
    }

    @Override
    public void añadirActividadesInfantiles() {
        pack.setActividadesInfantiles(true);
    }

    @Override
    public void añadirCinePlaya() {
        pack.setCinePlaya(true);
    }
}
