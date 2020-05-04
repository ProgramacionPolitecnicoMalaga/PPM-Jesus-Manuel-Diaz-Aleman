public class ContructorPackRomance extends ContructorPack{
    @Override
    public void añadirDesayuno() {
        pack.setDesayuno(false);
    }

    @Override
    public void añadirAlmuerzo() {
    pack.setAlmuerzo(false);
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
