import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();

        System.out.println(input.substring(startRange, ++endRange));
    }
}
