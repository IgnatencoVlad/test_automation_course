package topic4;

public class Persoana {
    String nume;
    String prenume;
    int virsta;
    char gen;
    int numarID;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVirsta() {
        return virsta;
    }

    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }
    public Persoana (String nume, int virsta) {
        this.nume = nume;
        this.virsta = virsta;
    }
    public void categorieVirsta(){
        if (virsta <= 3)
            System.out.println("El este copil");
        if (3 < virsta && virsta < 18)
            System.out.println("El este adolescent");
        if (virsta > 18)
            System.out.println("El este matur");
    }
}
