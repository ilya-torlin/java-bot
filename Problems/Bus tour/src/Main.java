import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();

        String result = "Will not crash";
        for (int i = 1; i <= bridges; i++) {
            if (scanner.nextInt() <= busHeight) {
                result = "Will crash on bridge " + i;
                break;
            }
        }
        System.out.println(result);
    }
}