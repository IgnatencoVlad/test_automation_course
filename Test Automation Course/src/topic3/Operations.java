package topic3;

import java.sql.SQLOutput;

public class Operations {
    static void printAritmeticOperations() {
        int a = 4, b = 15;
        System.out.println("A ARE VALOAREA 4 IAR B ARE VALOAREA 15");
        System.out.println("Suma este = " + (a + b));
        System.out.println("Diferenta este = " + (a - b));
        System.out.println("Citul este = " + (a / b));
        System.out.println("Produsul este = " + (a * b));
        System.out.println("Restul citului = " + (b % a));
        System.out.println("Incrementul lui a este = " + (++a));
        System.out.println("Decrementul lui a este = " + (--a));
    }

    static void printLogicOperations() {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println();
        System.out.println("A ESTE TRUE IAR B SI C SUNT FALSE");
        System.out.println("a&&b = " + (a && b));
        System.out.println("b||c = " + (b || c));
        System.out.println("!a&&b = " + (!a && b));
    }

    static void printRelationalOperations() {
        int a = 23, b = 23;
        System.out.println();
        System.out.println("A SI B AU VALOAREA 23");
        System.out.println("Numerele sunt egale? - " + (a == b));
        System.out.println("Numerele nu sunt egale? - " + (a != b));
        System.out.println("Numerul a este mai mare sau egal cu b? - " + (a >= b));

    }

    static void useForAndWhile() {
        System.out.println();
        System.out.println("A ARE VALOAREA 7");
        int a = 10;
        if (a > 5) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        for (int b = 6; b < 10; b++) {
            System.out.println("Cool");
        }

        while (a < 12) {
            System.out.println("Acceptat");
            a++;
        }
    }
}
