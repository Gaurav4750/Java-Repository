import java.lang.*;
import java.util.*;
import array_world.*;

public class ArrayWorldRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        array_world aw = new array_world();

        aw.print_array(arr);
        System.out.println("\n-------------------------------------");

        aw.reverse_array(arr);
        System.out.println("\n-------------------------------------------");

        aw.Swap_Array(arr, num1, num2);
        System.out.println("\n---------------------------------------");

        // aw.range_array(arr, num1, num2);
        // System.out.println("\n-------------------------------");

        aw.odd_even_array(arr);
    }
}
