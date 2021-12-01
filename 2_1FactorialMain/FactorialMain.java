import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        long result = 1;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Factorial of %d = %d\n",i, getFactorial(i));
        }
    }
        private static long getFactorial(final int n){
            if(n <= 1)
                return 1;
            else
                return n *getFactorial(n - 1);
    }
}
