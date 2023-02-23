package Mostenirea;

public class Vehicul {
    public String culoare;
    public Integer nrRoti;

    public Vehicul(String culoare, Integer nrRoti) {
        this.culoare = culoare;
        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul() {
        System.out.println("culoarea este " + culoare + "numarul de roti este " + nrRoti);
    }

}
