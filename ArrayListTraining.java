import java.util.*;

class ArrayListTraining {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);

        // Initialization
        for (int i = 0; i < 3; i++)
            list.add(new ArrayList<>());

        // Declaring Value
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                list.get(i).add(j, sc.nextInt());

        System.out.println(list);
    }
}