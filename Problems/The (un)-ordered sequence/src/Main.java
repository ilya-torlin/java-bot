import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old;
        boolean ascOrdered = true;
        boolean descOrdered = true;
        int number = scanner.nextInt();
        while (true) {
            old = number;
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (descOrdered && number < old) {
                descOrdered = false;
                continue;
            }
            if (ascOrdered && number > old) {
                ascOrdered = false;
                continue;
            }

            if (!descOrdered && !ascOrdered) {
                break;
            }
        }
        System.out.println(ascOrdered || descOrdered);
    }
}