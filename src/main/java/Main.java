import classes.BinOps;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        System.out.println("Binary sum: " + binOps.sum("1011", "1110"));
        System.out.println("BInary mult: " + binOps.mult("100111", "101110"));
    }
}
