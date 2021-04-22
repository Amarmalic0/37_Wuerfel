import java.util.Random;
import java.util.Scanner;

public class Main {

    static void zahlAusgeben(int x) {
        System.out.println("Zahl ausgeben: " + x);
    }

    static void ausgeben(int[] wuerfelergebnisse) {
        for (int i = 0; i < wuerfelergebnisse.length; i++) {
            System.out.println(wuerfelergebnisse[i]);
        }
    }

    static void wuerfeln(int[] wuerfelergebnisse) {
        Random random = new Random();
        for (int i = 0; i < wuerfelergebnisse.length; i++) {
            wuerfelergebnisse[i] = random.nextInt(6) + 1;
        }
    }

    public static void main(String[] args) {
        // Variablendeklaration & Ranom
        Random random = new Random();
        int[] wuerfelergebnisse = new int[100];
        wuerfeln(wuerfelergebnisse);

        ausgeben(wuerfelergebnisse);
        int y = 5;
        System.out.println(y);
        zahlAusgeben(y);
        System.out.println(y);
    }


    static void eingabe(int[] zahlen) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Gib " + zahlen.length + " Zahlen ein:");
        while (i < zahlen.length) {
            System.out.print((i + 1) + ". Zahl: ");
            zahlen[i] = sc.nextInt();
            i++;
        }


    }


    static void main(String[] args) {
        int[] zahlen = new int[10];
        int summe = 0;

        ausgabe(zahlen);
        eingabe(zahlen);
        ausgabe(zahlen);
        summe = summe(zahlen);

    }


    static int summe(int[] zahlen) {
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe = summe + zahlen[i];
        }
        return summe;
    }
}