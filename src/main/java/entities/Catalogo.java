package entities;

public class Catalogo {
    private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    public Catalogo(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }
}
