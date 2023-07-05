import java.util.*;

public class Calculator{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true){
        int ans = 0;
        System.out.println("Enter the operator : ");
        char ch = sc.next().trim().charAt(0);
        if(ch == '+' ||ch == '-' ||ch == '*' ||ch == '/' ||ch == '%'){
          System.out.println("Enter two number :");
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          if(ch == '+')
          ans = num1+num2;
          if(ch == '-')
          ans = num1-num2;
          if(ch == '*')
          ans = num1*num2;
          if(ch == '%')
          ans = num1%num2;
          if(ch == '/')
          if(num2!=0)
          ans = num1/num2;
          else
          System.out.println("Enter valid operator :");
        }
        else if (ch == 'x' || ch == 'X') {
        break;
        }
        else {
           System.out.println("Invalid Operater."); 
        }
        System.out.println(ans);
      }
    }
}
