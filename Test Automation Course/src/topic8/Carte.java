package topic8;

public class Carte {
    String titlu;
    String autor;
    int numarDeSerie;
    int pagini;

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumarDeSerie() {
        return numarDeSerie;
    }

    public int getPagini() {
        return pagini;
    }

    public Carte(String titlu, String autor, int numarDeSerie, int pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.numarDeSerie = numarDeSerie;
        this.pagini = pagini;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

