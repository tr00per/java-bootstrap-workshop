package czajka.sda.workshop;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FullDice {
    private static final int MIN_DICE_VALUE = 1;
    private static final int DICE_SIDES = 6;

    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println(" Zgadnij liczbę!");
        System.out.println("=================");

        System.out.println("Rzucam kostką " + DICE_SIDES + "-ścienną...");
        int randomNumber = rollDice(DICE_SIDES);

        guessGame(randomNumber);
    }

    private static int rollDice(int sides) {
        return (int) Math.floor(Math.random() * sides + MIN_DICE_VALUE);
    }

    private static void guessGame(int randomNumber) {
        try (Scanner scanner = new Scanner(System.in)) {
            int guess;
            do {
                guess = guessGameLoop(scanner, randomNumber);
            } while (guess != randomNumber);
        } catch (InputMismatchException e) {
            System.err.println("To nie była liczba!");
        } catch (NoSuchElementException | IllegalStateException e) {
            System.err.println("Koniec zabawy!");
        }
    }

    private static int guessGameLoop(Scanner scanner, int randomNumber) {
        System.out.print("Spróbuj zgadnąć: ");
        int guess = scanner.nextInt();

        if (guess > DICE_SIDES) {
            System.out.println("Dużo za wysoko!");
        } else if (guess > randomNumber) {
            System.out.println("Za wysoko!");
        } else if (guess < MIN_DICE_VALUE) {
            System.out.println("Dużo za nisko!");
        } else if (guess < randomNumber) {
            System.out.println("Za nisko!");
        } else {
            System.out.println("Brawo!");
        }

        return guess;
    }
}
