import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxDiv = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number >= maxDiv) {
                maxDiv = number;
            }
        }
        System.out.println(maxDiv);
    }
}