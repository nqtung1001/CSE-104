import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        for (long i = 0; i < T; i++) {
            long B = sc.nextLong();
            long R = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();

            long blueCost = Math.min(X, Y + Z);
            long redCost = Math.min(Y, X + Z);

            long totalCost = B * blueCost + R * redCost;
            System.out.println(totalCost);
        }
    }
}
