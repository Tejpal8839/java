package sorting;
import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        int[] a = {12, 3, 4, 5, 6, 22, 43, 53, 32, 45, 6, 7, 6, 33, 94};

        // You should print the array using Arrays.toString() for clarity
        System.out.println("Before Sorting: " + Arrays.toString(a));

        divide(a, 0, a.length - 1);

        System.out.println("After Sorting: " +  Arrays.toString(a));
    }

    public static void divide(int[] a, int start, int end) {
        if (start >= end) return; // Base condition to stop recursion

        int mid = start + (end - start) / 2;

        divide(a, start, mid);
        divide(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    public static void merge(int[] a, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];  
        int indx1 = start, indx2 = mid + 1, x = 0;

        while (indx1 <= mid && indx2 <= end) {
            if (a[indx1] <= a[indx2])
                merged[x++] = a[indx1++];
            else
                merged[x++] = a[indx2++];
        }

        while (indx1 <= mid)
            merged[x++] = a[indx1++];

        while (indx2 <= end)
            merged[x++] = a[indx2++];

        for (int i = start, j = 0; j < merged.length; i++, j++) {
            a[i] = merged[j];
        }
    }
}
