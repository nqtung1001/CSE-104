import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String[] Y = { "cai", "tro", "giua", "ap ut", "ut" };
        String[] Z = { "trai", "phai" };

        int pos = (int) (n % 18);
        if (pos == 0)
            pos = 18;

        int yIndex = 0;
        int zIndex = 0;

        if (pos >= 1 && pos <= 5) {
            zIndex = 0;
            yIndex = pos - 1;
        } else if (pos >= 6 && pos <= 10) {
            zIndex = 1;
            yIndex = 10 - pos;
        } else if (pos >= 11 && pos <= 14) {
            zIndex = 1;
            yIndex = pos - 10;
        } else {
            zIndex = 0;
            yIndex = 19 - pos;
        }
        System.out.println("Ngon " + Y[yIndex] + " cua ban tay " + Z[zIndex]);

    }
}
