package Algoritmos;

import java.security.NoSuchAlgorithmException;

public interface Algoritmo {
     String generarHash(String password) throws NoSuchAlgorithmException;
     boolean verificarContraseña(String password, String passwordHash) throws NoSuchAlgorithmException;
}
