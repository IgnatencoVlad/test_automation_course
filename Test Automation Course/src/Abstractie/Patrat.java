package Abstractie;

public class Patrat extends FormaGeometrica {
    private int latura;

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    public Patrat(int latura) {
        this.latura = latura;
    }

    @Override
    int calculArie() {
        return latura * latura;
    }
}
