import java.lang.*;
import java.util.*;

public class array_world {

    public void print_array(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public void reverse_array(int[] ar) {

        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
    }

    public void Swap_Array(int[] ar, int a, int b) {

    if ((a >= 0 && a < ar.length) && (b > 0 && b < ar.length)) {
    int temp = ar[a];
    ar[a] = ar[b];
    ar[b] = temp;
    }
    print_array(ar);
    }

    public void odd_even_array(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();

        for (int j = 0; j < ar.length; j++) {
            if (ar[j] % 2 != 0) {
                System.out.print(ar[j] + " ");
            }
        }
        System.out.println();
    }

    // public void range_array(int[] ar, int k, int l) {
    //     if (k < ar.length && l < ar.length) {
    //         while (k > l) {
    //             int temp = ar[k];
    //             ar[k] = ar[l];
    //             ar[l] = temp;
    //             k++;
    //             l--;
    //         }
    //         print_array(ar);
    //     } else {
    //         System.out.println("The index to be swapped are out of range");
    //     }
    // }
}