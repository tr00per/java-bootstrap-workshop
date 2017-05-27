import java.util.InputMismatchException;
import java.util.Scanner;

public class Workshop {

    public static final int ILOSC_SCAN_KOSCI = 10;
    public static final int MINIMALNY_WYNIK = 1;

    public static void main(String args[]) {
//        System.out.print("Witaj, świecie! 1");
//        System.out.println("Witaj, świecie! 2");
//        System.out.println("5555555"); // String
//        System.out.println('5');       // char
//        System.out.println(5);         // -> int <- / Integer
//        System.out.println(true);      // boolean
//        System.out.println(false);     // boolean

//        System.out.println("A".compareTo("B")); // porównanie ciągów znaków
//        System.out.println(5 + 4120310);
//        System.out.println(5 > 4120310);
//        System.out.println('B' < 'a'); // bo 'B' -> 66, 'a' -> 97
//        System.out.println(5 <= 4120310);
//        System.out.println(1 == 1);
//        System.out.println(1 == '1'); // <- prawie JavaScript, nie działa w Dżawie

//        System.out.println();
//        System.out.println("ABC");
//        System.out.println(Math.random());                 // [0, 1)
//        System.out.println(Math.random() * 6);             // [0, 6)
//        System.out.println(Math.floor(Math.random() * 6)); // [0, 5]
//        System.out.println(Math.floor(Math.random() * 6) + 1); // [1, 6]
//        System.out.println((int) Math.floor(Math.random() * 6) + 1); // [1, 6]

//        System.out.println(Math.random() > 0.5);
//        System.out.println((int) Math.floor(Math.random() * 6) + 1 > 3);

//        int wylosowana = (int) Math.floor(Math.random() * 6) + 1;
//        System.out.println(wylosowana);
//        System.out.println(wylosowana + 3);
//        System.out.println("Wylosowano: " + wylosowana);
//        System.out.println("Wylosowano: " + (wylosowana + 3));
//        System.out.println(wylosowana < 3);
//        System.out.println(wylosowana > 3);

//        System.out.print("> ");
////        System.in.read() // tylko bajty :(
//        Scanner czytacz = new Scanner(System.in);
//        String linia = czytacz.nextLine();
//        System.out.println(linia);
//
//        if (linia.equals("Artur")) {
//            System.out.println("Świat jest piękny!");
//        }
//        else {
//            System.out.println("Nie jesteś Arturem!");
//        }
//        int wczytana = czytacz.nextInt();
//        czytacz.close();

        // przywitaj użytkownika
//        System.out.println("Witaj! Spróbuj zgadnąć liczbę (1-6)");
        System.out.println("Witaj! Spróbuj zgadnąć liczbę (" +
                MINIMALNY_WYNIK + "-" + ILOSC_SCAN_KOSCI + ")");

        // wylosuj liczbę
        int wylosowana = (int) Math.floor(Math.random() * ILOSC_SCAN_KOSCI) + MINIMALNY_WYNIK;

        Scanner czytacz = new Scanner(System.in);
        int wczytana = MINIMALNY_WYNIK - 1;

        do {
            // poproś o zgadnięcie liczby -- int wczytana = czytacz.nextInt();
            System.out.print(">");
            try {
                wczytana = czytacz.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("To nie jest liczba!");
                czytacz.skip(".*");
                continue;
            }

            // wyświetl, czy wczytana liczba jest większa/mniejsza/równa wylosowanej
            if (wylosowana == wczytana) {
                System.out.println("Udało się!");
            } else if (wylosowana < wczytana) {
                System.out.println("Za dużo!");
            } else {
                System.out.println("Za mało!");
            }
        } while (wylosowana != wczytana);

        czytacz.close();
    }
}
