import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.println("Enter the Output : ");
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextLine();

        // printing different methods to bring output for 1D Array

        System.out.println("Output : ");
        // Method 1 :
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Method 2 :
        System.out.println(Arrays.toString(arr));

        // Method 3 :
        for (String num : arr)
            System.out.print(num + " ");

    }
}