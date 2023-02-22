package Abstractie;

public class Dreptunghi extends FormaGeometrica{
    private int laturaA;
    private int laturaB;

    public int getLaturaA() {
        return laturaA;
    }

    public void setLaturaA(int laturaA) {
        this.laturaA = laturaA;
    }

    public int getLaturaB() {
        return laturaB;
    }

    public void setLaturaB(int laturaB) {
        this.laturaB = laturaB;
    }

    public Dreptunghi(int laturaA, int laturaB) {
        this.laturaA = laturaA;
        this.laturaB = laturaB;
    }

    @Override
    int calculArie() {
        return laturaA*laturaB;
    }
}
