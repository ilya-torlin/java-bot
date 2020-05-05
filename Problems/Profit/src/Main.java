import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int years = 0;
        double sum = m;
        while (sum < k) {
            sum += (double) sum * p / 100;
            years++;
        }
        System.out.println(years);
    }
}