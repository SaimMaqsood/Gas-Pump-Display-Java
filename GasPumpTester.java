/**
This program tests the GasPumpDisplay class.
*/
public class GasPumpTester {
    public static void main(String[] args) {
        GasPumpDisplay d = new GasPumpDisplay(3);
        int count = 0;
        while (d.hasMoreElements()) {
            System.out.print(d.nextElement() + " ");
            count++;
            if (count % 10 == 0) System.out.println();
        }
        System.out.print(d.nextElement());  // Print the final value (444)
        System.out.println("\nSimulation complete.");
    }
}
