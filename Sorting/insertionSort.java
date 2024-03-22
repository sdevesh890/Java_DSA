package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,-1};
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            int j = i-1;
            int curr = arr[i];
            while (j>=0 && arr[j]>=curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        for(int i:arr)
        System.err.print(i+" ");
    }
}
