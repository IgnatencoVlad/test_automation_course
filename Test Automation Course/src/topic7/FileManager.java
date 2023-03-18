package topic7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    static void scriereaInformatieTextInFisier(String caleaCatreFisier, String date) {
        try {
            FileWriter writer = new FileWriter(caleaCatreFisier);
            writer.write(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void alipireaInformatieiLaFisier(String caleaCatreFisier, String date) {
        try {
            FileWriter writer = new FileWriter(caleaCatreFisier);
            writer.append(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String citireDateDinFisier(String caleaCatreFisier) {
        char c[] = new char[19];
        try {
            FileReader reader = new FileReader(caleaCatreFisier);
            reader.read(c);
            System.out.println("Date citite: ");
            System.out.println(c);
            reader.close();
        } catch (IOException e) {
            System.out.println("Directoriu gresit" + e);
        }
        return caleaCatreFisier;
    }

}
