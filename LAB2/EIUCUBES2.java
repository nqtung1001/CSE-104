import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            long n = sc.nextLong();

            long left = 0, right = 2_000_000;
            long layer = 0;

            while (left <= right) {
                long mid = (left + right) / 2;
                long bricksNeeded = mid * (mid + 1) * (mid + 2) / 6;

                if (bricksNeeded <= n) {
                    layer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.print(layer);
            if (i < k - 1)
                System.out.print(" ");
        }
    }
}
