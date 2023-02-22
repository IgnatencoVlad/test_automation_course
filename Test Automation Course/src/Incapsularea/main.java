package Incapsularea;

public class main {
    public static void main(String[] args) {
        ContBancar Vlad = new ContBancar(23, 233.33f);
        System.out.println(Vlad.getNumarCont());
        Vlad.setNumarCont(56);
        System.out.println("numarul nou al contului este " + Vlad.getNumarCont());
    }

}
