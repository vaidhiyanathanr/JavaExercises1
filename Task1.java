
public class Task1 {
/**
 * TODO: For each use of the variable `total', what value does it hold.
 * Explain what happens to the value stored during each use of the variable `total'.
 */
    public static void main ( String [] args ) {
// Variable declarations .
        final double CAN_VOLUME = 0.355;
        final double BOTTLE_VOLUME = 2;
        int cans = 6;
        int bottles = 1;
        double total = 0;
// Compute output .
        total = bottles * BOTTLE_VOLUME ;
        total = total + cans * CAN_VOLUME ;
        total = total + total ;
    }
}
