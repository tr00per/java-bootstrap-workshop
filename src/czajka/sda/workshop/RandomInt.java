package czajka.sda.workshop;

public class RandomInt {
    public static void main(String args[]) {
        System.out.println("Wylosowałem: " + Math.random());
        System.out.println("Wylosowałem: " + Math.random() * 10);
        System.out.println("Wylosowałem: " + Math.floor(Math.random() * 10));
        System.out.println("Wylosowałem: " + (int) Math.floor(Math.random() * 10));
    }
}
