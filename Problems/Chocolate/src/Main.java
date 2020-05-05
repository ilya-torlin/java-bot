import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int kModM = k % m;
        int kModN = k % n;
        if (m * n < k || k < m && k < n) {
            System.out.println("NO");
        } else if (kModM == 0 && kModM < n || kModN == 0 && kModN < m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}