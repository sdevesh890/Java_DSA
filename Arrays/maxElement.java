package Arrays;

public class maxElement {
    public static void main(String[] args) {
        int arr[] = {10,50,23,45,89,100};
        int max = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        System.err.println(max);
    }
}
