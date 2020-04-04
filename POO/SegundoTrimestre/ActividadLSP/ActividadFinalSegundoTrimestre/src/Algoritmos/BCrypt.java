package Algoritmos;

import java.security.NoSuchAlgorithmException;

public class BCrypt implements Algoritmos.Algoritmo {

    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        return org.mindrot.jbcrypt.BCrypt.hashpw(password, org.mindrot.jbcrypt.BCrypt.gensalt(12));
    }

    @Override
    public boolean verificarContraseña(String password, String passwordHash) throws NoSuchAlgorithmException {
        return org.mindrot.jbcrypt.BCrypt.checkpw(password,passwordHash);
    }
}
