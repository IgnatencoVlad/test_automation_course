package topic5;

public class Romb extends FiguraGeometrica {
    private int diagonalaUnu;
    private int diagonalaDoi;

    @Override
    double returneazaAria() {
        return (diagonalaUnu * diagonalaDoi) / 2;
    }

    @Override
    double returneazaPerimetrul() {
        return 0;
    }

    public int getDiagonalaUnu() {
        return diagonalaUnu;
    }

    public void setDiagonalaUnu(int diagonalaUnu) {
        this.diagonalaUnu = diagonalaUnu;
    }

    public int getDiagonalaDoi() {
        return diagonalaDoi;
    }

    public void setDiagonalaDoi(int diagonalaDoi) {
        this.diagonalaDoi = diagonalaDoi;
    }
}
