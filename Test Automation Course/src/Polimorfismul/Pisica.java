package Polimorfismul;

public class Pisica extends Animal{
    @Override
    public void emiteSunet() {
        super.emiteSunet();
        System.out.println("Meau");
    }
}
