import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Volcano volcano = new Volcano("Volcano", 10);
        Random random = new Random();

        System.out.println("Adding measurements:");
        for (int i = 0; i < 7; i++) {
            int deg = random.nextInt(2000);
            boolean result = volcano.add(deg);
            System.out.println("Added: " + deg + " - Success: " + result);
        }

        volcano.print();
        
        System.out.println("\nFixing measurement at index 2 to 1500:");
        volcano.fix(2, 1500);
        volcano.print();

        System.out.println("\nAverage measurement: " + volcano.average());

        int value = 1000;
        System.out.println("\nMaximum measurement under " + value + ": " + volcano.maxUnder(value));

        System.out.println("\nDeleting measurement at index 1:");
        volcano.delete(1);
        volcano.print();

        System.out.println("\nDeleting all measurements:");
        volcano.deleteAll();
        volcano.print();

        System.out.println("\nVolcano summary:");
        System.out.println(volcano);
    }
}
