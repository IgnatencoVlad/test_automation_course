package Abstractie;

public class Triunghi extends FormaGeometrica {
    private int latura;
    private int baza;

    public int getBaza() {
        return baza;
    }

    public void setBaza(int baza) {
        this.baza = baza;
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    public Triunghi(int latura, int baza) {
        setLatura(latura);
        setBaza(baza);
    }

    @Override
    int calculArie() {
        return (latura * baza) / 2;
    }
}
