package entities;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<Catalogo> catalogo;

    public Archivio() {
        this.catalogo = new ArrayList<>();
    }

    public void aggiungiElemento(Catalogo elemento) {
        catalogo.add(elemento);
    }

    public void rimuoviElementoPerISBN(String codiceISBN) {
        catalogo.removeIf(elemento -> elemento.getIsbn().equals(codiceISBN));
    }

    public Catalogo ricercaPerISBN(String codiceISBN) {
        return catalogo.stream()
                .filter(elemento -> elemento.getIsbn().equals(codiceISBN))
                .findFirst()
                .orElse(null);
    }

    public List<Catalogo> ricercaPerAnnoPubblicazione(int anno) {
        return catalogo.stream()
                .filter(elemento -> elemento.getAnnoPubblicazione() == anno)
                .toList();
    }

    public List<Catalogo> ricercaPerAutore(String autore) {
        return catalogo.stream()
                .filter(elemento -> elemento instanceof Libro && ((Libro) elemento).getAutore().equals(autore))
                .toList();
    }

}
