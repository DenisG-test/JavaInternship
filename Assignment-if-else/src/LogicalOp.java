public class LogicalOp {
    int checkBiggerNumber(int a, int b){
        /* if (a > b) return a;
            return b;*/
        return a > b ? a : b;
    }
    String comparatie(String text){
        if (text.equals("Evozon")) return "Learning text comparison";
        return "Got to try some more";
    }

    String prognozaNinsoare(int zapada){
        if (zapada > 8 || zapada == 6) return "The amount of snow this winter was(cm): " + zapada;
        return "The forecast snow is(cm): "  + zapada;
    }

    String comp3_4(float a){
        if(a > 3 && a!= 4) return "The number is greater than 3 and not equal to 4";
        else if (a == 4) return "The number is equal to 4";
        return "The number is lower than 3";
    }

    String switchCase(int x){
        return switch (x) {
            case 0 -> "The number is:  0 !";
            case 1 -> "The number is:  1 !";
            case 2 -> "The number is:  2 !";
            case 3 -> "The number is:  3 !";
            case 4 -> "The number is:  4 !";
            case 5 -> "The number is:  5 !";
            case 6 -> "The number is:  6 !";
            case 7 -> "The number is:  7 !";
            case 8 -> "The number is:  8 !";
            case 9 -> "The number is:  9 !";
            default -> "The number is bigger than 9 !";
        };
    }

    boolean isNumberEven(int x){
        return x % 2 == 0;
    }

    boolean isEligibleToVote(int x){
        return x >= 18;
    }

    int isTheBiggest(int a, int b, int c){
        if (a > b && a > c) return a;
        if (b > c && b > a) return b;
        if (c > a && c > b) return c;
        return a;
    }
}
