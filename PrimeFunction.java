import java.util.*;

public class PrimeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);
    }

    public static void isPrime(int n) {

        if (n <= 1)
            System.out.println("Number is Prime");
        if (n % 2 == 0)
            System.out.println("Number is not a Prime number");
        else {
            int flag = 0;
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not Prime");
                    flag = 1;
                }
            }
                if (flag == 0)
                    System.out.println("Number is prime");
            
        }
       
    }
}
