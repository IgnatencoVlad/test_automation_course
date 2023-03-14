package topic5;

public class Cerc extends FiguraGeometrica {
    private int razaCercului;

    @Override
    double returneazaAria() {
        return razaCercului * razaCercului * 3.14;
    }

    @Override
    double returneazaPerimetrul() {
        return razaCercului * 2 * 3.14;
    }

    public int getRazaCercului() {
        return razaCercului;
    }

    public void setRazaCercului(int razaCercului) {
        this.razaCercului = razaCercului;
    }
}
