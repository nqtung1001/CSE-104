import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        long maxDif = 0;
        long minValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minValue > a[i])
                minValue = a[i];
            long currentDif = a[i] - minValue;
            if (currentDif > maxDif)
                maxDif = currentDif;
        }
        System.out.println(maxDif);
    }
}
