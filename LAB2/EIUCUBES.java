import java.util.Scanner;

public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of bricks
        int layer = 1;
        while (n >= layer * (layer + 1) / 2) {
            n -= layer * (layer + 1) / 2;
            layer++;
        }
        System.out.println(layer - 1);
    }
}
