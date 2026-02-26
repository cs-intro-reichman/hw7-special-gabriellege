/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        In in = new In();
        int x = in.readInt();
        StdOut.println(toBinary(x));
    }

    /**
     * Returns the binary representation of the given integer, as a string of 0's
     * and 1's.
     */
    public static String toBinary(int x) {
        if (x == 0) {
            return "0";
        }
        if (x == 1) {
            return "1";
        }
        return toBinary(x / 2) + (x % 2); // becuse the base of binary is 2
    }
}
