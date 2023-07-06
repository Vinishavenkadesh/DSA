import java.util.*;

public class ArrayOutputDifferentMethod2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][3];
        System.out.println("Enter the Input : ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
                arr[row][col] = sc.nextLine();
        }
        System.out.println("Output : ");

        // printing different methods to bring output for 2D Array
        // Method 1 :

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Method 2 :

        for (int row = 0; row < arr.length; row++)
            System.out.println(Arrays.toString(arr[row]));
        System.out.println();
        // Method 3 :
        for (String[] str : arr)
            System.out.println(Arrays.toString(str));
    }
}