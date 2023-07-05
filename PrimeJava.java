import java.util.*;
public class PrimeJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        boolean ans = prime(num);
        System.out.println(ans);
    }
    static boolean prime(int num){
        if(num<=1)
        return false;
        int c = 2;
        while(c*c <= num){
            if(num%c == 0)
            return false;
            c++;
        }
        if(c*c > num)
        return true;
        else 
        return false;
    }
}
