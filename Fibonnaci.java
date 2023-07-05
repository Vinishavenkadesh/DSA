import java.util.*;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 2;
        int num = sc.nextInt();
        // for(int i = 2;i<=num;i++)
        // {
        // c = a+b;
        // a = b;
        // b = c;
        // }
        while (count <= num) {
            c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(c);
    }
}
