import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        double totalDiscount = 0;
        int aMil = 1_000_000;
        double[] money = new double[] { 5 * aMil, 20 * aMil, 100 * aMil, 300 * aMil, 600 * aMil, 900 * aMil,
                Long.MAX_VALUE };
        double[] discountRate = new double[] { 0.03, 0.05, 0.07, 0.10, 0.12, 0.15 };
        for (int i = 0; i < discountRate.length; i++) {
            if (N > money[i]) {
                if (N > money[i + 1]) {
                    totalDiscount += (money[i + 1] - money[i]) * discountRate[i];
                } else {
                    totalDiscount += (N - money[i]) * discountRate[i];
                }
            }
        }
        System.out.println(Math.round(N - totalDiscount));
    }
}
