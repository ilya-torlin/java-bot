import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minSleepHours = scanner.nextInt();
        int maxSleepHours = scanner.nextInt();
        int annSleepHours = scanner.nextInt();

        if (annSleepHours < minSleepHours) {
            System.out.print("Deficiency");
        } else if (annSleepHours > maxSleepHours) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
    }
}