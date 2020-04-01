package DAO;

import Modelo.Item;

import java.util.ArrayList;

public interface ItemDAO {
    boolean insertarItem(Item item);
    ArrayList<Item> mostrarItems();
    boolean eliminarItem(String autor);
}
