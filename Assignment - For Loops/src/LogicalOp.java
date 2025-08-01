public class LogicalOp {

    void countUp(int x){
        for(int j = x; j <= 100; j++){
            System.out.println(j);
        }
    }

    void countDown(int x){
        for(int j = x; j >= -100; j--){
            System.out.println(j);
        }
    }

    void counting(int x, int y){
        if(x < y){
        for(int j = x; j <= y; j++){
            System.out.println(j);
        }}
        for(int j = x; j >= y; j--){
            System.out.println(j);
        }
    }

    void countUpOrdered(int x, int y){
        if(x < y){
            for(int j = x; j <= y; j++){
                System.out.println(j);
            }
        }
        for(int j = y; j <= x; j++){
            System.out.println(j);
        }
    }

    void countEvenUp(){
        for(int j = 1; j <= 100; j++){
            if(j % 2 == 0){
                System.out.println(j);
            }
        }
    }
    void countOddUp(){
        for(int j = 1; j <= 100; j++){
            if(j % 2 != 0){
                System.out.println(j);
            }
        }
    }
    int addFromNumber(int x){
        int sum = 0;
        for(int j = x; j <= 100; j++){
            sum += j;
        }
        return sum;
    }

    float avgFromNumber(int x){
        int sum = 0;
        int index = 0;
        for(int j = x; j <= 100; j++){
            sum += j;
            index++;
        }
        return (float)sum / index;
    }

    void desen(){
        int x = 8;
        for(int j = 1; j <= 8; j++){
            for(int i = 1; i <= 8 - j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
