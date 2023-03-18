package topic8;

import java.util.ArrayList;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte Nr1 = new Carte("Titlu1", "Autor1", 1, 100);
        Carte Nr2 = new Carte("Titlu2", "Autor2", 2, 200);
        Carte Nr3 = new Carte("Titlu3", "Autor3", 3, 300);
        Carte Nr4 = new Carte("Titlu4", "Autor4", 4, 400);
        Carte Nr5 = new Carte("Titlu5", "Autor5", 5, 500);
        Stoc Centru = new Stoc(1, "Independentii 1");
        Centru.adaugaCarteStoc(Nr1);
        Centru.adaugaCarteStoc(Nr2);
        Centru.adaugaCarteStoc(Nr3);
        Centru.adaugaCarteStoc(Nr4);
        System.out.println(Centru.nrDeCasrtiInStoc());
        System.out.println(Centru.esteStoculGol());
        Centru.stergeCarteStoc(Nr4);
        System.out.println(Centru.nrDeCasrtiInStoc());
        System.out.println(Centru.existaCarteInStoc(Nr5));
        System.out.println(Centru.existaCarteInStoc(Nr3));
    }
}
