package topic4;

public class Methods {
    public static int sum(int a, int b) {
        int sum = 0;
        if (a > b) {
            System.out.println("Numerele sunt introduse in oprdinea gresita");
            return sum = 0;
        }

        if (a == b) {
            System.out.println("Numerele sunt egale");
            return (a);
        }

        for (int i = a + 1; i < b; i++)
            sum = sum += i;
        System.out.println("Suma este" + sum);
        return sum;
    }


    public static void sum(int a) {
        if (a < 0) {
            System.out.println("Valoarea a este negativa");
        }
        int sum = 0;
        int i = 0;
        while (i < a) {
            sum += i;
            i++;
        }
    }
}

