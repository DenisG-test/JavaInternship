import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner     scan            = new Scanner(System.in);
        LogicalOp   objLogicalOp    = new LogicalOp();

        System.out.print("a = ");
        int a = scan.nextInt();

        System.out.print("b = ");
        int b = scan.nextInt();

        objLogicalOp.countUp(a);
        System.out.println("//////////////////////////");
        objLogicalOp.countDown(a);
        System.out.println("//////////////////////////");
        objLogicalOp.counting(a,b);
        System.out.println("//////////////////////////");
        objLogicalOp.countUpOrdered(a,b);
        System.out.println("//////////////////////////");
        objLogicalOp.countEvenUp();
        System.out.println("//////////////////////////");
        objLogicalOp.countOddUp();
        System.out.println("Suma numerelor de la " + a + " la 100 este: "  + objLogicalOp.addFromNumber(a));
        System.out.println("Media numerelor de la " + a + " la 100 este: " + objLogicalOp.avgFromNumber(a));
        objLogicalOp.desen();
        }
    }
