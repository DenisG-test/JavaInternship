public class LogicalOp {

    void countUp(int x){
        while(x <= 100){
            System.out.println(x);
            x++;
        }
    }

    void countDown(int x){
        while(x >= -100){
            System.out.println(x);
            x--;
        }
    }

    void counting(int x, int y){
        if(x < y){
            while(x <= y){
                System.out.println(x);
                x++;
            }
        }
        while(x >= y){
            System.out.println(x);
            x--;
        }
    }

    void countUpOrder(int x, int y){
        if(x < y){
            while(x < y){
                System.out.println(x);
                x++;
            }
        }
        while(y <= x){
            System.out.println(y);
            y++;
        }
    }

    void countUpEven(){
        int i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    void countUpOdd(){
        int i = 1;
        while(i <= 100){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }

    void calcul()
    {
        int i = 111;
        int count = 0;
        int suma = 0;
        while (i < 8899){
            suma += i;
            count++;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (float)suma/count);
    }

    float div7(int a, int b){
        int count = 0, suma = 0;
       if (a > b) {
           int temp = a;
           a = b;
           b = temp;
       }
       while (a <= b){
           if (a % 7 == 0){
               suma += a;
               count++;
           }
           a++;
       }
        return (float)suma/count;
    }

    void showFibonacci(){
        int x = 1, y = 20 , primu = 0, aldoilea = 1;
        while (x < y){
            System.out.print(primu + " ");
            int temp = primu + aldoilea;
            primu = aldoilea;
            aldoilea = temp;
            x++;
        }
    }

    void CozaLozaWoza(){
        int i = 1;
        while(i <= 110){
            String output = "";
            if( i % 3 == 0){
                output += "Coza";
                if( i % 5 == 0){
                    output += "CozaLoza";
                }
            }
            if(i % 5 == 0){
                output += "Loza";
                if( i % 7 == 0){
                    output += "WozaLoza";
                }
            }
            if(i % 7 == 0){
                output += "Woza";
                if( i % 3 == 0 ){
                    output += "CozaWoza";
                    if( i % 5 == 0){
                        output += "CozaLozaWoza";
                    }
                }
            }
            if(output.isEmpty()) output += i;
            System.out.print(output + " ");
            i++;
        }
    }

}
