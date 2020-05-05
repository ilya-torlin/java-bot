import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        long result = 1;

        for (int i = start; i < stop; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}