package Mostenirea;

public class Masina extends Vehicul {
    public String marca;

    public Masina(String culoare, Integer nrRoti, String marca) {
        super(culoare, nrRoti);
        this.marca = marca;
    }

    @Override
    public void afiseazaDetaliiVehicul() {
        super.afiseazaDetaliiVehicul();
        System.out.println(" iar marca este " + marca);
    }
}

