public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        ContructorPackBasico contructorPackBasico = new ContructorPackBasico();
        ContructorPackRomance contructorPackRomance = new ContructorPackRomance();
        ConstructorPackFamiliar constructorPackFamiliar = new ConstructorPackFamiliar();
        ConstructorPackPadresRelajados constructorPackPadresRelajados = new ConstructorPackPadresRelajados();
        ConstructorPackDeluxe constructorPackDeluxe = new ConstructorPackDeluxe();
        ConstructorPackDeluxeFamiliar constructorPackDeluxeFamiliar = new ConstructorPackDeluxeFamiliar();
        hotel.asignarConstructor(constructorPackFamiliar); // Asignatar aqui uno de los packs, en este caso muestra el ConstructorPackFamiliar.
        hotel.crearPack();
        Pack pack = hotel.obtenerPack();
        System.out.println(pack);
    }
}
