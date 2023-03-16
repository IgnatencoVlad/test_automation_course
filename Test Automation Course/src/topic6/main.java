package topic6;

public class main {
    public static void main(String[] args) {
        ContulPersoanei persoana1 = new ContulPersoanei("Vlad", 1, 2323.23);
        ContulPersoanei persoana2 = new ContulPersoanei("Iura", 2, 3131.31);
        persoana2.transferCatrePersoana(2000, persoana1);
        System.out.println(persoana2.getSumaCurenta());
        System.out.println(persoana1.getSumaCurenta());
        persoana1.sustragereBani(1000);
        System.out.println(persoana1.getSumaCurenta());
    }
}
