    import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scan           = new Scanner(System.in);
        Calculator objCalc     = new Calculator();
        LogicalOp objLogicalOp = new LogicalOp();

        System.out.print("a = ");
        int a = scan.nextInt();

        System.out.print("b = ");
        int b = scan.nextInt();

        System.out.print("c = ");
        int c = scan.nextInt();

        System.out.print("text = ");
        String text = scan.next();

        System.out.print("zapada = ");
        int zapada = scan.nextInt();

        System.out.print("varsta = ");
        int varsta = scan.nextInt();

        System.out.println("Rezultatul adunarii: "      + objCalc.adunare(a, b));
        System.out.println("Rezultatul scaderii: "      + objCalc.scadere(a, b));
        System.out.println("Rezultatul inmultire: "     + objCalc.inmultire(a, b));
        System.out.println("Rezultatul impartire: "     + objCalc.impartire(a, b));
        System.out.println("Rezultatul mediei: "        + objCalc.mediaAritmetica(a,b,c));
        System.out.println("Rezultatul comparatiei: "   + objLogicalOp.checkBiggerNumber(a,b));
        System.out.println(objLogicalOp.comparatie(text));
        System.out.println(objLogicalOp.prognozaNinsoare(zapada));
        System.out.println(objLogicalOp.comp3_4(c));
        System.out.println(objLogicalOp.switchCase(c));
        System.out.println("Numarul " + c + " este par: " + objLogicalOp.isNumberEven(c));
        System.out.println("Poate sa voteze daca are varsta de " + varsta + ": " + objLogicalOp.isEligibleToVote(varsta));
        System.out.println("Cel mai mare nr este: " + objLogicalOp.isTheBiggest(a,b,c));
    }
}