package Modelo;

import java.time.LocalDate;

public class Item {
    private String autor, texto, tema;
    private LocalDate fecha;

    public Item(String autor, LocalDate fecha, String texto, String tema) {
        this.autor = autor;
        this.texto = texto;
        this.fecha = fecha;
        this.tema = tema;
    }

    public Item() {

    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Item{" +
                "autor='" + autor + '\'' +
                ", texto='" + texto + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
