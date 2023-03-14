package topic5;

public class main {
    public static void main(String[] args) {
        Cerc cerc1 = new Cerc();
        cerc1.setRazaCercului(5);
        System.out.println("Aria cercului este " + cerc1.returneazaAria() + " Iar perimetrul este " + cerc1.returneazaPerimetrul());

        Patrat patrat1 = new Patrat();
        patrat1.setLungimeLatura(7);
        System.out.println("Aria patratului este " + patrat1.returneazaAria() + " Iar perimetrul este " + patrat1.returneazaPerimetrul());
    }
}
