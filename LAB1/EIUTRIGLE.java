import java.util.Scanner;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = n - 1; i >= 2; i--) {
            int smallNum = 0;
            int largeNum = i - 1;
            while (smallNum < largeNum) {
                if (a[smallNum] + a[largeNum] > a[i]) {
                    for (int k = smallNum; k < largeNum; k++) {
                        count++;
                    }
                    largeNum--;
                } else {
                    smallNum++;
                }
            }
        }
        System.out.println(count);
    }
}
