import java.util.*;
public class fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch (fruit) {
            case "mango":
                System.out.println("Nice");
                break;
            case "apple":
                System.out.println("Super");
                break;
            case "orange":
                System.out.println("good");
                break;
        
            default:
                System.out.println("Invalid entry");
        }
    }
}
