package entities;

public class Riviste extends Catalogo {

    private Periodicita periodicita;

    public Riviste(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
}
