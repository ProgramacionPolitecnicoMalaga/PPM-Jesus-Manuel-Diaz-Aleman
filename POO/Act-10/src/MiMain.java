import java.util.Arrays;

public class MiMain {
    public static void main(String[] args){
        Publicaciones[] publicaciones = new Publicaciones[2];
        publicaciones[0] = new Libro(107380, "Narnia", 2006, false, "dgsd", 13422);
        publicaciones[1] = new Revistas(36251, "WoW", 2004, false, 4);

        for(int i = 0; i<publicaciones.length; i++){
            System.out.println(Arrays.toString(publicaciones));
        }
    }
}
