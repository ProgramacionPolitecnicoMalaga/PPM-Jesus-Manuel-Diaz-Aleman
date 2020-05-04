public class Hotel{
    private ContructorPack contructorPack;


    public void asignarConstructor(ContructorPack contructorPack){
        this.contructorPack = contructorPack;
    }

    public void crearPack(){
        contructorPack.nuevoPack();
        contructorPack.añadirActividadesInfantiles();
        contructorPack.añadirAlmuerzo();
        contructorPack.añadirCamaAdicional();
        contructorPack.añadirCena();
        contructorPack.añadirCinePlaya();
        contructorPack.añadirCursoKiteSurf();
        contructorPack.añadirDesayuno();
        contructorPack.añadirHabitacion();
        contructorPack.añadirParqueDeAtracciones();
    }
    public Pack obtenerPack(){
        return contructorPack.getPack();
    }

}
