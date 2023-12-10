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

    @Override
    public String toString(){
        return
                "isbn='" + isbn + '\'' +
                        ", titolo='" + titolo + '\'' +
                        ", annoPubblicazione=" + annoPubblicazione +
                        ", numberoPagine=" + numeroPagine;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getTitolo(){
        return titolo;
    }
    public int getAnnoPubblicazione(){
        return annoPubblicazione;
    }
    public int getNumeroPagine(){
        return numeroPagine;
    }

}
