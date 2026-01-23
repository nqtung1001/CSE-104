import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int result = (int) (1 + Math.ceil((double) (v - a) / (a - b)));
        System.out.println(result);
    }
}
