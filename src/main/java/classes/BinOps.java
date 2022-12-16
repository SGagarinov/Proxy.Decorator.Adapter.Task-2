package classes;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/

        int val1 = Integer.parseInt(a, 2);
        int val2 = Integer.parseInt(b, 2);

        int sum = val1 + val2;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int val1 = Integer.parseInt(a, 2);
        int val2 = Integer.parseInt(b, 2);

        int mult = val1 * val2;
        return Integer.toBinaryString(mult);
    }
}
