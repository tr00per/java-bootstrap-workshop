package czajka.sda.workshop;

import java.util.Scanner;

public class Reading {
    public static void main(String args[]) {
        System.out.print("Wpisz coś: ");

        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        scanner.close();

        System.out.println("Wczytano: " + read);
    }
}
