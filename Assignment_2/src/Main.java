import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNume();
        System.out.print("a = ");
        float a = scanner.nextInt();

        System.out.print("b = ");
        float b = scanner.nextInt();

        System.out.print("c = ");
        float c = scanner.nextInt();

        System.out.print("Introduce temperatura in Fahrenheit: ");
        float temperatura = scanner.nextInt();

        System.out.print("Introduce distanta in inch: ");
        float distanta = scanner.nextInt();

        System.out.print("Introduce ora: ");
        float ora = scanner.nextInt();

        System.out.print("Introduce minutele: ");
        float minute = scanner.nextInt();

        System.out.print("Introduce secundele: ");
        float secunde = scanner.nextInt();

        System.out.print("Introduce raza cercului: ");
        float raza = scanner.nextInt();
        System.out.println();

        System.out.println("Rezultatul adunarii: " + adunare(a, b));
        System.out.println("Rezultatul scaderii: " + scadere(a, b));
        System.out.println("Rezultatul inmultire: " + inmultire(a, b));
        System.out.println("Rezultatul impartire: " + impartire(a, b));
        System.out.println("Rezultatul mediei: " + mediaAritmetica(a,b,c));
        System.out.println("Restul impartirii: " + restulImpartirii(a,b));
        System.out.println(exercitiu1());
        System.out.println(exercitiu2());
        System.out.println(exercitiu3());
        System.out.println(exercitiu4());

        System.out.println("Temperatura in Celsius: " + toCelsius(temperatura));
        System.out.println("Distanta in metrii: " + toMetrii(distanta));
        vitezaMsKhMh((float) toMetrii(distanta), ora, minute, secunde );
        cercAriePerimetru((raza));
        desen();
    }

/* Exercitiul 1*/
    public static void  printNume(){
        System.out.println("Hello \n Denis");
    }
    public static float exercitiu1(){
        return -5 + 8 * 6;
    }
    public static float exercitiu2(){
            return (55 + 9) % 9;
    }
    public static float exercitiu3(){
            return (20 + (float)-3 * 5 / 8);
    }
    public static float exercitiu4(){
            return 5 + 15 / 3 * 2 - 8 % 3;
    }

/*Exercitiul 2*/
    public static float adunare  (float a, float b){
    return a + b;
}
    public static float impartire(float a, float b){
            return a / b;
        }
    public static float scadere  (float a, float b){ return a - b;}
    public static float inmultire(float a, float b){ return a * b;}

/*Exercitiul 3*/

    public static void desen() {
    System.out.println(" x\"\"\"\"\"x ");
    System.out.println("[| o o |]");
    System.out.println(" |  ^  |");
    System.out.println(" | '-' |");
    System.out.println(" +-----+");
    }


/*Exercitiul 4*/

    public static float mediaAritmetica(float a, float b, float c){
        return ((a + b + c) / 3);
    }

/*Exercitiul 5*/

    public static float restulImpartirii(float a, float b){
        return a % b;
    }

/*Exercitiul 6*/

    public static float toCelsius(float temperatura){
        return (temperatura - 32) * 5 / 9;
    }

/*Exercitiul 7*/

    public static double toMetrii(float distanta){ return distanta * 39.37; }

/*Exercitiul 8*/

    public static void vitezaMsKhMh(float metrii, float ora, float minute, float secunde){
        float timp_ora = ora + minute / 60 + secunde / 3600;
        System.out.println("Metrii/Secunda: " + metrii / timp_ora/3600);
        System.out.println("Kilo/Ora: " + metrii / 1000 /timp_ora);
        System.out.println("Miles/Ora: " + metrii / 1609 / timp_ora);
    }

/*Exercitiul 9*/

    public static void cercAriePerimetru( float raza){
        System.out.println("Aria: " + raza*raza*3.14);
        System.out.println("Perimetrul: " + 2*3.14*raza);
    }
    }