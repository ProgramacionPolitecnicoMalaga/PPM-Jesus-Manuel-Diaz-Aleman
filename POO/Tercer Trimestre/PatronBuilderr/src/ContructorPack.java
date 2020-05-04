abstract public class ContructorPack {

    protected Pack pack;

    public void nuevoPack() {
        pack = new Pack();
    }

    public Pack getPack() {
        return pack;
    }

    public abstract void añadirDesayuno();

    public abstract void añadirAlmuerzo();

    public abstract void añadirCena();

    public abstract void añadirHabitacion();

    public abstract void añadirCamaAdicional();

    public abstract void añadirParqueDeAtracciones();

    public abstract void añadirCursoKiteSurf();

    public abstract void añadirActividadesInfantiles();

    public abstract void añadirCinePlaya();

}
