public class InvalidIndex extends Exception {

    public InvalidIndex(int index) {
        super("The index " + index + " is negative");
    }
}
