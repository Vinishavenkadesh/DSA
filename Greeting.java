import java.util.*;
public class Greeting{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        greeting(name);
      }
      static String greeting(String name){
           String greet = "Hello " + name;
           return greet;
      }
}