package Abstractie;

public class main {
    public static void main(String[] args) {
        FormaGeometrica patrat1 = new Patrat(3);
        System.out.println("Aria patratului este " + patrat1.calculArie());

        FormaGeometrica triunghi1;
        triunghi1 = new Triunghi(5, 4);
        System.out.println("Aria triunghiului este " + triunghi1.calculArie());

        FormaGeometrica dreptunghi1 = new Dreptunghi(5, 6);
        System.out.println("Aria dreptunghiului este " + dreptunghi1.calculArie());
        {
        }
    }
}



