import java.util.*;
public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int rem;
        int count = 0;
        System.out.println("Enter the element to be searched : ");
        int numSearched = sc.nextInt();
        while(num!=0 && num>0){
           rem = num%10;
           if(rem == numSearched)
           count++;
           num = num/10;
        }
        System.out.println(count);
    

    }
}