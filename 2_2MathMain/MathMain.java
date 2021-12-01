import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        long sum = 0;
        long product = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a begin number:");
        long begin = sc.nextLong();

        System.out.printf("Enter an end number:");
        long end = sc.nextLong();

        sum = getSumBetween(begin,end);
        System.out.printf("Sum between %d and %d : %d%n",begin,end,sum);

        product = getProductBetween(begin,end);
        System.out.printf("Product between %d and %d:%5n ",begin,end,product);
    }

    private static long getSumBetween(long x,long y){
        long a = 0;
        for(long m = 0 ;m < y-x+1;m++){
            a = a + x + m ;
        }
        return a;
    }

    private static long getProductBetween(long x,long y){
        long b = 1;
        for(long n = 0;n < y-x+1;n++){
            b=b*(x+n);
        }
        return b;
    }
}
