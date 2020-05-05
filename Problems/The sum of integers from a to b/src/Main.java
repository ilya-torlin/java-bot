import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        int acc = 0;
        for (int i = start; i <= stop; i++) {
            acc += i;
        }
        System.out.println(acc);
    }
}