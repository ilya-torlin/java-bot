import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean AisNegative = a > 0 && b <= 0 && c <= 0;
        boolean BisNegative = a <= 0 && b > 0 && c <= 0;
        boolean CisNegative = a <= 0 && b <= 0 && c > 0;
        System.out.print(AisNegative || BisNegative || CisNegative);
    }
}