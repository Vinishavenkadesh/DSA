import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int flag = 0;

        if (num == 1 || num == 0)
            System.out.println(num + " is a Prime number");
        else if (num % 2 == 0)
            System.out.println(num + " is not a Prime number");
        else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a Prime number");
                    flag = 1;
                }
            }
            if (flag == 0)
                System.out.println(num + " is a Prime number");
        }

    }
}
