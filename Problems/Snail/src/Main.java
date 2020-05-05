import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int dayCounter = 1;
        int height = a;
        while (height < h) {
            height += a;
            height -= b;
            dayCounter++;
        }
        System.out.println(dayCounter);
    }
}