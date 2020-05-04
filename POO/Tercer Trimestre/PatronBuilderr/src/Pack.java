public class Pack {
    private String habitacion;
    private boolean desayuno, almuerzo, cena, camaAdicional, parqueAtracciones, cursoKitSurf, actividadesInfantiles, cinePlaya;

    public Pack() {

    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public boolean isAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(boolean almuerzo) {
        this.almuerzo = almuerzo;
    }

    public boolean isCena() {
        return cena;
    }

    public void setCena(boolean cena) {
        this.cena = cena;
    }

    public boolean isCamaAdicional() {
        return camaAdicional;
    }

    public void setCamaAdicional(boolean camaAdicional) {
        this.camaAdicional = camaAdicional;
    }

    public boolean isParqueAtracciones() {
        return parqueAtracciones;
    }

    public void setParqueAtracciones(boolean parqueAtracciones) {
        this.parqueAtracciones = parqueAtracciones;
    }

    public boolean isCursoKitSurf() {
        return cursoKitSurf;
    }

    public void setCursoKitSurf(boolean cursoKitSurf) {
        this.cursoKitSurf = cursoKitSurf;
    }

    public boolean isActividadesInfantiles() {
        return actividadesInfantiles;
    }

    public void setActividadesInfantiles(boolean actividadesInfantiles) {
        this.actividadesInfantiles = actividadesInfantiles;
    }

    public boolean isCinePlaya() {
        return cinePlaya;
    }

    public void setCinePlaya(boolean cinePlaya) {
        this.cinePlaya = cinePlaya;
    }

    @Override
    public String toString() {
        return "Packs{" +
                "habitacion='" + habitacion + '\'' +
                ", desayuno=" + desayuno +
                ", almuerzo=" + almuerzo +
                ", cena=" + cena +
                ", camaAdicional=" + camaAdicional +
                ", parqueAtracciones=" + parqueAtracciones +
                ", cursoKitSurf=" + cursoKitSurf +
                ", actividadesInfantiles=" + actividadesInfantiles +
                ", cinePlaya=" + cinePlaya +
                '}';
    }
}
