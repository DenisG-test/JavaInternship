import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LogicalOp objLogicalOp = new LogicalOp();

        System.out.print("a = ");
        int a = scan.nextInt();

        System.out.print("b = ");
        int b = scan.nextInt();

        objLogicalOp.countUp(a);
        System.out.println("////////////////////////////");
        objLogicalOp.countDown(a);
        System.out.println("////////////////////////////");
        objLogicalOp.counting(a, b);
        System.out.println("////////////////////////////");
        objLogicalOp.countUpOrder(a, b);
        System.out.println("////////////////////////////");
        objLogicalOp.countUpEven();
        System.out.println("////////////////////////////");
        objLogicalOp.countUpOdd();
        System.out.println("////////////////////////////");
        objLogicalOp.calcul();
        System.out.println("Suma numerelor divizibile cu 7 este: " + objLogicalOp.div7(a, b));
        objLogicalOp.showFibonacci();
        System.out.println();
        objLogicalOp.CozaLozaWoza();



    }
}