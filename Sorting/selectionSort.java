package Sorting;
public class selectionSort {
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,-7,4,8,2,6};
        int n = arr.length;

        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            swap(arr,i,min);
        }

        for(int i:arr)
        System.err.print(i+" ");
    }
}
