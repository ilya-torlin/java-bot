import java.util.*;

class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String room = scanner.nextLine();

        switch (room) {
            case "triangle":
                System.out.println(getTriangleArea());
                break;
            case "rectangle":
                System.out.println(getRectangleArea());
                break;
            case "circle":
                System.out.println(getCircleArea());
                break;
        }
    }

    private static double getCircleArea() {
        double r = scanner.nextDouble();
        return 3.14 * r * r;
    }

    private static double getRectangleArea() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        return a * b;
    }

    private static double getTriangleArea() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}