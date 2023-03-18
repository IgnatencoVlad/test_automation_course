package topic7;

import topic6.ContulPersoanei;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ContulPersoanei Client01 = new ContulPersoanei("Iura", 01, 3131.31);
        FileManager.scriereaInformatieTextInFisier("C:/Users/Vitalik/Desktop/DocumentTest.txt", Client01.getNumePersoana());
        FileManager.alipireaInformatieiLaFisier("C:/Users/Vitalik/Desktop/DocumentTest.txt", " este bogat!!!!");
        FileManager.citireDateDinFisier("C:/Users/Vitalik/Desktop/DocumentTest.txt");
    }
}
