package topic5;

public class Patrat extends FiguraGeometrica {
    private int lungimeLatura;

    @Override
    double returneazaAria() {
        return lungimeLatura * lungimeLatura;
    }

    @Override
    double returneazaPerimetrul() {
        return lungimeLatura * 4;
    }

    public int getLungimeLatura() {
        return lungimeLatura;
    }

    public void setLungimeLatura(int lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }
}
