package Sorting;

public class bubbleSort {

    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,112,22,11,555,52,444,11};
        int n = arr.length;

        for(int turn=1; turn<n; turn++)
        {
            for(int j=0; j<n-turn; j++)
            {   
                if(arr[j+1]<arr[j])
                {
                    swap(arr, j,j+1);
                }
            }
        }

        for(int i:arr)
        {
            System.err.print(i+" ");
        }
    }
}
