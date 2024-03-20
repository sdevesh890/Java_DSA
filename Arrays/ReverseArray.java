package Arrays;

public class ReverseArray {
    public static void swap(int arr[],int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        
        int arr[] = {12,45,7,8,1,55,41};
        int start = 0;
        int end = arr.length-1;

        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }

        for(int i : arr)
        {
            System.err.print(i+" ");
        }
    }
}
