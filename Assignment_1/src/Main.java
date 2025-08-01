import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");
        System.out.println("Denis");

        float a = scanner.nextInt();
        float b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a / b);

        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (float)-3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

    }
}