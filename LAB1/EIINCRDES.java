import java.util.Scanner;

public class EIINCRDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                increasing = false;
            }
            if (a[i] >= a[i - 1]) {
                decreasing = false;
            }
        }

        if (increasing) {
            System.out.println("increasing");
        } else if (decreasing) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
    }
}
